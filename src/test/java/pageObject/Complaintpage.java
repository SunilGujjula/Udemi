package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Complaintpage {
public WebDriver ldriver;
	
    public Complaintpage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
  //Ticket
    @FindBy(xpath="//*[@id=\"myButton4\"]/mat-icon")
    @CacheLookup
    WebElement btnrtp6;

  //Ticket complaint button
    @FindBy(xpath="(//div[@class='d-flex col-2 sub-master'])[6]")
    @CacheLookup
    WebElement btncmplt;
    
    

	public void btnrtp6() {
		// TODO Auto-generated method stub
		btnrtp6.click();
	}



	public void btncmplt() {
		// TODO Auto-generated method stub
		btncmplt.click();
	}  

}
