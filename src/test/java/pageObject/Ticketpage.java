package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ticketpage {

	public WebDriver ldriver;

	public Ticketpage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	// Ticket
			@FindBy(xpath = "//*[@id=\"myButton2\"]")
			@CacheLookup
			WebElement btncTicket;

			//create ticket
			@FindBy(xpath = "(//span[normalize-space()='add'])[2]")
		 	@CacheLookup
		 	WebElement btncrtTicket;
			
			//search number
		 	 @FindBy(xpath = "//input[@name='searchInput']")
		 	 @CacheLookup
		 	 WebElement btnsearch;
		 	 
		 	//search button
		 	 @FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
		 	 @CacheLookup
		 	 WebElement btnsearch2;
		 	 
		 	//select name
		 	 @FindBy(xpath = "//*[@id=\"inlineRadio1\"]")
		 	 @CacheLookup
		 	 WebElement btnradio;
		 	 
		 	 //select channel
		 	 @FindBy(xpath= "//option[normalize-space()='Whats App']")
		 	 @CacheLookup
		 	 WebElement btnchannel;
		 	 
		 	//select case type
		 	 @FindBy(xpath= "//option[normalize-space()='Bank customer case']")
		 	 @CacheLookup
		 	 WebElement btncasetype;
		 	 
		 	//complaint category
		 	 @FindBy(xpath = "//option[normalize-space()='Complaint Resolution']")
		 	 @CacheLookup
		 	 WebElement btncompt;
		 	 
		 	//complaint
		 	 @FindBy(xpath = "//option[normalize-space()='unsatisfactory complaing handling']")
		 	 @CacheLookup
		 	 WebElement btncateg;
		 	 
		 	// select user
		 	@FindBy(xpath = "//option[normalize-space()='admin@cbi.ae']")
		 	@CacheLookup
		 	WebElement btnselectuser;
		 	
		 // create
			@FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
			@CacheLookup
			WebElement btncreate;

			public void btncTicket() {
				// TODO Auto-generated method stub
				btncTicket.click();
			}

			public void btncrtTicket() {
				// TODO Auto-generated method stub
				btncrtTicket.click();
			}

			public void btnsearch() {
				// TODO Auto-generated method stub
				btnsearch.sendKeys("763574365563");
			}

			public void btnsearch2() {
				// TODO Auto-generated method stub
				btnsearch2.click();
			}

			public void btnradio() {
				// TODO Auto-generated method stub
				btnradio.click();
			}
			
			public void btnchannel() {
				// TODO Auto-generated method stub
				btnchannel.click();
			}
			
			public void btncasetype() {
				// TODO Auto-generated method stub
				btncasetype.click();
			}

			public void btncompt() {
				// TODO Auto-generated method stub
				btncompt.click();
			}

			public void btncateg() {
				// TODO Auto-generated method stub
				btncateg.click();
			}

			public void btnselectuser() {
				// TODO Auto-generated method stub
				btnselectuser.click();
			}

			public void btncreate() {
				// TODO Auto-generated method stub
				btncreate.click();
			}

	// Ticket
	@FindBy(xpath = "//*[@id=\"myButton2\"]")
	@CacheLookup
	WebElement btnTicket;
	

	// Addfilters
	@FindBy(xpath = "(//span[normalize-space()='filter_list'])[2]")
	@CacheLookup
	WebElement btnfilters;

	// Fromdate
	@FindBy(xpath = "//input[@name='startdate']")
	@CacheLookup
	WebElement btnfrmdate;

	// Tofilters
	@FindBy(xpath = "//input[@name='todate']")
	@CacheLookup
	WebElement btnTodate;

	// select the facility
	@FindBy(xpath = "//option[normalize-space()='CBI']")
	@CacheLookup
	WebElement btnselectfacility;

	// select department
	@FindBy(xpath = "//option[normalize-space()='Legal']")
	@CacheLookup
	WebElement btnselectdepartment;
	
	// select Agent
	@FindBy(xpath = "(//option[normalize-space()='admin@cbi.ae'])[1]")
	@CacheLookup
	WebElement btnselectAgent;

	
	//select createdby
	@FindBy(xpath = "(//option[normalize-space()='admin@cbi.ae'])[2]")
	@CacheLookup
	WebElement btnselectctd;
	
	//apply
	@FindBy(xpath = "//button[normalize-space()='Apply']")
	@CacheLookup
	WebElement btnclickapply;

	// Action methods
	public void btnTicket() {
		// TODO Auto-generated method stub
		btnTicket.click();
	}
	

	public void btnfiltersclick() {
		// TODO Auto-generated method stub
		btnfilters.click();
	}

	public void sendkeys(String frmdate) {
		// TODO Auto-generated method stub
		btnfrmdate.sendKeys("01-06-2023");
	}

	public void sendkeys1(String Todate) {
		// TODO Auto-generated method stub
		btnTodate.sendKeys("2023-06-16");
	}

	public void btnselectfacility() {
		// TODO Auto-generated method stub
		btnselectfacility.click();
	}

	public void btnselectdepartment() {
		// TODO Auto-generated method stub
		btnselectdepartment.click();
	}

	public void btnselectAgent() {
		// TODO Auto-generated method stub
		btnselectAgent.click();
	}

	public void btnselectctd() {
		// TODO Auto-generated method stub
		btnselectctd.click();
	}

	public void btnclickapply() {
		// TODO Auto-generated method stub
		btnclickapply.click();
	}

	

	

	

	

}
