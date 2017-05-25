package edu.learn.jdbc.Dao.model;

import java.util.Date;

public class Daycare_request {
	//member variables
	private int ID_DAYCARE_REQUEST;
	private Date DT_LAST_UPDATE;
	private int ID_LAST_UPDATE_PERSON;
	private Date DT_CREATED;
	 private int ID_CREATED_PERSON;
	 private int ID_CASE; 
	 private int ID_STAGE; 
	 private int ID_EVENT;
	 private String IND_INVALID;
	 private Date DT_INVALID;
	 private String TXT_COMMENT_INVALID;

	 
	//getters and setters
	public int getID_DAYCARE_REQUEST() {
		return ID_DAYCARE_REQUEST;
	}
	public void setID_DAYCARE_REQUEST(int iD_DAYCARE_REQUEST) {
		ID_DAYCARE_REQUEST = iD_DAYCARE_REQUEST;
	}
	public Date getDT_LAST_UPDATE() {
		return DT_LAST_UPDATE;
	}
	public void setDT_LAST_UPDATE(Date dT_LAST_UPDATE) {
		DT_LAST_UPDATE = dT_LAST_UPDATE;
	}
	public int getID_LAST_UPDATE_PERSON() {
		return ID_LAST_UPDATE_PERSON;
	}
	public void setID_LAST_UPDATE_PERSON(int iD_LAST_UPDATE_PERSON) {
		ID_LAST_UPDATE_PERSON = iD_LAST_UPDATE_PERSON;
	}
	public Date getDT_CREATED() {
		return DT_CREATED;
	}
	public void setDT_CREATED(Date dT_CREATED) {
		DT_CREATED = dT_CREATED;
	}
	public int getID_CREATED_PERSON() {
		return ID_CREATED_PERSON;
	}
	public void setID_CREATED_PERSON(int iD_CREATED_PERSON) {
		ID_CREATED_PERSON = iD_CREATED_PERSON;
	}
	public int getID_CASE() {
		return ID_CASE;
	}
	public void setID_CASE(int iD_CASE) {
		ID_CASE = iD_CASE;
	}
	public int getID_STAGE() {
		return ID_STAGE;
	}
	public void setID_STAGE(int iD_STAGE) {
		ID_STAGE = iD_STAGE;
	}
	public int getID_EVENT() {
		return ID_EVENT;
	}
	public void setID_EVENT(int iD_EVENT) {
		ID_EVENT = iD_EVENT;
	}
	public String getIND_INVALID() {
		return IND_INVALID;
	}
	public void setIND_INVALID(String iND_INVALID) {
		IND_INVALID = iND_INVALID;
	}
	public Date getDT_INVALID() {
		return DT_INVALID;
	}
	public void setDT_INVALID(Date dT_INVALID) {
		DT_INVALID = dT_INVALID;
	}
	public String getTXT_COMMENT_INVALID() {
		return TXT_COMMENT_INVALID;
	}
	public void setTXT_COMMENT_INVALID(String tXT_COMMENT_INVALID) {
		TXT_COMMENT_INVALID = tXT_COMMENT_INVALID;
	}
	
	//constructors
	public Daycare_request(int iD_DAYCARE_REQUEST, Date dT_LAST_UPDATE, int iD_LAST_UPDATE_PERSON, Date dT_CREATED,
			int iD_CREATED_PERSON, int iD_CASE, int iD_STAGE, int iD_EVENT, String iND_INVALID, Date dT_INVALID,
			String tXT_COMMENT_INVALID) {
		super();
		ID_DAYCARE_REQUEST = iD_DAYCARE_REQUEST;
		DT_LAST_UPDATE = dT_LAST_UPDATE;
		ID_LAST_UPDATE_PERSON = iD_LAST_UPDATE_PERSON;
		DT_CREATED = dT_CREATED;
		ID_CREATED_PERSON = iD_CREATED_PERSON;
		ID_CASE = iD_CASE;
		ID_STAGE = iD_STAGE;
		ID_EVENT = iD_EVENT;
		IND_INVALID = iND_INVALID;
		DT_INVALID = dT_INVALID;
		TXT_COMMENT_INVALID = tXT_COMMENT_INVALID;
	}
	public Daycare_request(int iD_DAYCARE_REQUEST) {
		super();
		ID_DAYCARE_REQUEST = iD_DAYCARE_REQUEST;
	}
	public Daycare_request() {
		super();
	}
	@Override
	public String toString() {
		return "Daycare_request [ID_DAYCARE_REQUEST=" + ID_DAYCARE_REQUEST + ", DT_LAST_UPDATE=" + DT_LAST_UPDATE
				+ ", ID_LAST_UPDATE_PERSON=" + ID_LAST_UPDATE_PERSON + ", DT_CREATED=" + DT_CREATED
				+ ", ID_CREATED_PERSON=" + ID_CREATED_PERSON + ", ID_CASE=" + ID_CASE + ", ID_STAGE=" + ID_STAGE
				+ ", ID_EVENT=" + ID_EVENT + ", IND_INVALID=" + IND_INVALID + ", DT_INVALID=" + DT_INVALID
				+ ", TXT_COMMENT_INVALID=" + TXT_COMMENT_INVALID + "]";
	}
	
	

	


}
