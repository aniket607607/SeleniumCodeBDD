package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SetupPage extends Home {
	
	
	
	




	By export_button = By.xpath("//*[@id=\"navMenu\"]/ul/li[18]/a");
	
	public SetupPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	
	
	public void export_click()
	{
		
		driver.findElement(export_button).click();
		
		System.out.println("export button click successfull");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	
	

}
