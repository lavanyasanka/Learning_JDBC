package jdbc_learning;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcess extends JdbcUtility{

	public static void main(String[] args) throws Exception {
		
		Connection con = getConnection();
		Statement stmt = con.createStatement();

	      con.setAutoCommit(false);

	      printRows( stmt );

	      String SQL = "INSERT INTO TLETS_CHECK ( ID_LAST_UPDATE_PERSON, ID_CREATED_PERSON, ID_PERSON, ID_CASE, ID_STAGE, CD_TLETS, DT_CONDUCTED, IND_INVALID, DT_INVALID ) " +
	      		 "VALUES( 2271, 90849603, 90849603, 45112667, 68494160, '10', '23-MAY-17','N', '23-MAY-17')";

	      stmt.addBatch(SQL);

	      SQL = "INSERT INTO TLETS_CHECK ( ID_LAST_UPDATE_PERSON, ID_CREATED_PERSON, ID_PERSON, ID_CASE, ID_STAGE, CD_TLETS, DT_CONDUCTED, IND_INVALID, DT_INVALID ) " +
		      		 "VALUES( 90849603, 2271, 90849603, 45112667, 68494160, '10', '23-MAY-17','N', '23-MAY-17')";

	      stmt.addBatch(SQL);


	      SQL = "UPDATE TLETS_CHECK SET ID_LAST_UPDATE_PERSON = 2271,ID_PERSON = 2271 WHERE ID_TLETS_CHECK = 28056";
	           
	      stmt.addBatch(SQL);

	      int[] count = stmt.executeBatch();
	      
	      con.commit();

	      
	      printRows( stmt );
	      con.close();
		
	}
	public static void printRows(Statement stmt) throws SQLException{
		   System.out.println("Displaying available rows...");
		   // Let us select all the records and display them.
		   String sql = "SELECT ID_TLETS_CHECK, ID_LAST_UPDATE_PERSON, DT_CREATED, ID_CREATED_PERSON, ID_PERSON FROM TLETS_CHECK WHERE ID_PERSON = 90849603";
		   ResultSet rs = stmt.executeQuery(sql);

		   while(rs.next()){
		      //Retrieve by column name
		      int ID_TLETS_CHECK  = rs.getInt("ID_TLETS_CHECK");
		      int ID_LAST_UPDATE_PERSON  = rs.getInt("ID_LAST_UPDATE_PERSON");
		      int ID_CREATED_PERSON  = rs.getInt("ID_CREATED_PERSON");
		      int ID_PERSON  = rs.getInt("ID_PERSON");
		      String DT_CREATED = rs.getString("DT_CREATED");


		      //Display values
		      System.out.print("ID_TLETS_CHECK :" + ID_TLETS_CHECK);
		      System.out.print(", ID_LAST_UPDATE_PERSON: " + ID_LAST_UPDATE_PERSON);
		      System.out.print(", ID_CREATED_PERSON: " + ID_CREATED_PERSON);
		      System.out.println(", ID_PERSON: " + ID_PERSON);
		      System.out.println(", DT_CREATED: " + DT_CREATED);
		   }
		   System.out.println();
		   rs.close();
		}//end printRows()
}
