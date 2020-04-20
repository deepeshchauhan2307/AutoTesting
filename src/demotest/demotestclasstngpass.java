package demotest;
import org.openqa.selenium.By;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test; 

public class demotestclasstngpass {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	@Test
	public void statuscheck() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	ChromeOptions options = new ChromeOptions();
    options.addArguments("headless");
    options.addArguments("window-size=1200x600");
	driver.get("http://localhost:9090/demoapp/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("user@google.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//driver.findElement(By.xpath("//*[contains(text(),'submit')]")).click();
	driver.findElement(By.xpath("//*[contains(text(),'SUCCESS')]")).isDisplayed();
	System.out.println("Script passed");
	driver.close();
	}

}