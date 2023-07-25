package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KBcreatepage {
	
public WebDriver ldriver;
	
    public KBcreatepage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
  //KB
    @FindBy(xpath="//*[@id=\"myButton5\"]/mat-icon")
    @CacheLookup
    WebElement btnKb1;

  //KB create click
    @FindBy(xpath="//p[normalize-space()='Create Knowledge Base']")
    @CacheLookup
    WebElement btnKBcreate;
    
  //KB create kb button
    @FindBy(xpath="(//span[normalize-space()='add'])[2]")
    @CacheLookup
    WebElement btnKBcreatebt;
    
  //KB create kb title
    @FindBy(xpath="//*[@id=\"exampleFormControlInput1\"]")
    @CacheLookup
    WebElement btnKBtitle;
    
  //KB create kb select category
    @FindBy(xpath="//*[@id=\"kbGroup\"]")
    @CacheLookup
    WebElement btnKBcategorys;
    
  //KB create kb category
    @FindBy(xpath="//option[normalize-space()='Today Offers']")
    @CacheLookup
    WebElement btnKBcategory;
    
   //KB create kb select group
    @FindBy(xpath="/html/body/app-root/app-kb/nav[1]/div/div/div[2]/form/div[2]/div[3]/ng-multiselect-dropdown/div/div[1]/span/span[1]")
    @CacheLookup
    WebElement btnKBgps;
    
  //KB create kb group
    @FindBy(xpath="(//li[@class='multiselect-item-checkbox ng-star-inserted'])[3]")
    @CacheLookup
    WebElement btnKBgp;
    
  //KB create kb description
    @FindBy(xpath="//*[@id=\"tiny-angular_97720142191686910692091_ifr\"]")
    @CacheLookup
    WebElement btnKBdesc;
    
  //KB create kb apply
    @FindBy(xpath="(//button[normalize-space()='Create'])[1]")
    @CacheLookup
    WebElement btnKBapply;
 
    
 //Action methods
	public void btnKb1() {
		// TODO Auto-generated method stub
		btnKb1.click();
	}

	public void btnKBcreate() {
		// TODO Auto-generated method stub
		btnKBcreate.click();
	}

	public void btnKBcreatebt() {
		// TODO Auto-generated method stub
		btnKBcreatebt.click();
	}

	public void btnKBtitle() {
		// TODO Auto-generated method stub
		btnKBtitle.sendKeys("test");
	}
	
	public void btnKBcategorys() {
		// TODO Auto-generated method stub
		btnKBcategorys.click();
	}

	public void btnKBcategory() {
		// TODO Auto-generated method stub
		btnKBcategory.click();
	}
	
	public void btnKBgps() {
		// TODO Auto-generated method stub
		btnKBgps.click();
	}

	public void btnKBgp() {
		// TODO Auto-generated method stub
		btnKBgp.click();
	}

	public void btnKBdesc() {
		// TODO Auto-generated method stub
		btnKBdesc.sendKeys("This is kb");
	}

	public void btnKBapply() { //*[@id="tiny-angular_97720142191686910692091_ifr"]
		// TODO Auto-generated method stub
		btnKBapply.click();
	}  

}
