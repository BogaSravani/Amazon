package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Amazonminitv extends Baseclass{
	Amazonminitv()throws Exception
	{
		
	}
//declarrrre
	@FindBy(css="[href='/minitv/ct/web-series']")
	WebElement webseries;
//intialize
	public Amazonminitv(WebDriver driver)throws Exception
	{
		PageFactory.initElements(driver,this);
	}
//utilization
	public void webseries()
	{
		webseries.click();
	}
}
