package edu.learn.jdbc.Dao.implementation;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import edu.learn.jdbc.Dao.JdbcUtility;

import edu.learn.jdbc.Dao.Daycare_requestDao;
import edu.learn.jdbc.Dao.model.Daycare_request;

public class Daycare_requestDaoImpl extends JdbcUtility implements Daycare_requestDao {


	List<Daycare_request> daycareRequests;
	
/*	public Daycare_requestDaoImpl(){
		 daycareRequests = new ArrayList<Daycare_request>();
		 Daycare_request req1 = new Daycare_request(1189924);
		 Daycare_request req2 = new Daycare_request(1189922);
		 daycareRequests.add(req1);
		 daycareRequests.add(req2);
	}*/

		public List<Daycare_request> getAllRequests() {
		
		try {
			Daycare_request dr = new Daycare_request();
			List<Daycare_request> list = new ArrayList<Daycare_request>();
			Connection con = getConnection();
			
			if(con != null){
				System.out.println("Connection is succesfull");
			}
			String sql = "SELECT ID_DAYCARE_REQUEST, DT_LAST_UPDATE, ID_LAST_UPDATE_PERSON, DT_CREATED, ID_CREATED_PERSON, ID_CASE, ID_STAGE, ID_EVENT, IND_INVALID, DT_INVALID, TXT_COMMENT_INVALID " +
					"FROM DAYCARE_REQUEST WHERE ID_CREATED_PERSON = 24813632"; //+dr.getID_CREATED_PERSON(); //24813632
			
			//PreparedStatement stmt = con.prepareStatement(sql);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next())
			{
				dr.setID_DAYCARE_REQUEST(rs.getInt("ID_DAYCARE_REQUEST"));
				dr.setDT_LAST_UPDATE(rs.getDate("DT_LAST_UPDATE"));
				dr.setID_LAST_UPDATE_PERSON(rs.getInt("ID_LAST_UPDATE_PERSON"));
				dr.setDT_CREATED(rs.getDate("DT_CREATED"));
				dr.setID_CREATED_PERSON(rs.getInt("ID_CREATED_PERSON"));
				dr.setID_CASE(rs.getInt("ID_CASE"));
				dr.setID_STAGE(rs.getInt("ID_STAGE"));
				dr.setID_EVENT(rs.getInt("ID_EVENT"));
				dr.setIND_INVALID(rs.getString("IND_INVALID"));
				dr.setDT_INVALID(rs.getDate("DT_INVALID"));
				dr.setTXT_COMMENT_INVALID(rs.getString("TXT_COMMENT_INVALID"));
				list.add(dr);
			}
			con.close();
			return list;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Daycare_request getRequest(int ID_DAYCARE_REQUEST) {
		try {
			Connection con = getConnection();
			if(con != null){
				System.out.println("Connection is succesfull");
			}
			Statement stmt = con.createStatement();
			Daycare_request dr = new Daycare_request();
			String sql = "SELECT ID_DAYCARE_REQUEST, DT_LAST_UPDATE, ID_LAST_UPDATE_PERSON, DT_CREATED, ID_CREATED_PERSON, ID_CASE, ID_STAGE, ID_EVENT, IND_INVALID, DT_INVALID, TXT_COMMENT_INVALID " +
			"FROM DAYCARE_REQUEST WHERE ID_DAYCARE_REQUEST = 1189922";//1189922
			ResultSet rs= stmt.executeQuery(sql);
			while (rs.next()){
	
				dr.setID_DAYCARE_REQUEST(rs.getInt("ID_DAYCARE_REQUEST"));
				dr.setDT_LAST_UPDATE(rs.getDate("DT_LAST_UPDATE"));
				dr.setID_LAST_UPDATE_PERSON(rs.getInt("ID_LAST_UPDATE_PERSON"));
				dr.setDT_CREATED(rs.getDate("DT_CREATED"));
				dr.setID_CREATED_PERSON(rs.getInt("ID_CREATED_PERSON"));
				dr.setID_CASE(rs.getInt("ID_CASE"));
				dr.setID_STAGE(rs.getInt("ID_STAGE"));
				dr.setID_EVENT(rs.getInt("ID_EVENT"));
				dr.setIND_INVALID(rs.getString("IND_INVALID"));
				dr.setDT_INVALID(rs.getDate("DT_INVALID"));
				dr.setTXT_COMMENT_INVALID(rs.getString("TXT_COMMENT_INVALID"));
				}
			con.close();
			return dr;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void updateDaycare_request(Daycare_request daycareRequest) {
		PreparedStatement stmt = null;
		try {
			Connection con = getConnection();
			//String sql = " UPDATE DAYCARE_REQUEST SET ID_LAST_UPDATE_PERSON =" +daycareRequest.getID_LAST_UPDATE_PERSON() +" WHERE ID_DAYCARE_REQUEST = "+ daycareRequest.getID_DAYCARE_REQUEST();
			String sql = " UPDATE DAYCARE_REQUEST SET ID_LAST_UPDATE_PERSON =? WHERE ID_DAYCARE_REQUEST = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, daycareRequest.getID_LAST_UPDATE_PERSON());
			stmt.setInt(2, daycareRequest.getID_DAYCARE_REQUEST());
			int count = stmt.executeUpdate();	        
				System.out.println(count +"Rows affected.......");
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteDaycare_request(Daycare_request daycareRequest) {

		try {
			Connection con = getConnection();
			String sql = "DELETE FROM DAYCARE_REQUEST WHERE ID_DAYCARE_REQUEST = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, daycareRequest.getID_DAYCARE_REQUEST() );
			int count = pstmt.executeUpdate();
			System.out.println(count + "rows got deleted ");
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void insertDaycare_request(Daycare_request daycareRequest) {
		try {
			Connection con = getConnection();
			String sql = "INSERT INTO DAYCARE_REQUEST ( ID_LAST_UPDATE_PERSON, DT_CREATED, ID_CREATED_PERSON, ID_CASE, ID_STAGE, ID_EVENT, IND_INVALID, DT_INVALID, TXT_COMMENT_INVALID)"+
			"VALUES (? , ? , ? , ?, ? , ? , ?, ?, ? )";
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1, daycareRequest.getID_LAST_UPDATE_PERSON());
			psmt.setDate(2, (Date) daycareRequest.getDT_CREATED());
			psmt.setInt(3, daycareRequest.getID_CREATED_PERSON());
			psmt.setInt(4, daycareRequest.getID_CASE());
			psmt.setInt(5, daycareRequest.getID_STAGE());
			psmt.setInt(6, daycareRequest.getID_EVENT());
			psmt.setString(7, daycareRequest.getIND_INVALID());
			psmt.setDate(8, (Date) daycareRequest.getDT_INVALID());
			psmt.setString(9, daycareRequest.getTXT_COMMENT_INVALID());
			int count = psmt.executeUpdate();
			System.out.println(count + "rows inserted.....");
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
