package Stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Agentbalancepage;
import pageObject.Auditreportspage;
import pageObject.Complaintpage;
import pageObject.Customerpage;
import pageObject.Departmentreportpage;
import pageObject.KBcreatepage;
import pageObject.KBpage;
import pageObject.Loginpage;
import pageObject.Reportspage;
import pageObject.Sittingcallreasonpage;
import pageObject.Sittingcatcomplaintpage;
import pageObject.Sittingcategorypage;
import pageObject.Sittingcomplaintpage;
import pageObject.Sittingdeptpage;
import pageObject.Sittingfacilitypage;
import pageObject.Sittinggrouppage;
import pageObject.Sittingrolepage;
import pageObject.Ticketpage;






public class Stepdefination {
	
	public WebDriver driver;
	public Loginpage lp;;
	public Customerpage Cust;
	public Ticketpage AddTkt;
	public Reportspage AddRtp;
	public Auditreportspage Audit;
	public Complaintpage Cmplt;
	public Agentbalancepage Agent;
	public Departmentreportpage Deptrtp;
	public KBpage KB;
	public KBcreatepage KBCRT;
	public Sittinggrouppage Sitgrp;
	public Sittingfacilitypage Sitfaty;
	public Sittingdeptpage Sitdep;
	public Sittingcallreasonpage Sitcall;
	public Sittingcomplaintpage Sitcmplt;
	public Sittingcatcomplaintpage Sitcmt;
	public Sittingrolepage Sitrol;
	public Sittingcategorypage Sitcat;


    @Given("User open url {string}")
    public void user_open_url(String url) {
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\sunil\\Download\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
		lp=new Loginpage(driver);
		Cust=new Customerpage(driver);
		AddTkt=new Ticketpage(driver);
		AddRtp=new Reportspage(driver);
		Audit=new Auditreportspage(driver);
		Cmplt=new Complaintpage(driver);
		Agent=new Agentbalancepage(driver);
		Deptrtp=new Departmentreportpage(driver);
		KB=new KBpage(driver);
		KBCRT=new KBcreatepage(driver);
		Sitgrp=new Sittinggrouppage(driver);
		Sitfaty=new Sittingfacilitypage(driver);
		Sitdep=new Sittingdeptpage(driver);
		Sitcall=new Sittingcallreasonpage(driver);
		Sitcmplt=new Sittingcomplaintpage(driver);
		Sitcmt=new Sittingcatcomplaintpage(driver);
		Sitrol=new Sittingrolepage(driver);
		Sitcat=new Sittingcategorypage(driver);
       
    
        driver.get("http://192.168.53.25/helpdesk_beta/login");
        driver.manage().window().maximize();
    }

    @When("User enter the email {string}")
    public void user_enter_the_email(String email) {
        lp.setUserName(email);
    }

    @And("User enter the password {string}")
    public void user_enter_the_password(String password) {
        lp.setpassword(password);
    }

    @Then("Click on Login button")
    public void click_on_login_button() throws InterruptedException {
        lp.ClickLogin();
        Thread.sleep(2000);
    }
    
    
 // customer details

    @When("I click on the customer")
    public void i_click_on_the_customer() throws InterruptedException {
    	Cust.btncustomer(); 
        Thread.sleep(2000);
    }

    @Then("I have to add the customer")
    public void i_have_to_add_the_customer() throws InterruptedException {
    	Cust.btnAddcustomer();
        Thread.sleep(2000);
    }

    @And("I have to text the customer name")
    public void i_have_to_text_the_customer_name() throws InterruptedException {
    	Cust.btnAddname();
        Thread.sleep(2000);
    }

    @And("I have to text the mobile number")
    public void i_have_to_text_the_mobile_number() throws InterruptedException {
    	Cust.btnAddmobile();
        Thread.sleep(2000);
    }

    @Then("I have to click on apply button")
    public void i_have_to_click_on_apply_button() throws InterruptedException {
    	Cust.btnAddcreate();
        Thread.sleep(2000);
    }
    
