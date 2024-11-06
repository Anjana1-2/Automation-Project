package testpkg;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Createaccountpage;
import pagepkg.Homepage;
import pagepkg.Myhome;
import utilities.Excelutilities;

public class Registrationtest {

	WebDriver driver;
	 
	
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://keralaproperty.in/");
		String s=	driver.getTitle();
		System.out.println("the title of the website is="+s);

	}
	/*@Test
	public void linkvalidation()
	{
		List<WebElement> linkslist=driver.findElements(By.tagName("a"));
		System.out.println("toal link count="+linkslist.size());

	
	*/
	@Test
	public void verfylogin() throws Exception 
	{
		 Homepage ob=new Homepage(driver);
		 ob.loginbuttonclick();
		 ob.newuserbuttonclick();
		 Thread.sleep(3000);
		 String expectedur11="https://keralaproperty.in/member/register/";
		  String actualurl1= driver.getCurrentUrl();
		  
	if(actualurl1.equals(expectedur11))
{
	    	System.out.println("pass");


	
		Createaccountpage ob1 =new Createaccountpage(driver);
		
		ob1.dropdowns();
		ob1.setValues("abc","kabcjkl@gmail.com","Qwerty","Qwerty","1234567890");
		ob1.clickcreateaccountbutton();
		Thread.sleep(3000);
		String expectedurl="https://keralaproperty.in/member/login/success";
			  String actualurl= driver.getCurrentUrl();

			  
		if(actualurl.equals(expectedurl))
	{
		    	System.out.println("pass");

		Createaccountpage ob11=new Createaccountpage(driver);
		 String xl = "C:\\Users\\acer\\Desktop\\Anjana\\anjana\\Book1.xlsx";

         String Sheet = "Sheet1";

         int rowCount = Excelutilities.getRowCount(xl, Sheet);

         for (int i=1;i<=rowCount;i++)
         {
        	 

                 String UserName=Excelutilities.getCellValues(xl, Sheet, i, 0);
                    System.out.println("username---"+UserName);
                 String Pwd=Excelutilities.getCellValues(xl, Sheet, i, 1);
                  System.out.println("password---"+Pwd);
          		
                 //Passing Username and password as parameters
                 ob11.setValues(UserName, Pwd);
                

              //Submitting the data by clicking on login button                   
                  ob11.clickLoginButton();
                  Thread.sleep(3000);
                  String expectedur2="https://keralaproperty.in/member/myhome/";
    			  String actualur2= driver.getCurrentUrl();

    			  
    		if(actualur2.equals(expectedur2))
    		{
    			System.out.println("pass");

    			Myhome ob12=new Myhome(driver);
    			ob12.clickdistrictwisepropertybutton();
    			ob12.selectdistrict();
    			ob12.selectproperty();
    			driver.navigate().back();
    			ob12.clickmyhomebutton();
    			ob12.clicklogoutbutton();
    			//driver.navigate().back();
    		}
                 
                  	}
	}
		else
	{
	    	System.out.println("pass");

}
}
}
}

