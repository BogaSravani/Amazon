package pageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Homepage extends Baseclass {
	Homepage() throws IOException
	{
		super();
	}
	//declaration
@FindBy(linkText="Amazon miniTV")
WebElement minitv;
@FindBy(css="[href='/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics']")
WebElement elect;
//intialization
public Homepage(WebDriver driver)throws Exception
{
	PageFactory.initElements(driver,this);
}
//utilization
public Amazonminitv minitvclick() throws Exception
{
	minitv.click();
	return  new Amazonminitv();
}
public void Electronic()
{
	elect.click();
}
}
