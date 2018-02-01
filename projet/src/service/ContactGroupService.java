package service;

import dao.DAOContactGroup;
import dao.IDAOContactGroup;
import entity.ContactGroup;

public class ContactGroupService {
	public IDAOContactGroup dao;
	public ContactGroupService() {
		dao = new DAOContactGroup();
	}
	public ContactGroup createGroup(String groupname) {
		// TODO Auto-generated method stub
		return dao.createGroup(new ContactGroup(groupname));
	}
	public boolean delete(long i) {
		// TODO Auto-generated method stub
		return dao.removeGroup(i);
	}
	
}
