# QueryDsl
Eclipse Plug-ins to generate helper class for sql queries.

## How to define a query dsl
Example query dsl for person table.
* Package is required to generate the class into
* Each query has a name and optionally 0..* parameter with types
* The content after is the sql content with parameters surround by '<' parameterName '>'
* Java class method can called in the query content, see below example #findAllBy(Person)
* After storing this dsl a corresponding java class will inferred by xtext
* The name of the query manager can defined as ClassName
```
package de.dc
 
class QueryManager{
	 
	Query findAllById(int id)```
		Select * from Table
		where id = <id>
		```

	Query findAll()```
		SELECT * FROM table
		```	

	Query findAllBy(Person p)```
		SELECT * FROM table
		WHERE name='"+p.getName()+"' and forename = '"+p.getForename()+"'
		```	
} 
```
The "QueryManager" can used on static way in your class
```
package de.dc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueryTest {

	@Test
	public void testFindAllPerson() {
		Person person = new Person();
		person.setForename("Peter");
		person.setName("Parker");

		String sql = QueryManager.findAllBy(person);
		
		assertEquals("SELECT * FROM table WHERE name='Parker' and forename = 'Peter'", sql);
	}

	@Test
	public void testFindAllById() {
		String sql = QueryManager.findAllById(12);
		assertEquals("Select * from Table where id = 12", sql);
	}
}
```
