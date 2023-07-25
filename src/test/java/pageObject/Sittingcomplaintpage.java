package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sittingcomplaintpage {

public WebDriver ldriver;
	
    public Sittingcomplaintpage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //sitting master
    @FindBy(xpath="//*[@id=\"myButton8\"]/mat-icon")
    @CacheLookup
    WebElement btnsitting6;
    
    //sitting master complaint
    @FindBy(xpath="(//div[@class='d-flex col-2 sub-master'])[12]")
    @CacheLookup
    WebElement btncmplt;
    
  //sitting master click new complaint
    @FindBy(xpath="/html/body/app-root/app-ticket-complaint/body/div/div/button")
    @CacheLookup
    WebElement btncmpltnew;
    
  //sitting master select category
    @FindBy(xpath="//option[normalize-space()='After Visit requests']")
    @CacheLookup
    WebElement btncatg;
    
  //sitting master complaint name
    @FindBy(xpath="//input[@name='complaint']")
    @CacheLookup
    WebElement btncmpltname;
    
  //sitting master complaint number
    @FindBy(xpath="//input[@name='complaintCode']")
    @CacheLookup
    WebElement btncmpltnumb;
    
  //sitting master select priority
    @FindBy(xpath="/html/body/app-root/app-new-complaint/body/section/div/div/div/div/div/div/div/div/div/form/div[2]/div[1]/select/option[4]")
    @CacheLookup
    WebElement btncmpltprt;
    
  //sitting master select facility
    @FindBy(xpath="//option[normalize-space()='Damas']")
    @CacheLookup
    WebElement btncmpltfct;
    
  //sitting master select dep
    @FindBy(xpath="//option[normalize-space()='Call Center']")
    @CacheLookup
    WebElement btncmpltdep;
    
  //sitting master create apply
    @FindBy(xpath="/html/body/app-root/app-new-complaint/body/section/div/div/div/div/div/div/div/div/div/form/div[3]/div/div/button[2]")
    @CacheLookup
    WebElement btncreate;

	public void btnsitting6() {
		// TODO Auto-generated method stub
		btnsitting6.click();
	}

	public void btncmplt() {
		// TODO Auto-generated method stub
		btncmplt.click();
	}

	public void btncmpltnew() {
		// TODO Auto-generated method stub
		btncmpltnew.click();
	}

	public void btncatg() {
		// TODO Auto-generated method stub
		btncatg.click();
	}

	public void btncmpltname() {
		// TODO Auto-generated method stub
		btncmpltname.sendKeys("test");
	}

	public void btncmpltnumb() {
		// TODO Auto-generated method stub
		btncmpltnumb.sendKeys("2345");
	}

	public void btncmpltprt() {
		// TODO Auto-generated method stub
		btncmpltprt.click();
	}

	public void btncmpltfct() {
		// TODO Auto-generated method stub
		btncmpltfct.click();
	}

	public void btncmpltdep() {
		// TODO Auto-generated method stub
		btncmpltdep.click();
	}

	public void btncreate() {
		// TODO Auto-generated method stub
		btncreate.click();
	}
	
	
}
