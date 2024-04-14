package baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	 public  static WebDriver driver;
	static Properties pos;
public Baseclass() throws IOException
{
	FileInputStream fis=new FileInputStream("./src/main/java/Testdata/testdata");
	  pos=new Properties();
	pos.load(fis);
}
 
public static void Intialization()
{
	String browser=pos.getProperty("browser");
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
		
	}
	else
	{
		driver=new EdgeDriver();
	}
}
 
public static void urlsetup()
{
	driver.get(pos.getProperty("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
}
