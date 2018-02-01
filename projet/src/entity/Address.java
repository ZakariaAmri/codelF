package entity;

public class Address {
	private long id;
	private String street;
	private String city;
	private String zip;
	private Contact contact;
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Address() {}
	
	public Address(String street, String city, String zip) {
		this.street = street;
		this.city = city;
		this.zip = zip;
	}
	
	public long getAddressID() {
		return this.id;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getZIP() {
		return this.zip;
	}
	
	public void setAddressID(long id) {
		this.id = id;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setZIP(String zip) {
		this.zip = zip;
	}
}
