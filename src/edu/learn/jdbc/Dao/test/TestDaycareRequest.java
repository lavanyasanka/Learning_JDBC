package edu.learn.jdbc.Dao.test;

import java.util.List;

import edu.learn.jdbc.Dao.implementation.Daycare_requestDaoImpl;
import edu.learn.jdbc.Dao.model.Daycare_request;


public class TestDaycareRequest {
	public static void main(String[] args) throws Exception{
		Daycare_requestDaoImpl r1 = new Daycare_requestDaoImpl();
/*		
		//***************SELECT - all records*******************
		Daycare_request req1 = new Daycare_request();
		req1.setID_CREATED_PERSON(24813632);
		List<Daycare_request> list = r1.getAllRequests();
		list.forEach(ls -> System.out.println(ls));
		*/
		
		//***************SELECT - one record*******************		
		
/*		Daycare_request dayr = r1.getRequest(1189881);
			System.out.println(dayr);*/
			
			
	//**************************update ****************
/*		Daycare_request req = new Daycare_request(1189922);
		req.setID_DAYCARE_REQUEST(1189922);
		req.setID_LAST_UPDATE_PERSON(2271);//24813632
	    r1.updateDaycare_request(req1);
*/
	
/*		// ***********for delete******************
		Daycare_request req1 = new Daycare_request(1189939);//1189939
		System.out.println("rows"+ req1);
		 r1.deleteDaycare_request(req1);
*/
		 
/*		 //*********************for insert******************
		 Daycare_request req1 = new Daycare_request();
		// req1.setDT_CREATED(todate('25/05/2017', 'DD/MM/YYYY'));
		 req1.setID_LAST_UPDATE_PERSON(24813632);
		 req1.setID_CREATED_PERSON(24813632);
		 req1.setID_CASE(25852854);
		 req1.setID_STAGE(68326964);
		 req1.setID_EVENT(266660193);
		 req1.setIND_INVALID("Y");
		 req1.setDT_INVALID(null);
		 req1.setTXT_COMMENT_INVALID("something something something");
		 r1.insertDaycare_request(req1);*/
	}

}
