package MyPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	WebDriver driver=null;
	@Before
	public void beforetest() throws InterruptedException
	{
		Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_ApacheJmeter\\chromedriver.exe");
		driver=new ChromeDriver();
//		driver.get("www.google.com");
		Thread.sleep(2000);
		System.out.println("before   test");
		
		
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("test1");
		driver.get("www.google.com");
		Thread.sleep(2000);
//		System.out.println("opened google");
//		driver.close();
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		driver.get("www.facebook.com");
		Thread.sleep(2000);
//		System.out.println("opened facebook");
//		driver.close();
		System.out.println("test2");
		
	}
	
	@After
	public void aftertest()
	{
		System.out.println("after test");
	}

}
