package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class classA {
	
	@Parameters({"url"})
	@Test
	public void demo(String url) {
		System.out.println("hi shivani, test-1");
		System.out.println(url);
	}
	
	@Test
	public void test2() {
		System.out.println("hi shivani, this is test-2");
	}
	
}
