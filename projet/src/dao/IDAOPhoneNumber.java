package dao;

import java.util.List;

import entity.PhoneNumber;

public interface IDAOPhoneNumber {
	
	public PhoneNumber createPhone(PhoneNumber phone);
	public boolean removePhone(long id);
	public PhoneNumber updatePhone(PhoneNumber p);
	public List<PhoneNumber> searchPhones();
	
}
