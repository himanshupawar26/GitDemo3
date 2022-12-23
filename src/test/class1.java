package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class class1 {
	
	@Test
	public void webLogin() {
		System.out.println("web login ");
		Assert.assertTrue(false);
	}
	
	@Test
	public void mobileLogin() {
		System.out.println("mobile login");
		
	}
	
	@BeforeSuite
	public void bfSuite() {
		System.out.println("before suite executed");
	}
	
	@AfterSuite
	public void afSuite() {
		System.out.println("after suite executed");
	}
}
