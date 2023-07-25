package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Departmentreportpage {
	
public WebDriver ldriver;
	
    public Departmentreportpage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
  //Ticket
    @FindBy(xpath="//*[@id=\"myButton4\"]/mat-icon")
    @CacheLookup
    WebElement btnrtp8;

  //Ticket complaint button
    @FindBy(xpath="(//div[@class='d-flex col-2 sub-master'])[8]")
    @CacheLookup
    WebElement btnDeptrpt;

	public void btnrtp8() {
		// TODO Auto-generated method stub
		btnrtp8.click();
	}

	public void btnDeptrpt() {
		// TODO Auto-generated method stub
		btnDeptrpt.click();
	}

}
