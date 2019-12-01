package de.dc.sql.lang.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import de.dc.sql.lang.demo.model.Person;

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

	@Test
	public void findAllByPerson() {
		Person person = new Person();
		person.setForename("Peter");
		person.setName("Parker");
		
		String sql = PersonQuery.findAllByPerson(person);
		String expected = "SELECT * FROM person WHERE name='Parker' and forename='Peter'";
		
		assertEquals(expected , sql);
	}
}
