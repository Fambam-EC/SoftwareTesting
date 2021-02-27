package main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TaskServiceTest {

	@Test
	void testTask() {
		Task task = new Task("123456","Ethan","Cook");
		assertTrue(task.gettaskID().equals("123456"));
		assertTrue(task.getname().equals("Ethan"));
		assertTrue(task.getdescription().equals("Cook"));
	}
ArrayList <Task> list = new ArrayList <Task> ();

@Test
public void addTask() {
		Task task = new Task("123456","Ethan","Cook");
		list.add(task);
		assertFalse(list.isEmpty());
	}

@Test
public void deleteTask() {
	Task task = new Task("ID","ID","ID");
	list.add(task);
	assertFalse(list.isEmpty());
	list.remove(task);
	assertTrue(list.isEmpty());
}
@Test
public void modifyTask() {
		Task task = new Task("ID","ID","ID");
		assertTrue(task.gettaskID().equals("ID"));
		assertTrue(task.getname().equals("ID"));
		assertTrue(task.getdescription().equals("ID"));
		list.add(task);
		task.settaskID("1234");
		task.setName("1234");
		task.setdescription("1234");
		list.remove(task);
		list.add(task);
		assertFalse(list.isEmpty());
		
}
}
