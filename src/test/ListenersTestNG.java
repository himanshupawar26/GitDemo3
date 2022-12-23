package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener{
	
	
	@Override
	public void onTestStart(ITestResult result) {
	     
		
	  }

	 @Override
	 public void onTestSuccess(ITestResult result) {
	   System.out.println("test success listeners executed");
		 
	  }

	 @Override 
	 public void onTestFailure(ITestResult result) {
	    System.out.println("failed "+ result.getName());
		 
	  }

	 @Override
	 public void onTestSkipped(ITestResult result) {
	    
		 
	  }

	 @Override
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	 @Override
	 public void onTestFailedWithTimeout(ITestResult result) {
	    
	  }

	 @Override
	 public void onStart(ITestContext context) {
	    // not implemented
	  }

	 @Override
	  public void onFinish(ITestContext context) {
	    
		 
	  }
}
