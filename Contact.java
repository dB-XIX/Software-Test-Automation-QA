package contact;


public class Contact {
	
	protected String id;
	protected String firstName;
	protected String lastName;
	protected String number;
	protected String address;
	
	
	public Contact () {
	}
	
	public Contact(String id, String firstName, String lastName, String number, String address) {
		
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		if(number == null || number.length()>10) {
			throw new IllegalArgumentException("Invalid Number");
		}
		
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
	}
	

	public String getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
		
	
	public String getLastName() {
		return lastName;
	}
	
	
	public String getNumber() {
		return number;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	public void setFirstName(String newFirstName) {
	    this.firstName = newFirstName;
    }
	
	public void setLastName(String newLastName) {
	    this.lastName = newLastName;
    }
	
	public void setNumber(String newNumber) {
	    this.number = newNumber;
    }
	
	public void setAddress(String newAddress) {
	    this.address = newAddress;
    }
}
