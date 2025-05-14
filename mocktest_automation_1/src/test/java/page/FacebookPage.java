package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FacebookPage {
WebDriver driver;
public FacebookPage(WebDriver driver)
{
	this.driver=driver;
}
public void verifypage()
{
	String expect_url="https://www.facebook.com/";
	String actual_url=driver.getCurrentUrl();
	Assert.assertEquals(actual_url, expect_url);
}
public void createaccount()
{
	String expect_txt="Create new account";
	WebElement create=driver.findElement(By.xpath("//a[text()='Create new account']"));
	
	String actual_txt=create.getText();
	Assert.assertEquals(actual_txt, expect_txt);
	create.click();
}
public void firstName(String name)
{
	WebElement fname=driver.findElement(By.name("firstname"));
	fname.sendKeys(name);
}
public void lastName(String lname)
{
	WebElement lastname=driver.findElement(By.name("lastname"));
	lastname.sendKeys(lname);
}
public void setDay()
{
	WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select sel=new Select(day);
	sel.selectByVisibleText("5");
}
public void setMonth()
{
	WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select sel=new Select(month);
	sel.selectByVisibleText("Jun");
}
public void setYear()
{
	WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select sel=new Select(year);
	sel.selectByVisibleText("2002");
}
public void setGender()
{
	WebElement gen=driver.findElement(By.xpath("//input[@value=1]"));
	gen.click();
}
public void setEmail(String mail)
{
	WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	email.sendKeys(mail);
}


public void setNewpassword(String paswd)
{
	WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	password.sendKeys(paswd);
}
public void signupbtn()
{
	WebElement signup=driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
	signup.click();
}

}