  //create ticket
	
  	@When("I should click on ticket")
  	public void i_should_click_on_ticket() throws InterruptedException {
  		AddTkt.btncTicket();
  		Thread.sleep(2000);
  	}

  	@Then("I should click on Create ticket")
  	public void i_should_click_on_create_ticket() throws InterruptedException {
  		AddTkt.btncrtTicket();
  		Thread.sleep(2000);
  	}

  	@Then("I should text on mobile number")
  	public void i_should_text_on_mobile_number() throws InterruptedException {
  		AddTkt.btnsearch();
  		Thread.sleep(2000);
  	}

  	@Then("I should click on search")
  	public void i_should_click_on_search() throws InterruptedException {
  		AddTkt.btnsearch2();
  		Thread.sleep(2000);
  	}

  	@Then("I should select the radio button")
  	public void i_should_select_the_radio_button() throws InterruptedException {
  		AddTkt.btnradio();
  		Thread.sleep(2000);
  	}
  	
  	@When("I should select the channel")
  	public void i_should_select_the_channel() {
  		AddTkt.btnchannel();
  	}
  	
  	@Then("I should select the case type")
  	public void i_should_select_the_case_type() {
  		AddTkt.btncasetype();
  	}
  	
  	@When("I should select the complaint category")
  	public void i_should_select_the_complaint_category() throws InterruptedException {
  		AddTkt.btncompt();
  		Thread.sleep(2000);
  	}

  	@Then("I should select the complaint")
  	public void i_should_select_the_complaint() throws InterruptedException {
  		AddTkt.btncateg();
  		Thread.sleep(2000);
  	}
  	
  	@Then("I should select the user")
  	public void i_should_select_the_user() throws InterruptedException {
  		AddTkt.btnselectuser();
  		Thread.sleep(2000);
  	}

  	@Then("I should create the ticket")
  	public void i_should_create_the_ticket() throws InterruptedException {
  		AddTkt.btncreate();
  		Thread.sleep(2000);
  	}



  	
  	//Ticket details............................................................................
  	
  	@When("I click on the {string} button")
  	public void i_click_on_the_button(String Ticket) throws InterruptedException {
  		AddTkt.btnTicket();
  		Thread.sleep(2000);
  	}
  	
  	@When("I click on {string} button")
  	public void i_click_on_button(String filters) throws InterruptedException {
  		AddTkt.btnfiltersclick();
  		Thread.sleep(2000);
  	}
  	
  	@When("User selects the from date as {string}")
  	public void user_selects_the_from_date_as(String frmdate) throws InterruptedException {
  		AddTkt.sendkeys("01-06-2023");
  		Thread.sleep(2000);
  	}

  	@When("User selects the to date as {string}")
  	public void user_selects_the_to_date_as(String Todate) throws InterruptedException {
  		AddTkt.sendkeys1("2023-06-14");
  		Thread.sleep(2000);
  	}
  	
  	@Then("I select the {string}")
  	public void i_select_the(String facility) throws InterruptedException {
  		AddTkt.btnselectfacility();
  		Thread.sleep(2000);
  	}

  	@When("I select the department {string}")
  	public void i_select_the_department(String department) throws InterruptedException {
  		AddTkt.btnselectdepartment();
  		Thread.sleep(2000);
  	}

  	@When("I select the Agent {string}")
  	public void i_select_the_agent(String Agent) throws InterruptedException {
//  		driver.navigate().refresh();
  		AddTkt.btnselectAgent();
  		Thread.sleep(2000);
  	}
  	
  	//selectby create
  	@Then("I select the Agent name {string}")
  	public void i_select_the_agent_name(String create) throws InterruptedException {
  		AddTkt.btnselectctd();
  		Thread.sleep(2000);
  	}
  	
  	@Then("I click on Apply button")
  	public void i_click_on_apply_button() throws InterruptedException {
  		AddTkt.btnclickapply();
  		Thread.sleep(2000);
  	}



