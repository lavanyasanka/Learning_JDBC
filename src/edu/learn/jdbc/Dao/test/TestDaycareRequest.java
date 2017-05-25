package edu.learn.jdbc.Dao.test;

import java.util.List;

import edu.learn.jdbc.Dao.implementation.Daycare_requestDaoImpl;
import edu.learn.jdbc.Dao.model.Daycare_request;


public class TestDaycareRequest {
	public static void main(String[] args) throws Exception{
		Daycare_requestDaoImpl r1 = new Daycare_requestDaoImpl();
		//List<Daycare_request> list = r1.getAllRequests();
		//list.forEach(ls -> System.out.println(ls));
		//Daycare_request dayr = r1.getRequest(1189924);
			//System.out.println(dayr);
		 Daycare_request req1 = new Daycare_request();
		 req1.setID_DAYCARE_REQUEST(1189922);
		 req1.setID_LAST_UPDATE_PERSON(24813632);
		//Daycare_request req2 = new Daycare_request(1189922);
		 
		 //r1.updateDaycare_request(req1);
		// System.out.println(req1);
		r1.updateDaycare_request(req1);
		System.out.println("after update"+ req1);
	}

}
