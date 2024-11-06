package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Createaccountpage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"listowner\"]")
	WebElement owner;
	@FindBy(xpath="//*[@id=\"utitle\"]")
	WebElement name;
	@FindBy(xpath="//*[@id=\"umail\"]")
	WebElement email;

	@FindBy(xpath="//*[@id=\"memberpass\"]")
	WebElement password;

	@FindBy(xpath="//*[@id=\"repass\"]")
	WebElement cnfrmpassword;

	@FindBy(xpath="//*[@id=\"umobile\"]")
	WebElement phone;
	@FindBy(xpath="//*[@id=\"sub_regbutton\"]")
	WebElement createaccount;
	@FindBy(xpath="//*[@id=\"ulogin\"]")
	WebElement usernamefield;
	@FindBy(xpath="//*[@id=\"upass\"]")
	WebElement pswd;
	@FindBy(xpath="//*[@id=\"sub_logbtn\"]")
	WebElement loginbutton;
	



	
	public Createaccountpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); 
		
	}
	
	public void dropdowns()
	
	{
		Select own = new Select(owner);
		own.selectByVisibleText("Builder");
	}
	public void setValues(String Name,String Email,String PSWD,String CNFRPSWD,String Phn) 
	{
		
		
		name.sendKeys(Name);
	
		email.sendKeys(Email);
		password.sendKeys(PSWD);
		cnfrmpassword.sendKeys(CNFRPSWD);
		phone.sendKeys(Phn);
		
			}
	public void clickcreateaccountbutton() throws Exception 
	{
		createaccount.click();
		//driver.navigate().refresh();
		//driver.navigate().back();
		Thread.sleep(3000);
	}

	public void setValues(String UN,String PWD)
	{
		usernamefield.clear();
		
		usernamefield.sendKeys(UN);
		pswd.clear();
		pswd.sendKeys(PWD);
	}
	public void clickLoginButton() throws Exception
	{
		loginbutton.click();
		//driver.navigate().refresh();
		//driver.navigate().back();
		Thread.sleep(3000);
	}
	}
	




