package main;

import java.util.ArrayList;

public class AppointmentService {
	String apptID = null;
	String date = null;
	String description = null;
	
	ArrayList <Appointment> list = new ArrayList<Appointment> ();
	Appointment appointment = new Appointment();
	
public String uniquetaskID() {
		
		if (list.size() < 1) {
			return "1";
		}	else {
			return String.valueOf(Integer.parseInt(list.get(list.size()-1).getapptID())+1);
		}
		
	}

public void addappt(Appointment task) {
	
	task.setapptID(uniquetaskID());
	list.add(task);
}
	
public void deleteappt(String delapptID) {
	for (int i = 0; i < list.size(); i++) {
		if (list.get(i).getapptID().equals(delapptID)) {
			list.remove(i);
		}
	}
}
 
public void editAppointment(String editappt) {
	
	for (int i = 0; i < list.size(); i++) {
		if (list.get(i).getapptID().equals(editappt)) {
			appointment.setapptID("newValue");
			appointment.setdate("newValue");
			appointment.setdescription("newValue");
			
		}
	}
}


}
