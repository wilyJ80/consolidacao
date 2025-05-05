package com.github.wilyJ80.contact;

public final class ContactWithDemographics extends AbstractContact {
	private String label;

	public ContactWithDemographics(Integer id, String phoneNumber, String name, String neighborhood, Boolean contacted,
			Integer demographicsId, String label) {
		setId(id);
		setPhoneNumber(phoneNumber);
		setName(name);
		setNeighborhood(neighborhood);
		setContacted(contacted);
		setDemographicsId(demographicsId);
		setLabel(label);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
