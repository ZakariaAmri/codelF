package dao;

import java.util.List;

import entity.Contact;

public interface IDAOContact {
	
	public Contact createContact(Contact c);
	
	public boolean removeContact(long id);
	
	public Contact updateContact(long id, String firstname, String lastname, String email);

	public List <?> searchContact();
}
