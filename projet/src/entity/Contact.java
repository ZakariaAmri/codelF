package entity;

import java.util.HashSet;
import java.util.Set;

public class Contact {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	
	private Set<ContactGroup> books;
	private Set<PhoneNumber> phoneNumbers;
	private Address address;
	
	public Contact() {}
	
	public Contact(String firstname, String lastname, String email) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.email = email;
		this.books = new HashSet<ContactGroup>();
		this.phoneNumbers = new HashSet<PhoneNumber>();
	}
	
	
	
	public long getID() {
		return this.id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public Set<ContactGroup> getBooks() {
		return this.books;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public void setID(long id) {
		this.id = id;
	}
	
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
	
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setBooks(Set<ContactGroup> groups) {
		this.books = groups;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Set<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}
	
	public void setPhoneNumbers(Set<PhoneNumber> phones) {
		this.phoneNumbers = phones;
	}
	
}
