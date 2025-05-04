package com.github.wilyJ80.contact;

import java.util.List;

public interface ContactDao {
	// add, return all (not contacted), find specific, update
	public int addContact(Contact contact);

	public List<ContactWithDemographics> getAllContacts();

	public Contact findContact(int id);

	public int markAsContacted(int id);
}
