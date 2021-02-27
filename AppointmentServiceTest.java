package main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AppointmentServiceTest {


	@Test
	void testAppointment() {
		Appointment appt = new Appointment("123456","Ethan","Cook");
		assertTrue(appt.getapptID().equals("123456"));
		assertTrue(appt.getdate().equals("Ethan"));
		assertTrue(appt.getdescription().equals("Cook"));
	}
ArrayList <Appointment> list = new ArrayList <Appointment> ();

@Test
public void addAppt() {
	Appointment appt = new Appointment("123456","Ethan","Cook");
	list.add(appt);
		assertFalse(list.isEmpty());
	}

@Test
public void deleteAppt() {
	Appointment appt = new Appointment("ID","ID","ID");
	list.add(appt);
	assertFalse(list.isEmpty());
	list.remove(appt);
	assertTrue(list.isEmpty());
}
@Test
public void modifyAppt() {
		Appointment appt = new Appointment("ID","ID","ID");
		assertTrue(appt.getapptID().equals("ID"));
		assertTrue(appt.getdate().equals("ID"));
		assertTrue(appt.getdescription().equals("ID"));
		list.add(appt);
		appt.setapptID("1234");
		appt.setdate("1234");
		appt.setdescription("1234");
		list.remove(appt);
		list.add(appt);
		assertFalse(list.isEmpty());
		
}
}

