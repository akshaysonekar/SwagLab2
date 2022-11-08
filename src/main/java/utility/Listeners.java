
package utility;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listeners extends SwagLabElement implements ITestListener {

	public void onTestSucess(ITestResult result) {
		System.out.println("Test is suceessful"+result.getName());
		try {
			Screenshot.takeScreenShot(driver,result.getName());
			}catch(IOException e) {
				e.printStackTrace();
			}
		
	}
	public void onTestFailure(ITestResult result) {
		
		try {
			Screenshot.takeScreenShot(driver,result.getName());
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
	public void onTestSkip(ITestResult result) {
		
	}
	
	

}
