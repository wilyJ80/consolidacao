package com.github.wilyJ80.contact;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public final class Contact {

	private Integer id;

	@NotNull
	@Size(min = 8, max = 11, message = "Telefone deve ter entre 8 e 11 números")
	@Pattern(regexp = "\\d+", message = "Telefone deve conter apenas números.")
	private String phoneNumber;

	private String name;
	private String neighborhood;
	private boolean contacted;
	private Integer demographicsId;

	public Contact() {
	}

	public Contact(Integer id, String phoneNumber, String name, String neighborhood, boolean contacted,
			Integer demographicsId) {
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.neighborhood = neighborhood;
		this.contacted = contacted;
		this.demographicsId = demographicsId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public boolean isContacted() {
		return contacted;
	}

	public void setContacted(boolean contacted) {
		this.contacted = contacted;
	}

	public Integer getDemographicsId() {
		return demographicsId;
	}

	public void setDemographicsId(Integer demographicsId) {
		this.demographicsId = demographicsId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
