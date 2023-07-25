package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sittinggrouppage {
	
public WebDriver ldriver;
	
    public Sittinggrouppage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //sitting master
    @FindBy(xpath="//*[@id=\"myButton8\"]/mat-icon")
    @CacheLookup
    WebElement btnsitting1;
    
    //sitting master group
    @FindBy(xpath="(//div[@class='d-flex col-2 sub-master'])[2]")
    @CacheLookup
    WebElement btnsitgp;

  //sitting master create group
    @FindBy(xpath="//span[normalize-space()='add']")
    @CacheLookup
    WebElement btncreategp;
    
    //sitting group category
    @FindBy(xpath="//option[normalize-space()='Old Price']")
    @CacheLookup
    WebElement btnseletcat;
    
  //sitting master group name
    @FindBy(xpath="//*[@id=\"exampleFormControlInput1\"]")
    @CacheLookup
    WebElement btngpname;
    
  //sitting master create group
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement btngpcreate;

    
    //Action method
	public void btnsitting1() {
		// TODO Auto-generated method stub
		btnsitting1.click();
	}

	public void btnsitgp() {
		// TODO Auto-generated method stub
		btnsitgp.click();
	}

	public void btncreategp() {
		// TODO Auto-generated method stub
		btncreategp.click();
	}
	
	public void btnseletcat() {
		// TODO Auto-generated method stub
		btnseletcat.click();
	}

	public void btngpname() {
		// TODO Auto-generated method stub
		btngpname.sendKeys("testing");
	}

	public void btngpcreate() {
		// TODO Auto-generated method stub
		btngpcreate.click();
	}


}
