package service;

import dao.DAOAddress;
import dao.IDAOAddress;
import entity.Address;

public class AddressService {
	public IDAOAddress dao;
	
	public AddressService() {
		dao = new DAOAddress();
	}

	public Address createAddress(String street, String city, String zip) {
		// TODO Auto-generated method stub
		Address a = new Address(street, city, zip);
		DAOAddress da = new DAOAddress();
		return da.createAddress(a);
	}

}
