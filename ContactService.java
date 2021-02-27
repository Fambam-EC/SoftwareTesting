package main;

import java.util.ArrayList;

public class ContactService {

	
	
	ArrayList <Contact> account = new ArrayList<Contact> ();
	Contact contact = new Contact();
	
	public String uniqueID() {
		
		if (account.size() < 1) {
			return "1";
		}	else {
			return String.valueOf(Integer.parseInt(account.get(account.size()-1).getcontactID())+1);
		}
		
	}
	
	public String ContactServ() {
		return null;
	}
	
	
	public void add(Contact contact) {
		contact.setContactID(uniqueID());
		
		account.add(contact);
		
	}
	
	public void delete(String ID) {
		for (int i = 0; i < account.size(); i++ ) {
			if (account.get(i).getcontactID().equals(ID)) {
				account.remove(i);
			}
		}
		
	}
	
	public void editContact(String edit) {
		for (int i = 0; i < account.size(); i++) {
			if (account.get(i).getcontactID().equals(edit)) {
				contact.setfirstName("newValue");
				contact.setlastName("newValue");
				contact.setphoneNum("newValue");
				contact.setaddressID("newValue");
			}
		}
	}
	
	
}



	

