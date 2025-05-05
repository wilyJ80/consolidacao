package com.github.wilyJ80.contact;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDaoImpl implements ContactDao {

	private final JdbcTemplate jdbcTemplate;

	public ContactDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int addContact(Contact contact) {
		String sql = """
				INSERT INTO contact (
				phone_number, name,
				neighborhood,
				demographics_id)
				VALUES
				(?, ?, ?, ?)
					""";
		return this.jdbcTemplate.update(sql,
				contact.getPhoneNumber(),
				contact.getName(),
				contact.getNeighborhood(),
				contact.getDemographicsId());
	}

	@Override
	public List<ContactWithDemographics> getAllContacts() {
		String sql = """
					SELECT c.id, c.phone_number, c.name,
						c.neighborhood, c.contacted, c.demographics_id,
						d.label
					FROM contact c
					LEFT JOIN demographics d
					ON d.id = c.demographics_id
					WHERE contacted = false
				""";
		return this.jdbcTemplate.query(sql, new ContactWithDemographicsRowMapper());
	}

	@Override
	public Contact findContact(int id) {
		// TODO:
		return null;
	}

	@Override
	public int markAsContacted(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
}