		//Reports.....................................................................................
		@Given("I have to click {string} button")
		public void i_have_to_click_button(String reports) throws InterruptedException {
			AddRtp.btnreportsclick();
			Thread.sleep(2000);
		}

		@When("I have to Click Reports {string} button.")
		public void i_have_to_click_reports_button(String ticketreports) throws InterruptedException {
			AddRtp.btnticketreports();
			Thread.sleep(2000);
		}
		
		@When("I had to click {string} button")
		public void i_had_to_click_button(String thismonth) throws InterruptedException {
			AddRtp.btnselectmnt();
			Thread.sleep(2000);
		}

		@Then("I have to select the {string}")
		public void i_have_to_select_the(String select) throws InterruptedException {
			AddRtp.btnselectthismnt();
			Thread.sleep(2000);
		   
		}

		@Then("I have to click {string}")
		public void i_have_to_click(String aply) throws InterruptedException {
			AddRtp.btnaply();
			Thread.sleep(2000);
		}
		
		
		
		//Audit reports...........................................................................................
		
		@Given("I have to click Reports button {string}")
		public void i_have_to_click_reports_button1(String reports) throws InterruptedException {
			Audit.btnreports3();
			Thread.sleep(2000);
		}

		@When("I had to click call Audit reports")
		public void i_had_to_click_call_audit_reports() throws InterruptedException {
			Audit.btnAuditrtp();
			Thread.sleep(2000);
		}

		@When("I had the click filters button {string}")
		public void i_had_the_click_filters_button(String facility) throws InterruptedException {
			Audit.btnAuditflt();
			Thread.sleep(2000);
		}

		@Then("I had to select weak {string}")
		public void i_had_to_select_weak(String selectreports) throws InterruptedException {
			Audit.btnAuditweek();
			Thread.sleep(2000);
			
		}

		@Then("I had to click apply button")
		public void i_had_to_click_apply_button() throws InterruptedException {
			Audit.btnAuditaply();
			Thread.sleep(2000);
		}

		
		
		
		
		
		//Complaint........................................................................
		
		@Given("I go to click reports")
		public void i_go_to_click_reports() throws InterruptedException {
			Cmplt.btnrtp6();
			Thread.sleep(2000);
		}

		@When("I go to click complaint reports")
		public void i_go_to_click_complaint_reports() throws InterruptedException {
			Cmplt.btncmplt();
			Thread.sleep(2000);
		}
		
		//Agent work balance.........................................................................

		@Given("I went to click reports")
		public void i_went_to_click_reports() throws InterruptedException {
			Agent.btnrtp7();
			Thread.sleep(2000);
		}

		@When("I went to click Agent work balance")
		public void i_went_to_click_agent_work_balance() throws InterruptedException {
			Agent.btnAgent();
			Thread.sleep(2000);
		}
		
		
		//Department work balance................................................
		
		@Given("I have to click dept {string}")
		public void i_have_to_click_dept(String depreport) throws InterruptedException {
			Deptrtp.btnrtp8();
			Thread.sleep(2000);
		}

		@When("I have to click department work balance")
		public void i_have_to_click_department_work_balance() throws InterruptedException {
			Deptrtp.btnDeptrpt();
			Thread.sleep(2000);
		}
		
		//KB....................................................................................................
		
		@Given("I have to click {string} kb")
		public void i_have_to_click_kb(String string) throws InterruptedException {
			KB.btnKb();
			Thread.sleep(2000);
		}

		@When("I have to click Knowledge base")
		public void i_have_to_click_knowledge_base() throws InterruptedException {
			KB.btnDeptrpt();
			Thread.sleep(2000);
		}
		
		@When("I have to choose category")
		public void i_have_to_choose_category() throws InterruptedException {
			KB.btnKBcat();
			Thread.sleep(2000);
		}

		@Then("I have to select the category {string}")
		public void i_have_to_select_the_category(String select) {
			KB.btnKBselect();
		}

