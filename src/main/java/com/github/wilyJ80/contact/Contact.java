package com.github.wilyJ80.contact;

public final class Contact extends AbstractContact {

	public Contact() {
	}

	public Contact(Integer id, String phoneNumber, String name, String neighborhood, Boolean contacted,
			Integer demographicsId) {
		setId(id);
		setPhoneNumber(phoneNumber);
		setName(name);
		setNeighborhood(neighborhood);
		setContacted(contacted);
		setDemographicsId(demographicsId);
	}
}
