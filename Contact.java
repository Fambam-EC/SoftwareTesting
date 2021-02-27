package main;

public class Contact {
	public Contact(){
	}
	private String contactID;
	public String firstName;
	public String lastName;
	public String phoneNum;
	public String addressID;
	
	public Contact(String contactID, String firstName, String lastName, String phoneNum, String addressID) {
		
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if(phoneNum == null || phoneNum.length()!=10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		if(addressID == null || addressID.length()>30) {
			throw new IllegalArgumentException("Invalid Address ID");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.addressID = addressID;
	}
	
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public void setphoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setaddressID(String addressID) {
		this.addressID = addressID;
	}
	public String getcontactID() {
		return contactID;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getphoneNum() {
		return phoneNum;
	}
	public String getaddressID() {
		return addressID;
	}
}