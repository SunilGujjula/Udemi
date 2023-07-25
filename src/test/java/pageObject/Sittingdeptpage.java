package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sittingdeptpage {
public WebDriver ldriver;
	
    public Sittingdeptpage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    
  //sitting master
    @FindBy(xpath="//*[@id=\"myButton8\"]/mat-icon")
    @CacheLookup
    WebElement btnsitting4;
    
    //sitting master dept
    @FindBy(xpath="(//div[@class='d-flex col-2 sub-master'])[10]")
    @CacheLookup
    WebElement btnsitdep;
    
  //sitting master create
    @FindBy(xpath="//span[normalize-space()='add']")
    @CacheLookup
    WebElement btndepcrte;
    
  //sitting master dept facty
    @FindBy(xpath="//option[normalize-space()='Damas']")
    @CacheLookup
    WebElement btnsitft;
    
  //sitting master dept name
    @FindBy(xpath="(//*[@id=\"exampleFormControlInput1\"])[1]")
    @CacheLookup
    WebElement btnsitdtn;
    
  //sitting master dept name label
    @FindBy(xpath="(//*[@id=\"exampleFormControlInput1\"])[2]")
    @CacheLookup
    WebElement btndptlab;
    
  //sitting master dep create apply
    @FindBy(xpath="//button[normalize-space()='Create']")
    @CacheLookup
    WebElement btndptaply;

    
    
//Action method
	public void btnsitting4() {
		// TODO Auto-generated method stub
		btnsitting4.click();
	}

	public void btnsitdep() {
		// TODO Auto-generated method stub
		btnsitdep.click();
	}
	
	public void btndepcrte() {
		// TODO Auto-generated method stub
		btndepcrte.click();
	}

	public void btnsitft() {
		// TODO Auto-generated method stub
		btnsitft.click();
	}

	public void btnsitdtn() {
		// TODO Auto-generated method stub
		btnsitdtn.sendKeys("test");
	}

	public void btndptlab() {
		// TODO Auto-generated method stub
		btndptlab.sendKeys("dams");
	}

	public void btndptaply() {
		// TODO Auto-generated method stub
		btndptaply.click();
	}


}
