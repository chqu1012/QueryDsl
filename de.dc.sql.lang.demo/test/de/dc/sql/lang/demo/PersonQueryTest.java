package de.dc.sql.lang.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PersonQueryTest {

	@Test
	public void findAllByForeName() {
		String sql = PersonQuery.findAllByForename("Peter");
		String expected = "SELECT * FROM person WHERE forename='Peter'";
		assertEquals(expected , sql);
	}

	@Test
	public void findAllByLastname() {
		String sql = PersonQuery.findAllByName("Parker");
		String expected = "SELECT * FROM person WHERE name='Parker'";
		assertEquals(expected , sql);
	}
}
