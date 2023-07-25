package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sittingfacilitypage {
	
public WebDriver ldriver;
	
    public Sittingfacilitypage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //sitting master
    @FindBy(xpath="//*[@id=\"myButton8\"]/mat-icon")
    @CacheLookup
    WebElement btnsitting3;
    
    //sitting master facility
    @FindBy(xpath="(//div[@class='d-flex col-2 sub-master'])[9]")
    @CacheLookup
    WebElement btnsitfaty;
    
  //sitting master facility create
    @FindBy(xpath="//span[normalize-space()='add']")
    @CacheLookup
    WebElement btnfatycrt;
    
  //sitting master facility create name
    @FindBy(xpath="//*[@id=\"exampleFormControlInput1\"]")
    @CacheLookup
    WebElement btnfatyname;
    
  //sitting master facility create apply
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement btnfatyaply;
    
    

	public void btnsitting3() {
		// TODO Auto-generated method stub
		btnsitting3.click();
	}

	public void btnsitfaty() {
		// TODO Auto-generated method stub
		btnsitfaty.click();
	}

	public void btnfatycrt() {
		// TODO Auto-generated method stub
		btnfatycrt.click();
	}

	public void btnfatyname() {
		// TODO Auto-generated method stub
		btnfatyname.sendKeys("Test");
	}

	public void btnfatyaply() {
		// TODO Auto-generated method stub
		btnfatyaply.click();
	}

}
