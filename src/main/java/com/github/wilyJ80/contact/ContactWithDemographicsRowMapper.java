package com.github.wilyJ80.contact;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public final class ContactWithDemographicsRowMapper implements RowMapper<ContactWithDemographics> {

	@Override
	public ContactWithDemographics mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new ContactWithDemographics(
				rs.getInt("id"),
				rs.getString("phone_number"),
				rs.getString("name"),
				rs.getString("neighborhood"),
				rs.getInt("demographics_id"),
				rs.getString("label"));
	}
}
