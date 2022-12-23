package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class classB {
	
	@Test(dataProvider="getData")
	public void test3ClassB(String user, String pass) {
		
		System.out.println("class-b test-3");
		System.out.println(user + " "+pass);
		
	}
	
	@BeforeTest
	public void preRequisite() {
		System.out.println("executed before this test folder");
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		//username-password row 
		Object[][] data = new Object[3][2];
		
		//1st
		data[0][0]= "shivani";
		data[0][1]="S@123";
		//2nd
		data[1][0]= "shivani2.0";
		data[1][1]="S@123";
		//3rd
		data[2][0]= "shivani3.0";
		data[2][1]="S@123";
		
		return data;
		
	}
}
