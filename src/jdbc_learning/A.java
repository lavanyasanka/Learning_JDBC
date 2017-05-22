package jdbc_learning;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class A extends JdbcUtility {
	public static void main(String[] args) throws Exception {
		
	
	Connection con = getConnection();
	Statement stmt= con.createStatement();
	String sql="select id_wkld_stage, nm_wkld_stage from workload where cd_mobile_status = 'OT' and id_wkld_person =39070214";
	ResultSet rs = stmt.executeQuery(sql);
	
	//.execute(sql);
	while(rs.next()){
		int ID_STAGE = rs.getInt("ID_WKLD_STAGE"); 
		String NM_WKLD_STAGE = rs.getString( 2);
	System.out.println("Stage id = " +ID_STAGE + " Name of the Stage is : "+NM_WKLD_STAGE);

	}
	}
}
	
