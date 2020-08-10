package com.ghazianibros.JUnitProject;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MiscTest.class, PersonTest.class })
public class AllTests {

}
