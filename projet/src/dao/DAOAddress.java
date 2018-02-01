package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import entity.Address;
import util.HibernateUtil;

public class DAOAddress implements IDAOAddress{

	@Override
	public Address createAddress(Address a) {
		// TODO Auto-generated method stub
		System.out.println("Je cree une address");

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction tx = null;
		if(!session.getTransaction().isActive()){
			tx = session.beginTransaction();
		}else{
			tx = session.getTransaction();
		}
		session.save(a);
		
		tx.commit();

		return a;
	}

	@Override
	public boolean removeAddress(long id) {
		// TODO Auto-generated method stub
		System.out.println("je supprime une addresse");
		return false;
	}

	@Override
	public Address updateAddress(Address a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> searchAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
