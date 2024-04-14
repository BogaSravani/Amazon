package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pageObject.Amazonminitv;
import pageObject.Homepage;

public class DemoTest extends Baseclass{
	public DemoTest() throws IOException
	{
		super();
	}	
	Homepage h;
	Amazonminitv a;
	@BeforeTest
	public void launch() throws Exception
	{
		Intialization();
		urlsetup();
		  h=new Homepage(driver);
		  a=new Amazonminitv(driver);
		
	}
@Test 
public void dg() throws Exception
{
	 h.minitvclick();
	 a.webseries();
	 String title=driver.getTitle();
	 Assert.assertEquals(title,"https://www.amazon.in/");
}
}
