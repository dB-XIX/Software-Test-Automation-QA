package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import contact.ContactService;


class ContactServiceTest {

	@Test
	void addingContact() {		
		ContactService service = new ContactService();
		service.addContact("1234567890", "Julie", "Adams", "8675309", "1408 Elm St.");
		assertTrue(service.contacts.elementAt(0).getId().equals("1234567890"));
		assertTrue(service.contacts.elementAt(0).getFirstName().equals("Julie"));
		assertTrue(service.contacts.elementAt(0).getLastName().equals("Adams"));
		assertTrue(service.contacts.elementAt(0).getNumber().equals("8675309"));
		assertTrue(service.contacts.elementAt(0).getAddress().equals("1408 Elm St."));
	}
	
	@Test
	void updatingContact() {
		ContactService service = new ContactService();
		service.addContact("1234567890", "Julie", "Adams", "8675309", "1408 Elm St.");
		service.updateContact("1234567890", "Allison", "Hayes", "2347562", "50 ft. Avenue");
		assertTrue(service.contacts.elementAt(0).getId().equals("1234567890"));
		assertTrue(service.contacts.elementAt(0).getFirstName().equals("Allison"));
		assertTrue(service.contacts.elementAt(0).getLastName().equals("Hayes"));
		assertTrue(service.contacts.elementAt(0).getNumber().equals("2347562"));
		assertTrue(service.contacts.elementAt(0).getAddress().equals("50 ft. Avenue"));
	}
	
	@Test
	void deleteContact() {
		ContactService service = new ContactService();
		service.addContact("1234567890", "Julie", "Adams", "8675309", "1408 Elm St.");
		assertTrue(service.contacts.elementAt(0).getId().equals("1234567890"));
		assertTrue(service.contacts.elementAt(0).getFirstName().equals("Julie"));
		assertTrue(service.contacts.elementAt(0).getLastName().equals("Adams"));
		assertTrue(service.contacts.elementAt(0).getNumber().equals("8675309"));
		assertTrue(service.contacts.elementAt(0).getAddress().equals("1408 Elm St."));
		int vectorSize = service.contacts.size();
		service.deleteContact("1234567890");
		int newVectorSize = service.contacts.size();
		assertTrue(newVectorSize < vectorSize);
	}
}