		@Then("I have to choose group")
		public void i_have_to_choose_group() throws InterruptedException {
			KB.btnKBcatg();
			Thread.sleep(2000);
		}

		@Then("I have to select group {string}")
		public void i_have_to_select_group(String select) throws InterruptedException {
			KB.btnKBselectg();
			Thread.sleep(2000);
		}
		
		
		//KB create
		
		@Given("I have to click Knowledge {string}")
		public void i_have_to_click_knowledge(String KB) throws InterruptedException {
			KBCRT.btnKb1();
			Thread.sleep(2000);
		}
	
		@When("I have to click create KB")
		public void i_have_to_click_create_kb() throws InterruptedException {
			KBCRT.btnKBcreate();
			Thread.sleep(2000);
		}
	
		@When("I have to click KB create")
		public void i_have_to_click_kb_create() throws InterruptedException {
			KBCRT.btnKBcreatebt();
			Thread.sleep(2000);
		}
	
		@Then("I have to text on title")
		public void i_have_to_text_on_title() throws InterruptedException {
			KBCRT.btnKBtitle();
			Thread.sleep(2000);
		}
		
		@Then("I have to select category1")
		public void i_have_to_select_category1() throws InterruptedException {
			KBCRT.btnKBcategorys();
			Thread.sleep(2000);
		}
	
		@Then("I have to select Today offers category")
		public void i_have_to_select_today_offers_category() throws InterruptedException {
			KBCRT.btnKBcategory();
			Thread.sleep(2000);
		}
		
		@Then("I have to select group1")
		public void i_have_to_select_group1() throws InterruptedException {
			KBCRT.btnKBgps();
			Thread.sleep(2000);
		}
		
	
		@Then("I have to select Drama group")
		public void i_have_to_select_drama_group() throws InterruptedException {
			KBCRT.btnKBgp();
			Thread.sleep(2000);
		}
	
		@Then("I have to text the describe {string}")
		public void i_have_to_text_the_describe(String KB) throws InterruptedException {
			KBCRT.btnKBdesc();
			Thread.sleep(2000);
		}
	
		@Then("I have to click the button create")
		public void i_have_to_click_the_button_create() throws InterruptedException {
			KBCRT.btnKBapply();
			Thread.sleep(2000);
		}

		
	//Sittings master
		//Category
		@Given("I have to click on sitting master")
		public void i_have_to_click_on_sitting_master() throws InterruptedException {
			Sitcat.btnsitting();
			Thread.sleep(2000);
		}

		@When("I have to click the category")
		public void i_have_to_click_the_category() throws InterruptedException {
			Sitcat.btnsitcat();
			Thread.sleep(2000);
		}

		@Then("I have to click on create category KB")
		public void i_have_to_click_on_create_category_kb() throws InterruptedException {
			Sitcat.btncreatecat();
			Thread.sleep(2000);
		}

		@When("I have to give the category name")
		public void i_have_to_give_the_category_name() throws InterruptedException {
			Sitcat.btncatname();
			Thread.sleep(2000);
		}

		@Then("I have to click on create")
		public void i_have_to_click_on_create() throws InterruptedException {
			Sitcat.btncatcreate();
			Thread.sleep(2000);
		}
		
		//Group.....................................................................................................
		
		@Given("I had to click on sitting")
		public void i_had_to_click_on_sitting() throws InterruptedException {
			Sitgrp.btnsitting1();
			Thread.sleep(2000);
		}

		@When("I had to click on group")
		public void i_had_to_click_on_group() throws InterruptedException {
			Sitgrp.btnsitgp();
			Thread.sleep(2000);
		}

		@Then("I had to click on create group")
		public void i_had_to_click_on_create_group() throws InterruptedException {
			Sitgrp.btncreategp();
			Thread.sleep(2000);
		}
		
		@Then("I had to select the group category")
		public void i_had_to_select_the_group_category() throws InterruptedException {
			Sitgrp.btnseletcat();
			Thread.sleep(2000);
		}

