package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import page.FacebookPage;

public class PageTest extends BaseTest {
FacebookPage obj;
@BeforeClass
public void objinit()
{
 obj=new FacebookPage(driver);
}

@Test
public void TC_01()
{
	obj.verifypage();
	obj.createaccount();
	obj.firstName("ARYA");
	obj.lastName("SREEKUMAR");
	obj.setDay();
	obj.setMonth();
	obj.setYear();
	obj.setGender();
	obj.setEmail("aryasree45@yahoo.com");
	obj.setNewpassword("Aryasree@2000");
	obj.signupbtn();
}
}
