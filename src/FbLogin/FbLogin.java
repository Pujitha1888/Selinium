package FbLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbLogin {

	private static final int Dec = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver=new ChromeDriver ();
//   driver.get("https://www.facebook.com/login/");
 /* WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		   Email.sendKeys("pujithareddy");
   WebElement Password=driver.findElement(By.xpath("//input[@name='pass']"));
		   Password.sendKeys("puji123");
   WebElement Login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
   Login.click();  */
   driver.get("https://www.facebook.com/signup");
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

   WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
               Firstname.sendKeys("Dharmala");
  WebElement Lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
  Lastname.sendKeys("PujithaReddy");
  WebElement Email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
             Email.sendKeys("puji12@gmail.com");
  WebElement RenterEmail=driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]"));
             RenterEmail.sendKeys("puji12@gmail.com");
  WebElement Password=driver.findElement(By.xpath("//input[@data-type='password']"));
             Password.sendKeys("puji123");
             Select Dropdown=new Select(driver.findElement(By.id("day")));
             Dropdown.selectByValue("5");
             Select Dropdown1=new Select(driver.findElement(By.id("month")));
             Dropdown1.selectByVisibleText("Dec");
             Select Dropdown2=new Select(driver.findElement(By.id("year")));
             Dropdown2.selectByValue("2002");
  WebElement Sex=driver.findElement(By.xpath("//label[text()='Female']"));
              Sex.click();
    WebElement SignUp=driver.findElement(By.xpath("//button[@name='websubmit']"));
    SignUp.click();
         
   
   
            
	}

}
