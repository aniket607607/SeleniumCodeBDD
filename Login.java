package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	
	WebDriver driver;  																// object of WebDriver class is created globally
	
	//object repositories

	
	By un = By.xpath("//input[@placeholder='Username']");
	By pw = By.xpath("//input[@placeholder='Password']");
	By loginbutton = By.xpath("//*[@id='loginForm']/div/div/input");
	

	
	
	public Login(WebDriver driver)				// constructor is created . So that whenever any object of this page is created , the driver maintains the session
	{
		this.driver=driver;						//
	}
	
	
	public void enter_credentials(String String1, String String2  ) throws InterruptedException
	{
		driver.findElement(un).click();
		driver.findElement(un).sendKeys(String1);
		
		Thread.sleep(2000);
		
		driver.findElement(pw).click();
		driver.findElement(pw).sendKeys(String2);
		
	}
	
	public void click_login()
	{
		
		driver.findElement(loginbutton).click();
		
	}
	
	
	
	

}
