package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Auditreportspage {
public WebDriver ldriver;
	
    public Auditreportspage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //Ticket
    @FindBy(xpath="//*[@id=\"myButton4\"]/mat-icon")
    @CacheLookup
    WebElement btnreports3;
    
   //Ticket Audit button
    @FindBy(xpath="(//div[@class='d-flex col-2 sub-master'])[3]")
    @CacheLookup
    WebElement btnAuditrtp;
    
  //Ticket reports filters
    @FindBy(xpath="//span[normalize-space()='filter_list'] ")
    @CacheLookup
    WebElement btnAuditflt;
    
  //Ticket reports this week
    @FindBy(xpath="//option[normalize-space()='This Week']")
    @CacheLookup
    WebElement btnAuditweek;
    
  //Apply
    @FindBy(xpath="//button[normalize-space()='Apply']")
    @CacheLookup
    WebElement btnAuditaply;
    
    
  //Action methods
   
	public void btnreports3() {
		// TODO Auto-generated method stub
		btnreports3.click();
	}


	public void btnAuditrtp() {
		// TODO Auto-generated method stub
		btnAuditrtp.click();
	}


	public void btnAuditflt() {
		// TODO Auto-generated method stub
		btnAuditflt.click();
	}


	public void btnAuditweek() {
		// TODO Auto-generated method stub
		btnAuditweek.click();
	}


	public void btnAuditaply() {
		// TODO Auto-generated method stub
		btnAuditaply.click();
	}

	
}
