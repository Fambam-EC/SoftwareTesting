package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppointmentTest {

	@Test
	void testAppIDisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task(null, "Ethan", "Sillygoose");
		}); }

	@Test
	void testappIDistooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("111111111011", "Ethan", "Sillygoose");
		}); }
	@Test
	void dateisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("1", null, "Sillygoose");
		}); }
	
	@Test
	void dateinpast() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("1", null, "Sillygoose");
		}); }
	
	@Test
	void testDescriptionisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("ID", "Ethan", null);
		}); }

	@Test
	void testdescriptionistooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Task("1", "Ethan", "Sillygoose apparently we need to write a paragraph to Junit test this beast correctly");
		}); }
}


