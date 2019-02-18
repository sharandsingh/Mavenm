package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class driverDD {
	String str;
	public static WebDriver driver;
	@BeforeSuite
	public void acc()
	
	{
		//System.setProperty("webdriver.chrome.driver","D:\\btes selenium\\chromedriver_win32\\chromedriver.exe");
	str=System.getProperty("user.dir")+"//driver//chromedriver.exe";
	System.out.println(str);
	System.setProperty("webdriver.chrome.driver",str);
	driver=new ChromeDriver();
	//driver.get("https://www.facebook.com/");
	driver.navigate().to("https://www.facebook.com");
	}
	@AfterSuite
	public  void close()
	{
	driver.close();
	
	}
	
	
	

}
