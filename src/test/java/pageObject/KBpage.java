package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KBpage {
	
public WebDriver ldriver;
	
    public KBpage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
  //KB
    @FindBy(xpath="//*[@id=\"myButton5\"]/mat-icon")
    @CacheLookup
    WebElement btnKb;

  //KB button
    @FindBy(xpath="//p[normalize-space()='Knowledge Base view']")
    @CacheLookup
    WebElement btnDeptrpt;
    
  // Kb choose category
    @FindBy(xpath="(//*[@id=\"dropdownMenuButton3\"])[1]")
    @CacheLookup
    WebElement btnKBcat;
    
 // Kb select category
    @FindBy(xpath="//*[@id=\"29\"]")
    @CacheLookup
    WebElement btnKBselect;
    
 // Kb choose group
    @FindBy(xpath="(//*[@id=\"dropdownMenuButton3\"])[2]")
    @CacheLookup
    WebElement btnKBcatg;
    
   //Kb choose group
    @FindBy(xpath="//li[normalize-space()='Derma']")
    @CacheLookup
    WebElement btnKBselectg;
    
    
   //Action methods 
	public void btnKb() {
		// TODO Auto-generated method stub
		btnKb.click();
	}

	public void btnDeptrpt() {
		// TODO Auto-generated method stub
		btnDeptrpt.click();
	}

	public void btnKBcat() {
		// TODO Auto-generated method stub
		btnKBcat.click();
	}

	public void btnKBselect() {
		// TODO Auto-generated method stub
		btnKBselect.click();
	}
	
	public void btnKBcatg() {
		// TODO Auto-generated method stub
		btnKBcatg.click();
	}

	public void btnKBselectg() {
		// TODO Auto-generated method stub
		btnKBselectg.click();
	}

}
