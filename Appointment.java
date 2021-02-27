package main;
import java.util.Date;
public class Appointment {

	public Appointment() {
		
	}
	private String apptID;
	public String date;
	public String description;
	Date day  = new Date();
	public Appointment(String apptID,String date, String description) {
		
		if(apptID  == null || apptID.length()>10) {
			throw new IllegalArgumentException("Invalid appointment ID");
		}
		
		if(day == null) {
			throw new IllegalArgumentException("Invalid date");
		}
		
		if(description  == null || description.length()>50) {
			throw new IllegalArgumentException("Invalid description");
		}
		
		this.apptID = apptID;
		this.date = date;
		this.description = description;
	}
	public void setapptID(String apptID) {
		this.apptID = apptID;
	}

	public void setdate(String date) {
		this.date = date;
	}

	public void setdescription(String description) {
		this.description = description;
	}
	public String getapptID() {
		return apptID;
	}
	public String getdate() {
		return date;
	}
	public String getdescription() {
		return description;
	}
	}

