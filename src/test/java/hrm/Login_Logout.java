package hrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Logout {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	
	
	@Test
	public void login() throws Exception {
		Thread.sleep(1000);
		WebElement username=driver.findElement(By.cssSelector("[name='username']"));
		username.click();
		username.sendKeys("Admin");
		Thread.sleep(1000);
		
		
		WebElement pass=driver.findElement(By.cssSelector("[name='password']"));
		pass.click();
		pass.sendKeys("admin123");
		
		
		Thread.sleep(1000);
		WebElement login_btn=driver.findElement(By.cssSelector("[type='submit']"));
		login_btn.click();
		Thread.sleep(1000);
		
		
		
		 String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		
		
		driver.findElement(By.cssSelector("[class='oxd-userdropdown-tab']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("[class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
		
		Thread.sleep(2000);
			driver.getCurrentUrl();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
