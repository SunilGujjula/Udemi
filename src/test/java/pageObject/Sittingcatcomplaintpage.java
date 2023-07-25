package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sittingcatcomplaintpage {
	
public WebDriver ldriver;
	
    public Sittingcatcomplaintpage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //sitting master
    @FindBy(xpath="//*[@id=\"myButton8\"]/mat-icon")
    @CacheLookup
    WebElement btnsitting7;
    
    //sitting master complaint
    @FindBy(xpath="(//div[@class='d-flex col-2 sub-master'])[13]")
    @CacheLookup
    WebElement btncatc;
    
  //sitting master create category 
    @FindBy(xpath="//span[normalize-space()='add']")
    @CacheLookup
    WebElement btnnew;
    
  //sitting master select category name
    @FindBy(xpath="//*[@id=\"categoryName\"]")
    @CacheLookup
    WebElement btnname;
    
  //sitting master cat complaint apply
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement btncmltapply;
   
    
   //action methods
	public void btnsitting7() {
		// TODO Auto-generated method stub
		btnsitting7.click();
	}

	public void btncatc() {
		// TODO Auto-generated method stub
		btncatc.click();
	}

	public void btnnew() {
		// TODO Auto-generated method stub
		btnnew.click();
	}

	public void btnname() {
		// TODO Auto-generated method stub
		btnname.sendKeys("test");
	}

	public void btncmltapply() {
		// TODO Auto-generated method stub
		btncmltapply.click();
	}

}
