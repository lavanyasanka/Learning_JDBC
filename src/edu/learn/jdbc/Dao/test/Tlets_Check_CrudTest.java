package edu.learn.jdbc.Dao.test;

import java.util.List;

import edu.learn.jdbc.Dao.Tlets_Check_CrudExample;

public class Tlets_Check_CrudTest {
	private int ID_TLETS_CHECK = 0;
	private int ID_LAST_UPDATE_PERSON =0;
	private String DT_CREATED = null;
	private int ID_CREATED_PERSON =0;
	private int ID_PERSON =0;
	private int ID_CASE =0;
	private int ID_STAGE =0;	
	private String CD_TLETS = null;
	private String DT_CONDUCTED = null;
	private String IND_INVALID = null;
	private String DT_INVALID = null;
	
	public int getID_TLETS_CHECK() {
		return ID_TLETS_CHECK;
	}
	public void setID_TLETS_CHECK(int iD_TLETS_CHECK) {
		ID_TLETS_CHECK = iD_TLETS_CHECK;
	}
	public int getID_LAST_UPDATE_PERSON() {
		return ID_LAST_UPDATE_PERSON;
	}
	public void setID_LAST_UPDATE_PERSON(int iD_LAST_UPDATE_PERSON) {
		ID_LAST_UPDATE_PERSON = iD_LAST_UPDATE_PERSON;
	}
	public String getDT_CREATED() {
		return DT_CREATED;
	}
	public void setDT_CREATED(String dT_CREATED) {
		DT_CREATED = dT_CREATED;
	}
	public int getID_CREATED_PERSON() {
		return ID_CREATED_PERSON;
	}
	public void setID_CREATED_PERSON(int iD_CREATED_PERSON) {
		ID_CREATED_PERSON = iD_CREATED_PERSON;
	}
	public int getID_PERSON() {
		return ID_PERSON;
	}
	public void setID_PERSON(int iD_PERSON) {
		ID_PERSON = iD_PERSON;
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
	public String getCD_TLETS() {
		return CD_TLETS;
	}
	public void setCD_TLETS(String cD_TLETS) {
		CD_TLETS = cD_TLETS;
	}
	public String getDT_CONDUCTED() {
		return DT_CONDUCTED;
	}
	public void setDT_CONDUCTED(String dT_CONDUCTED) {
		DT_CONDUCTED = dT_CONDUCTED;
	}
	public String getIND_INVALID() {
		return IND_INVALID;
	}
	public void setIND_INVALID(String iND_INVALID) {
		IND_INVALID = iND_INVALID;
	}
	public String getDT_INVALID() {
		return DT_INVALID;
	}
	public void setDT_INVALID(String dT_INVALID) {
		DT_INVALID = dT_INVALID;
	}

		
		@Override
		public String toString() {
			return "CrudTest [ idtelectscheck=" + ID_TLETS_CHECK + ", last person update=" + ID_LAST_UPDATE_PERSON + ", created date=" + DT_CREATED + ", person created=" + ID_CREATED_PERSON +
					", person id=" + ID_PERSON + ", id case=" + ID_CASE + ", stage id= " + ID_STAGE + ", tletd code=" + CD_TLETS + ", date conducted =" + DT_CONDUCTED + ", indicator valid=" + IND_INVALID + "date valid from =" + DT_INVALID + "]";
		}


	public static void main(String[] args) throws Exception {
		Tlets_Check_CrudExample c = new Tlets_Check_CrudExample();

		List result = c.select_records();
		result.forEach(res -> System.out.println(res));
		
//		c.insert_record();
//		c.update_record();
//		c.delete_record();
	}


}