		@When("I had to gave the group name")
		public void i_had_to_gave_the_group_name() throws InterruptedException {
			Sitgrp.btngpname();
			Thread.sleep(2000);
		}

		@Then("I had to click on add create button")
		public void i_had_to_click_on_add_create_button() throws InterruptedException {
			Sitgrp.btngpcreate();
			Thread.sleep(2000);
		}
		
		
		//sitting role
		
		@Given("I should click the sittings")
		public void i_should_click_the_sittings() throws InterruptedException {
			Sitrol.btnsitting0();
			Thread.sleep(2000);
		}

		@Then("I should select the role")
		public void i_should_select_the_role() throws InterruptedException {
			Sitrol.btnrole();
			Thread.sleep(2000);
		}

		@Then("I should click on create role")
		public void i_should_click_on_create_role() throws InterruptedException {
			Sitrol.btnaddrole();
			Thread.sleep(2000);
		}

		@Then("I should text on role name")
		public void i_should_text_on_role_name() throws InterruptedException {
			Sitrol.btnrolename();
			Thread.sleep(2000);
		}

		@Then("I should select the customer radio button")
		public void i_should_select_the_customer_radio_button() throws InterruptedException {
			Sitrol.btnroleradio();
			Thread.sleep(2000);
		}

		@Then("I should select the ticket radio button")
		public void i_should_select_the_ticket_radio_button() throws InterruptedException {
			Sitrol.btnroleticket();
			Thread.sleep(2000);
		}

		@Then("I should click the create button")
		public void i_should_click_the_create_button() throws InterruptedException {
			Sitrol.btnroleyaply();
			Thread.sleep(2000);
		}

		

		//Sitting facitity..........................................................................
		
		@Given("I had to click sitting masters")
		public void i_had_to_click_sitting_masters() throws InterruptedException {
			Sitfaty.btnsitting3();
			Thread.sleep(2000);
		}

		@When("I have to click on Facility")
		public void i_have_to_click_on_facility() throws InterruptedException {
			Sitfaty.btnsitfaty();
			Thread.sleep(2000);
		}

		@Then("I have to create on facility")
		public void i_have_to_create_on_facility() throws InterruptedException {
			Sitfaty.btnfatycrt();
			Thread.sleep(2000);
		}

		@Then("I have to text on facility name {string}")
		public void i_have_to_text_on_facility_name(String string) throws InterruptedException {
			Sitfaty.btnfatyname();
			Thread.sleep(2000);
		}

		@Then("I have click on apply")
		public void i_have_click_on_apply() throws InterruptedException {
			Sitfaty.btnfatyaply();
			Thread.sleep(2000);
		}
		
		//Department...........................................................
		
		@Given("I have to click sittings")
		public void i_have_to_click_sittings() throws InterruptedException {
			Sitdep.btnsitting4();
			Thread.sleep(2000);
		}

		@When("I have to click on department")
		public void i_have_to_click_on_department() throws InterruptedException {
			Sitdep.btnsitdep();
			Thread.sleep(2000);
		}
		
		@Then("I have to click the create department")
		public void i_have_to_click_the_create_department() throws InterruptedException {
			Sitdep.btndepcrte();
			Thread.sleep(2000);
		}

		@Then("I have to select the facitity")
		public void i_have_to_select_the_facitity() throws InterruptedException {
			Sitdep.btnsitft();
			Thread.sleep(2000);
		}

		@Then("I have to text on dep name {string}")
		public void i_have_to_text_on_dep_name(String test) throws InterruptedException {
			Sitdep.btnsitdtn();
			Thread.sleep(2000);
		}

		@Then("I have to text on dep label\"test\"")
		public void i_have_to_text_on_dep_label_test() throws InterruptedException {
			Sitdep.btndptlab();
			Thread.sleep(2000);
		}

		@Then("I have to click the create button")
		public void i_have_to_click_the_create_button() throws InterruptedException {
			Sitdep.btndptaply();
			Thread.sleep(2000);
		}
		
