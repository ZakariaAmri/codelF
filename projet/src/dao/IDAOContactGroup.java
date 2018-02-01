package dao;

import java.util.List;

import entity.ContactGroup;

public interface IDAOContactGroup {
	
	public ContactGroup createGroup(ContactGroup newgroup);
	public boolean removeGroup(long id);
	public ContactGroup updateGroup(long id, String groupname);
	public List<ContactGroup> searchGroup();
}
