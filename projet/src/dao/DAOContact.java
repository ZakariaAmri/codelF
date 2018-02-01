package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import entity.Contact;
import util.HibernateUtil;

public class DAOContact implements IDAOContact {

	@Override
	public Contact createContact(Contact c) {
		// TODO Auto-generated method stub
		System.out.println("je crée un contact");
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction tx = null;
		if(!session.getTransaction().isActive()){
			tx = session.beginTransaction();
		}else{
			tx = session.getTransaction();
		}
		
		session.save(c);
		
		tx.commit();
		
		return c;

	}

	@Override
	public boolean removeContact(long id) {
		// TODO Auto-generated method stub
		System.out.println("je supprime un contact");
		return false;
	}

	@Override
	public entity.Contact updateContact(long id, String firstname, String lastname, String email) {
		// TODO Auto-generated method stub
		System.out.println("j'update un contact");
		return null;
	}

	@Override
	public List<?> searchContact() {
		// TODO Auto-generated method stub
		System.out.println("je cherche un contact");
		return null;
	}

}