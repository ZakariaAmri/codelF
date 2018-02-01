package entity;


public class PhoneNumber {
	private long id;
	private String kind;
	private String number;
	private Contact contact;
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public PhoneNumber() {}
	
	public PhoneNumber(String kind,String number) {
		this.kind = kind;
		this.number = number;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public Contact getOwner() {
		return contact;
	}
	
	public void setOwner(Contact owner) {
		this.contact = owner;
	}
	
}
