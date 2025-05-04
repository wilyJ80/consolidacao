package com.github.wilyJ80.contact;

public final record ContactWithDemographics(Integer id, String phoneNumber, String name, String neighborhood,
		Integer demographicsId, String label) {
}
