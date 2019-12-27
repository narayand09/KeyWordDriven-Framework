package com.qa.hs.tests;

import org.testng.annotations.Test;

import com.qa.hs.keyword.engine.keywordEngine;

public class LoginTest {
	public keywordEngine keyengine;
	
	@Test
	public void loginTest()
	{
		keyengine=new keywordEngine();
		keyengine.startExection("Login");
	}
	

}
