package demotest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; 

public class demotestclasstng {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	@Test
	public void statuscheck()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("http://localhost:9090/demoapp/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("usr@google");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pasrd");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Invalid ID')]")).isDisplayed();
	System.out.println("Script passed with invalid credentials");
	driver.close();
	}

}