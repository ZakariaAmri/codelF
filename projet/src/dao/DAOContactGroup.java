package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.ContactGroup;
import util.HibernateUtil;

public class DAOContactGroup implements IDAOContactGroup {

	@Override
	public ContactGroup createGroup(ContactGroup newgroup) {
		// TODO Auto-generated method stub
		System.out.println("je crée un group");
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction tx = null;
		if(!session.getTransaction().isActive()){
			tx = session.beginTransaction();
		}else{
			tx = session.getTransaction();
		}
		session.save(newgroup);
		
		tx.commit();

		return newgroup;
	}

	@Override
	public boolean removeGroup(long id) {
		// TODO Auto-generated method stub
		System.out.println("je supprime le group");
		return false;
	}

	@Override
	public ContactGroup updateGroup(long id, String groupname) {
		// TODO Auto-generated method stub
		System.out.println("j'update un group");
		return null;
	}

	@Override
	public List<ContactGroup> searchGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
