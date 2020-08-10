package com.ghazianibros.JUnitProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

	
	@Test
	public void TestPersonName() {
		Person p = new Person();
		assertEquals("Imran", p.Name());
	}

}
