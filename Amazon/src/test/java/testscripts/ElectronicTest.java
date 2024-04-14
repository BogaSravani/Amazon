package testscripts;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pageObject.Homepage;

public class ElectronicTest extends Baseclass{

	public ElectronicTest() throws IOException {
		super();
	}
	Homepage h;
@BeforeTest
public void launch() throws Exception
{
	 Intialization();
	 urlsetup();
	 h=new Homepage(driver);
}
@Test
public void eclick()
{
	h.Electronic();
}
}
