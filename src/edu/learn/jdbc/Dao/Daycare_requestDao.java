package edu.learn.jdbc.Dao;

import java.util.List;

import edu.learn.jdbc.Dao.model.Daycare_request;

public interface Daycare_requestDao {
	
	   public List<Daycare_request> getAllRequests() throws Exception;
	   public Daycare_request getRequest(int ID_DAYCARE_REQUEST);
	   public void updateDaycare_request(Daycare_request daycareRequest);
	   public void deleteDaycare_request(Daycare_request daycareRequest);


}
