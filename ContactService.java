package contact;

import java.util.*;


public class ContactService extends Contact{
	
	public Vector<Contact> contacts = new Vector<>();
		
	public void addContact(String id, String firstName, String lastName, String number, String address) {
		if(contacts.size() > 0) {
			for(int i = 0; i < contacts.size(); ++i) {
	    		if (contacts.elementAt(i).getId().equals(id)) {
	    			throw new IllegalArgumentException("ID already in use");
	    		}
	    		else {
	    	    	Contact contact = new Contact(id, firstName, lastName, number, address);
	    	    	contacts.add(contact);
			    }
	        }		 
    	}
		else {
			Contact contact = new Contact(id, firstName, lastName, number, address);
		    contacts.add(contact);
		}
    }
	
	
	public void deleteContact(String id) {
		for(int i = 0; i < contacts.size(); ++i) {
			if(contacts.elementAt(i).getId().equals(id)) {
				contacts.remove(i);
			}
		}
	}
	
	
	public void updateContact(String id, String newFirstName, String newLastName, String newNumber, String newAddress) {
		for(int i = 0; i < contacts.size(); ++i) {
			if(contacts.elementAt(i).getId().equals(id)) {
				contacts.elementAt(i).setFirstName(newFirstName);
				contacts.elementAt(i).setLastName(newLastName);
				contacts.elementAt(i).setNumber(newNumber);
				contacts.elementAt(i).setAddress(newAddress);
			}
		}
	}
}
