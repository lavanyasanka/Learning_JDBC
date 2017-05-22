package jdbc_learning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Tlets_Check_CrudExample extends JdbcUtility{
	
	public List select_records() throws Exception{
		Connection con = getConnection();
		List rows = new ArrayList();

		Statement stmt= con.createStatement();
		//bindVariablesArrayList.add( new Integer( idPerson ) );
		String sql="SELECT R.ID_TLETS_CHECK, R.ID_LAST_UPDATE_PERSON, R.DT_CREATED, R.ID_CREATED_PERSON, R.ID_PERSON, R.ID_CASE, R.ID_STAGE, R.CD_TLETS, R.DT_CONDUCTED, R.IND_INVALID, R.DT_INVALID FROM TLETS_CHECK R WHERE R.ID_PERSON = 90849603";
		ResultSet rs = stmt.executeQuery(sql);

	
		while(rs.next()){

			Tlets_Check_CrudTest ct = new Tlets_Check_CrudTest();
			ct.setID_TLETS_CHECK(rs.getInt("ID_TLETS_CHECK"));
			ct.setID_LAST_UPDATE_PERSON(rs.getInt("ID_LAST_UPDATE_PERSON"));
			ct.setDT_CREATED(rs.getString( "DT_CREATED" ));
			ct.setID_CREATED_PERSON(rs.getInt("ID_CREATED_PERSON"));
			ct.setID_PERSON(rs.getInt( "ID_PERSON" ));
			ct.setID_CASE(rs.getInt( "ID_CASE" ));
			ct.setID_STAGE(rs.getInt( "ID_STAGE" ));
			ct.setCD_TLETS(rs.getString( "CD_TLETS" ));
			ct.setDT_CONDUCTED(rs.getString( "DT_CONDUCTED" ));
			ct.setIND_INVALID(rs.getNString( "IND_INVALID" ));
			ct.setDT_INVALID(rs.getString( "DT_INVALID" ));
			rows.add(ct);
		}
		con.close();
		return rows;
		
		
	}

	public void insert_record() throws Exception{
		Connection con = getConnection();

		String sql = "INSERT INTO TLETS_CHECK ( ID_LAST_UPDATE_PERSON, ID_CREATED_PERSON, ID_PERSON, ID_CASE, ID_STAGE, CD_TLETS, DT_CONDUCTED, IND_INVALID, DT_INVALID ) values ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";
	    
		PreparedStatement statement = con.prepareStatement(sql);
		
		statement.setInt(1, 90849603);
		statement.setInt(2, 90849603);
		statement.setInt(3, 90849603);
		statement.setInt(4, 45112667);
		statement.setInt(5, 68494160);
		statement.setString(6,"10");
		statement.setString(7,"05-MAY-17");
		statement.setString(8,"N");
		statement.setString(9,"05-MAY-17");
		
		
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}
		con.close();
	}
	
	public void update_record() throws Exception{
		
		Connection con = getConnection();
		Tlets_Check_CrudTest  ct = new Tlets_Check_CrudTest();

		String sql = "UPDATE TLETS_CHECK SET ID_LAST_UPDATE_PERSON = ?,ID_PERSON = ? WHERE ID_TLETS_CHECK = 27999";

		PreparedStatement statement = con.prepareStatement(sql);
		 statement.setInt(1, 2271 );
	     statement.setInt(2, 90849603);

		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
	      	System.out.println("A user was updated successfully!");
			}
			con.close();
 	}
	
	public void delete_record() throws Exception{

		Connection con = getConnection();
		Tlets_Check_CrudTest  ct = new Tlets_Check_CrudTest();
		String sql = "delete from TLETS_CHECK where ID_TLETS_CHECK =28014";
		PreparedStatement statement = con.prepareStatement(sql);
		int result = statement.executeUpdate();
		if (result > 0) {
	    System.out.println("Record deleted successfully!");
	}
		con.close();	
	}


}
