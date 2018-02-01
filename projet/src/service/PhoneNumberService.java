package service;

import dao.DAOPhoneNumber;
import dao.IDAOPhoneNumber;
import entity.PhoneNumber;

public class PhoneNumberService {
	public IDAOPhoneNumber dao;
	public PhoneNumberService() {
		dao = new DAOPhoneNumber();
	}
	public PhoneNumber createPhoneNumber(String kind, String number) {
		// TODO Auto-generated method stub
		return dao.createPhone(new entity.PhoneNumber(kind,number));
	}
	public boolean deletePhone(long id) {
		// TODO Auto-generated method stub
		return dao.removePhone(0);
	}
	
}
