package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends Login {


	

	By setup = By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[2]/a");
	
	public Home(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void setup() throws InterruptedException
	{
		driver.switchTo().frame("mainpanel");
		driver.findElement(setup).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		
	}
	
	
	
	
	
	
}