		//CAll reason..........................................................................
		
		@Given("I have to click sit mast")
		public void i_have_to_click_sit_mast() throws InterruptedException {
			Sitcall.btnsitting5();
			Thread.sleep(2000);
		}

		@When("I have to click on call reason")
		public void i_have_to_click_on_call_reason() throws InterruptedException {
			Sitcall.btncallr();
			Thread.sleep(2000);
		}

		@Then("I have to click on create call reason")
		public void i_have_to_click_on_create_call_reason() throws InterruptedException {
			Sitcall.btncal();
			Thread.sleep(2000);
		}

		@Then("I have to text call reason {string}")
		public void i_have_to_text_call_reason(String string) throws InterruptedException {
			Sitcall.btncallname();
			Thread.sleep(2000);
		}

		@Then("I have to click an create")
		public void i_have_to_click_an_create() throws InterruptedException {
			Sitcall.btncallcrt();
			Thread.sleep(2000);
		}
		
		
		//Complaint ..............................................................................................
		
		@Given("I have to click sit master")
		public void i_have_to_click_sit_master() throws InterruptedException {
			Sitcmplt.btnsitting6();
			Thread.sleep(2000);
		}

		@When("I click on complaint button")
		public void i_click_on_complaint_button() throws InterruptedException {
			Sitcmplt.btncmplt();
			Thread.sleep(2000);
		}

		@Then("I have to click on new complaint button")
		public void i_have_to_click_on_new_complaint_button() throws InterruptedException {
			Sitcmplt.btncmpltnew();
			Thread.sleep(2000);
		}

		@Then("I have to select the category")
		public void i_have_to_select_the_category() throws InterruptedException {
			Sitcmplt.btncatg();
			Thread.sleep(2000);
		}

		@Then("I have to text the complaint name")
		public void i_have_to_text_the_complaint_name() throws InterruptedException {
			Sitcmplt.btncmpltname();
			Thread.sleep(2000);
		}

		@Then("I have to text on complaint number")
		public void i_have_to_text_on_complaint_number() throws InterruptedException {
			Sitcmplt.btncmpltnumb();
			Thread.sleep(2000);
		}

		@Then("I have to select the priority")
		public void i_have_to_select_the_priority() throws InterruptedException {
			Sitcmplt.btncmpltprt();
			Thread.sleep(2000);
		}

		@Then("I have to select the facility")
		public void i_have_to_select_the_facility() throws InterruptedException {
			Sitcmplt.btncmpltfct();
			Thread.sleep(2000);
		}

		@Then("I have to select the department")
		public void i_have_to_select_the_department() throws InterruptedException {
			Sitcmplt.btncmpltdep();
			Thread.sleep(2000);
		}

		@Then("I have to click the create btn")
		public void i_have_to_click_the_create_btn() throws InterruptedException {
			Sitcmplt.btncreate();
			Thread.sleep(2000);
		}
		
		
		
		//Category complaint....................................................................
		@Given("I have to click sitting mast")
		public void i_have_to_click_sitting_mast() throws InterruptedException {
			Sitcmt.btnsitting7();
			Thread.sleep(2000);
		}

		@When("I have to click an category button")
		public void i_have_to_click_an_category_button() throws InterruptedException {
			Sitcmt.btncatc();
			Thread.sleep(2000);
		}

		@Then("I have to click the create category complaint name")
		public void i_have_to_click_the_create_category_complaint_name() throws InterruptedException {
			Sitcmt.btnnew();
			Thread.sleep(2000);
		}

		@Then("I have to text on category name")
		public void i_have_to_text_on_category_name() throws InterruptedException {
			Sitcmt.btnname();
			Thread.sleep(2000);
		}

		@Then("I have to click cat apply")
		public void i_have_to_click_cat_apply() throws InterruptedException {
			Sitcmt.btncmltapply();
			Thread.sleep(2000);
		}

}
