package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	
	@Test
	void testContact() {
		Contact contact = new Contact("123456", "Ethan", "Cook", "1234567890", "Over the yellow brick road");
		assertTrue(contact.getcontactID().equals("123456"));
		assertTrue(contact.getfirstName().equals("Ethan"));
		assertTrue(contact.getlastName().equals("Cook"));
		assertTrue(contact.getphoneNum().equals("1234567890"));
		assertTrue(contact.getaddressID().equals("Over the yellow brick road"));
	}
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("01010101010", "ID" , "ID", "1234567890", "ID");
			
		});		}
	@Test
	void testContactIDisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact(null, "ID" , "ID", "1234567890", "ID");
			
		});		}
	@Test
	void testfirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("ID", "JohnJacobJingleHeimer" , "ID", "1234567890", "ID");
			
		});		}
	@Test
	void testfirstNameisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("ID", null , "ID", "1234567890", "ID");
		});		}
	@Test
	void testlastNameisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("ID", "ID" , null , "1234567890", "ID");
		});		}
	@Test
	void testlastNameisTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("ID", "ID" , "Thisiswaytoolong", "1234567890", "ID");
		});		}
	@Test
	void testphoneNumisTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("ID", "ID" , "ID", "12345678901", "ID");
		});		}
	@Test
	void testphoneNumisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("ID", "ID" , "ID", null , "ID");
		});		}
	@Test
	void testaddressIDisTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("ID", "ID" , "ID", "1234567890", "101010101010101010101010101010101010101010110101010101010110101");
		});		}
	@Test
	void testaddressIDisNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("ID", "ID" , "Thisiswaytoolong", "1234567890", null );
		});		}
}
