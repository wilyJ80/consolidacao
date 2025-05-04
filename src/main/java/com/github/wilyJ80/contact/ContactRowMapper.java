package com.github.wilyJ80.contact;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public final class ContactRowMapper implements RowMapper<Contact> {

	public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Contact(
				rs.getInt("id"),
				rs.getString("phone_number"),
				rs.getString("name"),
				rs.getString("neighborhood"),
				rs.getBoolean("contacted"),
				rs.getInt("demographics_id"));
	}
}
