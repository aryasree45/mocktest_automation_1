package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public WebDriver driver;
	Properties prop;
	public void loadprop() throws IOException
	{
		FileInputStream propo=new FileInputStream("C:\\selenium workspace\\mocktest_automation1\\src\\test\\resources\\config.properties");
		 prop=new Properties();
		prop.load(propo);
	}
	
	
	@BeforeTest
	public void setConfig() throws IOException
	{
		loadprop();
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	}

}
