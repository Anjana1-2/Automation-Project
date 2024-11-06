package pagepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	
WebDriver driver;
	
	@FindBy(xpath="/html/body/header/div[1]/div/a[1]")
	WebElement loginbutton;

	@FindBy(xpath="/html/body/div[3]/div/div/div/div[2]/div[2]/a")
	WebElement newuserbutton;
	
	
	
	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); 
		
	}

	public void loginbuttonclick()
	{
		loginbutton.click();
	}
	
	public void newuserbuttonclick()
	{
		newuserbutton.click();
	}
	
	}
	
	




