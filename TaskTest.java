package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {

	@Test
	void testTaskID() {
	Task task = new Task("Tester", "Ethan", "Sillygoose");
	assertTrue(task.gettaskID().equals("Tester"));
	assertTrue(task.getname().equals("Ethan"));
	assertTrue(task.getdescription().equals("Sillygoose"));
	}
	
	@Test
	void testTaskIDisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task(null, "Ethan", "Sillygoose");
		}); }
	
	@Test
	void testTaskIDistooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("11111111111", "Ethan", "Sillygoose");
		}); }
	
	@Test
	void testnameisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("1", null, "Sillygoose");
		}); }
	
	@Test
	void testNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("1", "Ethanisthecoolestatprogramming", "Sillygoose");
		}); }
	
	@Test
	void testDescriptionisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task(null, "Ethan", null);
		}); }

	@Test
	void testdescriptionistooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("1", "Ethan", "Sillygoose apparently we need to write a paragraph to Junit test this beast");
		}); }

}


