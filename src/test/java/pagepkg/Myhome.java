package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myhome {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/header/div[1]/div/div/a")
	WebElement findpropertydistrictwisebutton;
	@FindBy(xpath="/html/body/header/div[1]/div/div/ul/li[13]/a")
	WebElement district;
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/div/div[1]/div/div/a")
	WebElement property;
	@FindBy(xpath="/html/body/header/div[1]/div/a[1]")
	WebElement myhomebutton;
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/ul/li[5]/a")
	WebElement logoutbutton;





	
	
	public Myhome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); 
		
	}
	public void clickdistrictwisepropertybutton()
	{
		findpropertydistrictwisebutton.click();
	}
	public void selectdistrict()
	{
		district.click();
	}
	public void selectproperty()
	{
		property.click();
	}
	public void clickmyhomebutton()
	{
		myhomebutton.click();
	}
	public void clicklogoutbutton()
	{
		logoutbutton.click();
	}




}
