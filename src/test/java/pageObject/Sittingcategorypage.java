package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sittingcategorypage {
public WebDriver ldriver;
	
    public Sittingcategorypage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
    
    //sitting master
    @FindBy(xpath="//*[@id=\"myButton8\"]/mat-icon")
    @CacheLookup
    WebElement btnsitting;
    
    //sitting master category
    @FindBy(xpath="(//div[@class='d-flex col-2 sub-master'])[1]")
    @CacheLookup
    WebElement btnsitcat;

  //sitting master create category
    @FindBy(xpath="//span[normalize-space()='add']")
    @CacheLookup
    WebElement btncreatecat;
    
  //sitting master category name
    @FindBy(xpath="//*[@id=\"exampleFormControlInput1\"]")
    @CacheLookup
    WebElement btncatname;
    
  //sitting master category create
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement btncatcreate;
    
    
   //Action methods
	public void btnsitting() {
		// TODO Auto-generated method stub
		btnsitting.click();
	}

	public void btnsitcat() {
		// TODO Auto-generated method stub
		btnsitcat.click();
	}

	public void btncreatecat() {
		// TODO Auto-generated method stub
		btncreatecat.click();
	}

	public void btncatname() {
		// TODO Auto-generated method stub
		btncatname.sendKeys("Test");
	}

	public void btncatcreate() {
		// TODO Auto-generated method stub
		btncatcreate.click();
	}

}
