package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sittingcallreasonpage {
	
public WebDriver ldriver;
	
    public Sittingcallreasonpage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //sitting master
    @FindBy(xpath="//*[@id=\"myButton8\"]/mat-icon")
    @CacheLookup
    WebElement btnsitting5;
    
    //sitting master call reason
    @FindBy(xpath="(//div[@class='d-flex col-2 sub-master'])[11]")
    @CacheLookup
    WebElement btncallr;
    
  // create
    @FindBy(xpath="//span[normalize-space()='add']")
    @CacheLookup
    WebElement btncal;
    
  //sitting call reason name
    @FindBy(xpath="//*[@id=\"exampleFormControlInput1\"]")
    @CacheLookup
    WebElement btncallname;
    
  //apply
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement btncallcrt;
    
    
//Action method
	public void btnsitting5() {
		// TODO Auto-generated method stub
		btnsitting5.click();
	}

	public void btncallr() {
		// TODO Auto-generated method stub
		btncallr.click();
	}

	public void btncal() {
		// TODO Auto-generated method stub
		btncal.click();
	}

	public void btncallname() {
		// TODO Auto-generated method stub
		btncallname.sendKeys("enquary");
	}

	public void btncallcrt() {
		// TODO Auto-generated method stub
		btncallcrt.click();
	}
    

}
