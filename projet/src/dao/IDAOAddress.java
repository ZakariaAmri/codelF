package dao;

import java.util.List;

import entity.Address;

public interface IDAOAddress {
	
	public Address createAddress(Address a);
	
	public boolean removeAddress(long id);
	
	public Address updateAddress(Address a);

	public List <Address> searchAddress();

	
}
