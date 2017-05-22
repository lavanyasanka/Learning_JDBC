package jdbc_learning;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Timestamp;

import oracle.sql.TIMESTAMP;

public class Daycare_Callable extends JdbcUtility {
	
	public static void main(String[] args) throws Exception {
		

        CallableStatement   callableStatement   = null;
        Timestamp                approvalDate        = null;

		Connection con = getConnection();
		
		 callableStatement   = con.prepareCall( "{call DAYCARE_DECISION.getApprovalDate( ?,?)}" );
		 callableStatement.setInt(1, 1481);//1189921
		 callableStatement.registerOutParameter(2, java.sql.Types.TIMESTAMP);

		 callableStatement.execute();
         approvalDate    = callableStatement.getTimestamp(2);

      System.out.println("Approval Date is : " + approvalDate);




	}

}
