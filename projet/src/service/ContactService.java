package service;

import dao.DAOContact;
import dao.IDAOContact;
import entity.Contact;

public class ContactService {
	public IDAOContact dao;
	public ContactService() {
		dao = new DAOContact();
	}

	public Contact createContact(String firstname,String lastname,String email)
	{
		DAOContact dc = new DAOContact();
		return dc.createContact(new Contact(firstname, lastname, email));
		
	}

	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return dao.removeContact(id);
	}
}
