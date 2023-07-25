package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Agentbalancepage {
	
public WebDriver ldriver;
	
    public Agentbalancepage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
  //Ticket
    @FindBy(xpath="//*[@id=\"myButton4\"]/mat-icon")
    @CacheLookup
    WebElement btnrtp7;

  //Ticket complaint button
    @FindBy(xpath="(//div[@class='d-flex col-2 sub-master'])[7]")
    @CacheLookup
    WebElement btnAgent;

	public void btnrtp7() {
		// TODO Auto-generated method stub
		btnrtp7.click();
	}

	public void btnAgent() {
		// TODO Auto-generated method stub
		btnAgent.click();
	}

}
