package com.ghazianibros.JUnitProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class MiscTest {

	@Test
	public void testToLearnAssertEqual() {
		//expected 2 but was 3
		//assertExquals(expected_output, actual_output);
		assertEquals(2,2);
		
	}
	
	@Test	
	public void testMathMin() {
		int actualOutput = Math.min(5, 10);
		int expectedOutput = 5;
		
		assertEquals(expectedOutput, actualOutput);
		
	}

}
