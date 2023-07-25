package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sittingrolepage {

	
	public WebDriver ldriver;

	public Sittingrolepage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//sitting master
    @FindBy(xpath="//*[@id=\"myButton8\"]/mat-icon")
    @CacheLookup
    WebElement btnsitting0;
    
    //role
    @FindBy(xpath="(//div[@class='d-flex col-2 sub-master'])[7]")
    @CacheLookup
    WebElement btnrole;
    
  //create role
    @FindBy(xpath="//span[normalize-space()='add']")
    @CacheLookup
    WebElement btnaddrole;
    
  // create name
    @FindBy(xpath="(//*[@id=\"exampleFormControlInput1\"])[1]")
    @CacheLookup
    WebElement btnrolename;
    
 // customer
    @FindBy(xpath="(//*[@id=\"exampleFormControlInput1\"])[1]")
    @CacheLookup
    WebElement btnroleradio;
    
 // Ticket
    @FindBy(xpath="(//*[@id=\"exampleFormControlInput1\"])[1]")
    @CacheLookup
    WebElement btnroleticket;
    
  // apply
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement btnroleyaply;

	public void btnsitting0() {
		// TODO Auto-generated method stub
		btnsitting0.click();
	}

	public void btnrole() {
		// TODO Auto-generated method stub
		btnrole.click();
	}

	public void btnaddrole() {
		// TODO Auto-generated method stub
		btnaddrole.click();
	}

	public void btnrolename() {
		// TODO Auto-generated method stub
		btnrolename.sendKeys("Agent11");
	}

	public void btnroleradio() {
		// TODO Auto-generated method stub
		btnroleradio.click();
	}

	public void btnroleticket() {
		// TODO Auto-generated method stub
		btnroleticket.click();
	}

	public void btnroleyaply() {
		// TODO Auto-generated method stub
		btnroleyaply.click();
	}
}
