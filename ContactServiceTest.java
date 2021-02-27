package main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	
	@Test
	void testContact() {
		Contact contact = new Contact("123456", "Ethan", "Cook", "1234567890", "Over the yellow brick road");
		assertTrue(contact.getcontactID().equals("123456"));
		assertTrue(contact.getfirstName().equals("Ethan"));
		assertTrue(contact.getlastName().equals("Cook"));
		assertTrue(contact.getphoneNum().equals("1234567890"));
		assertTrue(contact.getaddressID().equals("Over the yellow brick road"));
	}
	ArrayList <Contact> account = new ArrayList<Contact> ();
	@Test
	void deleteContact() {
		Contact contact = new Contact("123456", "Ethan", "Cook", "1234567890", "Over the yellow brick road");
		account.add(contact);
		assertFalse(account.isEmpty());
		account.remove(contact);
		assertTrue(account.isEmpty());
	}
	
	@Test
	void addContact() {
		// TODO Auto-generated method stub
		Contact contact = new Contact("123456", "Ethan", "Cook", "1234567890", "Over the yellow brick road");
		account.add(contact);
		assertFalse(account.isEmpty());
	}
	@Test
	void modifyContact() {
		Contact contact = new Contact("123456", "Ethan", "Cook", "1234567890", "Over the yellow brick road");
		account.add(contact);
		contact.setContactID("ID");
		contact.setfirstName("ID");
		contact.setlastName("ID");
		contact.setphoneNum("ID");
		contact.setaddressID("ID");
		account.remove(contact);
		account.add(contact);
		assertFalse(account.isEmpty());
		
		}
}
