package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reportspage {
	
public WebDriver ldriver;
	
    public Reportspage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
  //Ticket
    @FindBy(xpath="//*[@id=\"myButton4\"]")
    @CacheLookup
    WebElement btnreports;
    
   //Ticket reports button
    @FindBy(xpath="(//div[@class='d-flex col-2 sub-master'])[1]")
    @CacheLookup
    WebElement btnticketreports;
   
  //Ticket filters button
    @FindBy(xpath="//span[normalize-space()='filter_list']")
    @CacheLookup
    WebElement btnselectmnt;
    
  //Ticket this month button
    @FindBy(xpath="//option[normalize-space()='This Month']")
    @CacheLookup
    WebElement btnselectthismnt;
  //Apply
    @FindBy(xpath="//button[normalize-space()='Apply']")
    @CacheLookup
    WebElement btnaply;
    
    
    
  //Action methods
    public void btnreportsclick() {
		// TODO Auto-generated method stub
    	btnreports.click();
	}

	public void btnticketreports() {
		// TODO Auto-generated method stub
		btnticketreports.click();
	}

	public void btnselectmnt() {
		// TODO Auto-generated method stub
		btnselectmnt.click();
	}

	public void btnselectthismnt() {
		// TODO Auto-generated method stub
		btnselectthismnt.click();
	}

	public void btnaply() {
		// TODO Auto-generated method stub
		btnaply.click();
	}

}
