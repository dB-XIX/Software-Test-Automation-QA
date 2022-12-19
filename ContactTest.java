package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import contact.Contact;


class ContactTest {

	@Test
	void contactClass() {
		Contact contact = new Contact("12345", "Bill", "Murray", "1234567890", "123 Sesame Street");
		assertTrue(contact.getId().equals("12345"));
		assertTrue(contact.getFirstName().equals("Bill"));
		assertTrue(contact.getLastName().equals("Murray"));
		assertTrue(contact.getNumber().equals("1234567890"));
		assertTrue(contact.getAddress().equals("123 Sesame Street"));
	}
		
	@Test
	void idTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678900", "Bill", "Murray", "1234567890", "123 Sesame Street");
		});
	}
	
	@Test
	void firstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Bootstrap Bill", "Murray", "1234567890", "123 Sesame Street");
		});
	}
	
	@Test
	void lastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Bill", "Furry Murray", "1234567890", "123 Sesame Street");
		});
	}
	
	@Test
	void numberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Bill", "Murray", "12345678900", "123 Sesame Street");
		});
	}
	
	@Test
	void addressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Bill", "Murray", "1234567890", "123 Sesame Street11111111111111");
		});
	}
}
