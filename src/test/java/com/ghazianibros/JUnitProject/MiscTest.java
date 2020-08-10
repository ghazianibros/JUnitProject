package com.ghazianibros.JUnitProject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class MiscTest {
	
	@Before
	public void testBeforeAllFunctionCall() {
		System.out.println("before function");
	}
	
	@After
	public void testAfterAllFunctionCall() {
		System.out.println("after function");
	}
	
	@BeforeClass
	public static void testBeforeClass() {   ///always be STATIC - class level
		System.out.println("before class");
	}
	@AfterClass
	public static void testAfterClass() {    ///always be STATIC - class level
		System.out.println("after class");
	}
	
	@Test(expected=NullPointerException.class)    ///adding this to pass the test as expected is NULL
	public void testNullException() {
		String name = null;
		String actualOutput = name.toUpperCase();
		System.out.println(actualOutput);
	}
	
	@Test
	public void testToLearnAssertEqual() {
		//expected 2 but was 3
		//assertExquals(expected_output, actual_output);
		System.out.println("calling testToLearnAssertEqual");
		assertEquals(2,2);
		
	}
	
	@Test	
	public void testMathMin() {
		int actualOutput = Math.min(5, 10);
		int expectedOutput = 5;
		System.out.println("calling testMathMin");
		assertEquals(expectedOutput, actualOutput);
		
	}

}
