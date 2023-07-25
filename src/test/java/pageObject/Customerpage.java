package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customerpage {
public WebDriver ldriver;
	
    public Customerpage(WebDriver rdriver)
    {
    	
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Customer
    @FindBy(xpath="//*[@id=\"myButton3\"]/i")
    @CacheLookup
    WebElement btncustomer;
    
    //Add customer 
    @FindBy(xpath="//span[normalize-space()='add']")
    @CacheLookup
    WebElement btnAddcustomer;
    
  //Add customer  name
    @FindBy(xpath="//*[@id=\"name\"]")
    @CacheLookup
    WebElement btnAddname;
    
  //Add customer  mobile number
    @FindBy(xpath="//*[@id=\"mobile_number\"]")
    @CacheLookup
    WebElement btnAddmobile;
    
  //Add customer  create
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement btnAddcreate;
    
    
    //Action methods

    public void btncustomer() {
		// TODO Auto-generated method stub
		btncustomer.click();
	}

	public void btnAddcustomer() {
		// TODO Auto-generated method stub
		btnAddcustomer.click();
	}

	public void btnAddname() {
		// TODO Auto-generated method stub
		btnAddname.clear();
		btnAddname.sendKeys("Sunil");
	}

	public void btnAddmobile() {
		// TODO Auto-generated method stub
		btnAddmobile.clear();
		btnAddmobile.sendKeys("763574365563");
	}

	public void btnAddcreate() {
		// TODO Auto-generated method stub
		btnAddcreate.click();
	}
}
