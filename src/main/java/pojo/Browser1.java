package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser1 {
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions options=new ChromeOptions();
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com");;
		driver.manage().window().maximize();
		
		return driver;
	}

}
