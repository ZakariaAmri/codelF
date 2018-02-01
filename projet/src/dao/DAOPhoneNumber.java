package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class DAOPhoneNumber implements IDAOPhoneNumber{

	@Override
	public entity.PhoneNumber createPhone(entity.PhoneNumber phone) {
		// TODO Auto-generated method stub
		System.out.println("je créer un numero de téléphone");
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction tx = null;
		if(!session.getTransaction().isActive()){
			tx = session.beginTransaction();
		}else{
			tx = session.getTransaction();
		}
		session.save(phone);
		
		tx.commit();

		return phone;
	}

	@Override
	public boolean removePhone(long id) {
		// TODO Auto-generated method stub
		System.out.println("j'enlève un numero de téléphone");
		return false;
	}

	@Override
	public entity.PhoneNumber updatePhone(entity.PhoneNumber p) {
		// TODO Auto-generated method stub
		System.out.println("je met a jour un numeor");
		return null;
	}

	@Override
	public List<entity.PhoneNumber> searchPhones() {
		// TODO Auto-generated method stub
		System.out.println("je cherche un numero de téléphone");
		return null;
	}

}
