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
        
    }
    
    
 // customer details

    @When("I click on the customer")
    public void i_click_on_the_customer() throws InterruptedException {
    	Cust.btncustomer(); 
        
    }

    @Then("I have to add the customer")
    public void i_have_to_add_the_customer() throws InterruptedException {
    	Cust.btnAddcustomer();
        
    }

    @And("I have to text the customer name")
    public void i_have_to_text_the_customer_name() throws InterruptedException {
    	Cust.btnAddname();
        
    }

    @And("I have to text the mobile number")
    public void i_have_to_text_the_mobile_number() throws InterruptedException {
    	Cust.btnAddmobile();
        
    }

    @Then("I have to click on apply button")
    public void i_have_to_click_on_apply_button() throws InterruptedException {
    	Cust.btnAddcreate();
       
    }
    
  //create ticket
	
  	@When("I should click on ticket")
  	public void i_should_click_on_ticket() throws InterruptedException {
  		AddTkt.btncTicket();
  		
  	}

  	@Then("I should click on Create ticket")
  	public void i_should_click_on_create_ticket() throws InterruptedException {
  		AddTkt.btncrtTicket();
  		
  	}

  	@Then("I should text on mobile number")
  	public void i_should_text_on_mobile_number() throws InterruptedException {
  		AddTkt.btnsearch();
  		
  	}

  	@Then("I should click on search")
  	public void i_should_click_on_search() throws InterruptedException {
  		AddTkt.btnsearch2();
  		
  	}

  	@Then("I should select the radio button")
  	public void i_should_select_the_radio_button() throws InterruptedException {
  		AddTkt.btnradio();
  		
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
  		
  	}

  	@Then("I should select the complaint")
  	public void i_should_select_the_complaint() throws InterruptedException {
  		AddTkt.btncateg();
  		
  	}
  	
  	@Then("I should select the user")
  	public void i_should_select_the_user() throws InterruptedException {
  		AddTkt.btnselectuser();
  		
  	}

  	@Then("I should create the ticket")
  	public void i_should_create_the_ticket() throws InterruptedException {
  		AddTkt.btncreate();
  		
  	}



  	
  	//Ticket details............................................................................
  	
  	@When("I click on the {string} button")
  	public void i_click_on_the_button(String Ticket) throws InterruptedException {
  		AddTkt.btnTicket();
  		
  	}
  	
  	@When("I click on {string} button")
  	public void i_click_on_button(String filters) throws InterruptedException {
  		AddTkt.btnfiltersclick();
  		
  	}
  	
  	@When("User selects the from date as {string}")
  	public void user_selects_the_from_date_as(String frmdate) throws InterruptedException {
  		AddTkt.sendkeys("01-06-2023");
  		
  	}

  	@When("User selects the to date as {string}")
  	public void user_selects_the_to_date_as(String Todate) throws InterruptedException {
  		AddTkt.sendkeys1("2023-06-14");
  		
  	}
  	
  	@Then("I select the {string}")
  	public void i_select_the(String facility) throws InterruptedException {
  		AddTkt.btnselectfacility();
  		
  	}

  	@When("I select the department {string}")
  	public void i_select_the_department(String department) throws InterruptedException {
  		AddTkt.btnselectdepartment();
  		
  	}

  	@When("I select the Agent {string}")
  	public void i_select_the_agent(String Agent) throws InterruptedException {
//  		driver.navigate().refresh();
  		AddTkt.btnselectAgent();
  		
  	}
  	
  	//selectby create
  	@Then("I select the Agent name {string}")
  	public void i_select_the_agent_name(String create) throws InterruptedException {
  		AddTkt.btnselectctd();
  		
  	}
  	
  	@Then("I click on Apply button")
  	public void i_click_on_apply_button() throws InterruptedException {
  		AddTkt.btnclickapply();
  		
  	}



		//Reports.....................................................................................
		@Given("I have to click {string} button")
		public void i_have_to_click_button(String reports) throws InterruptedException {
			AddRtp.btnreportsclick();
			
		}

		@When("I have to Click Reports {string} button.")
		public void i_have_to_click_reports_button(String ticketreports) throws InterruptedException {
			AddRtp.btnticketreports();
			
		}
		
		@When("I had to click {string} button")
		public void i_had_to_click_button(String thismonth) throws InterruptedException {
			AddRtp.btnselectmnt();
			
		}

		@Then("I have to select the {string}")
		public void i_have_to_select_the(String select) throws InterruptedException {
			AddRtp.btnselectthismnt();
			
		   
		}

		@Then("I have to click {string}")
		public void i_have_to_click(String aply) throws InterruptedException {
			AddRtp.btnaply();
			
		}
		
		
		
		//Audit reports...........................................................................................
		
		@Given("I have to click Reports button {string}")
		public void i_have_to_click_reports_button1(String reports) throws InterruptedException {
			Audit.btnreports3();
			
		}

		@When("I had to click call Audit reports")
		public void i_had_to_click_call_audit_reports() throws InterruptedException {
			Audit.btnAuditrtp();
			
		}

		@When("I had the click filters button {string}")
		public void i_had_the_click_filters_button(String facility) throws InterruptedException {
			Audit.btnAuditflt();
			
		}

		@Then("I had to select weak {string}")
		public void i_had_to_select_weak(String selectreports) throws InterruptedException {
			Audit.btnAuditweek();
			
		}

		@Then("I had to click apply button")
		public void i_had_to_click_apply_button() throws InterruptedException {
			Audit.btnAuditaply();
			
		}

		
		
		
		
		
		//Complaint........................................................................
		
		@Given("I go to click reports")
		public void i_go_to_click_reports() throws InterruptedException {
			Cmplt.btnrtp6();
			
		}

		@When("I go to click complaint reports")
		public void i_go_to_click_complaint_reports() throws InterruptedException {
			Cmplt.btncmplt();
			
		}
		
		//Agent work balance.........................................................................

		@Given("I went to click reports")
		public void i_went_to_click_reports() throws InterruptedException {
			Agent.btnrtp7();
			
		}

		@When("I went to click Agent work balance")
		public void i_went_to_click_agent_work_balance() throws InterruptedException {
			Agent.btnAgent();
			
		}
		
		
		//Department work balance................................................
		
		@Given("I have to click dept {string}")
		public void i_have_to_click_dept(String depreport) throws InterruptedException {
			Deptrtp.btnrtp8();
			
		}

		@When("I have to click department work balance")
		public void i_have_to_click_department_work_balance() throws InterruptedException {
			Deptrtp.btnDeptrpt();
			
		}
		
		//KB....................................................................................................
		
		@Given("I have to click {string} kb")
		public void i_have_to_click_kb(String string) throws InterruptedException {
			KB.btnKb();
			
		}

		@When("I have to click Knowledge base")
		public void i_have_to_click_knowledge_base() throws InterruptedException {
			KB.btnDeptrpt();
			
		}
		
		@When("I have to choose category")
		public void i_have_to_choose_category() throws InterruptedException {
			KB.btnKBcat();
			
		}

		@Then("I have to select the category {string}")
		public void i_have_to_select_the_category(String select) {
			KB.btnKBselect();
		}

		@Then("I have to choose group")
		public void i_have_to_choose_group() throws InterruptedException {
			KB.btnKBcatg();
			
		}

		@Then("I have to select group {string}")
		public void i_have_to_select_group(String select) throws InterruptedException {
			KB.btnKBselectg();
			
		}
		
		
		//KB create
		
		@Given("I have to click Knowledge {string}")
		public void i_have_to_click_knowledge(String KB) throws InterruptedException {
			KBCRT.btnKb1();
			
		}
	
		@When("I have to click create KB")
		public void i_have_to_click_create_kb() throws InterruptedException {
			KBCRT.btnKBcreate();
			
		}
	
		@When("I have to click KB create")
		public void i_have_to_click_kb_create() throws InterruptedException {
			KBCRT.btnKBcreatebt();
			
		}
	
		@Then("I have to text on title")
		public void i_have_to_text_on_title() throws InterruptedException {
			KBCRT.btnKBtitle();
			
		}
		
		@Then("I have to select category1")
		public void i_have_to_select_category1() throws InterruptedException {
			KBCRT.btnKBcategorys();
			
		}
	
		@Then("I have to select Today offers category")
		public void i_have_to_select_today_offers_category() throws InterruptedException {
			KBCRT.btnKBcategory();
			
		}
		
		@Then("I have to select group1")
		public void i_have_to_select_group1() throws InterruptedException {
			KBCRT.btnKBgps();
			
		}
		
	
		@Then("I have to select Drama group")
		public void i_have_to_select_drama_group() throws InterruptedException {
			KBCRT.btnKBgp();
			
		}
	
		@Then("I have to text the describe {string}")
		public void i_have_to_text_the_describe(String KB) throws InterruptedException {
			KBCRT.btnKBdesc();
			
		}
	
		@Then("I have to click the button create")
		public void i_have_to_click_the_button_create() throws InterruptedException {
			KBCRT.btnKBapply();
			
		}

		
	//Sittings master
		//Category
		@Given("I have to click on sitting master")
		public void i_have_to_click_on_sitting_master() throws InterruptedException {
			Sitcat.btnsitting();
			
		}

		@When("I have to click the category")
		public void i_have_to_click_the_category() throws InterruptedException {
			Sitcat.btnsitcat();
			
		}

		@Then("I have to click on create category KB")
		public void i_have_to_click_on_create_category_kb() throws InterruptedException {
			Sitcat.btncreatecat();
			
		}

		@When("I have to give the category name")
		public void i_have_to_give_the_category_name() throws InterruptedException {
			Sitcat.btncatname();
			
		}

		@Then("I have to click on create")
		public void i_have_to_click_on_create() throws InterruptedException {
			Sitcat.btncatcreate();
			
		}
		
		//Group.....................................................................................................
		
		@Given("I had to click on sitting")
		public void i_had_to_click_on_sitting() throws InterruptedException {
			Sitgrp.btnsitting1();
			
		}

		@When("I had to click on group")
		public void i_had_to_click_on_group() throws InterruptedException {
			Sitgrp.btnsitgp();
			
		}

		@Then("I had to click on create group")
		public void i_had_to_click_on_create_group() throws InterruptedException {
			Sitgrp.btncreategp();
			
		}
		
		@Then("I had to select the group category")
		public void i_had_to_select_the_group_category() throws InterruptedException {
			Sitgrp.btnseletcat();
			
		}

		@When("I had to gave the group name")
		public void i_had_to_gave_the_group_name() throws InterruptedException {
			Sitgrp.btngpname();
			
		}

		@Then("I had to click on add create button")
		public void i_had_to_click_on_add_create_button() throws InterruptedException {
			Sitgrp.btngpcreate();
			
		}
		
		
		//sitting role
		
		@Given("I should click the sittings")
		public void i_should_click_the_sittings() throws InterruptedException {
			Sitrol.btnsitting0();
			
		}

		@Then("I should select the role")
		public void i_should_select_the_role() throws InterruptedException {
			Sitrol.btnrole();
			
		}

		@Then("I should click on create role")
		public void i_should_click_on_create_role() throws InterruptedException {
			Sitrol.btnaddrole();
			
		}

		@Then("I should text on role name")
		public void i_should_text_on_role_name() throws InterruptedException {
			Sitrol.btnrolename();
			
		}

		@Then("I should select the customer radio button")
		public void i_should_select_the_customer_radio_button() throws InterruptedException {
			Sitrol.btnroleradio();
			
		}

		@Then("I should select the ticket radio button")
		public void i_should_select_the_ticket_radio_button() throws InterruptedException {
			Sitrol.btnroleticket();
			
		}

		@Then("I should click the create button")
		public void i_should_click_the_create_button() throws InterruptedException {
			Sitrol.btnroleyaply();
			
		}

		

		//Sitting facitity..........................................................................
		
		@Given("I had to click sitting masters")
		public void i_had_to_click_sitting_masters() throws InterruptedException {
			Sitfaty.btnsitting3();
			
		}

		@When("I have to click on Facility")
		public void i_have_to_click_on_facility() throws InterruptedException {
			Sitfaty.btnsitfaty();
			
		}

		@Then("I have to create on facility")
		public void i_have_to_create_on_facility() throws InterruptedException {
			Sitfaty.btnfatycrt();
			
		}

		@Then("I have to text on facility name {string}")
		public void i_have_to_text_on_facility_name(String string) throws InterruptedException {
			Sitfaty.btnfatyname();
			
		}

		@Then("I have click on apply")
		public void i_have_click_on_apply() throws InterruptedException {
			Sitfaty.btnfatyaply();
			
		}
		
		//Department...........................................................
		
		@Given("I have to click sittings")
		public void i_have_to_click_sittings() throws InterruptedException {
			Sitdep.btnsitting4();
			
		}

		@When("I have to click on department")
		public void i_have_to_click_on_department() throws InterruptedException {
			Sitdep.btnsitdep();
			
		}
		
		@Then("I have to click the create department")
		public void i_have_to_click_the_create_department() throws InterruptedException {
			Sitdep.btndepcrte();
			
		}

		@Then("I have to select the facitity")
		public void i_have_to_select_the_facitity() throws InterruptedException {
			Sitdep.btnsitft();
			
		}

		@Then("I have to text on dep name {string}")
		public void i_have_to_text_on_dep_name(String test) throws InterruptedException {
			Sitdep.btnsitdtn();
			
		}

		@Then("I have to text on dep label\"test\"")
		public void i_have_to_text_on_dep_label_test() throws InterruptedException {
			Sitdep.btndptlab();
			
		}

		@Then("I have to click the create button")
		public void i_have_to_click_the_create_button() throws InterruptedException {
			Sitdep.btndptaply();
			
		}
		
		//CAll reason..........................................................................
		
		@Given("I have to click sit mast")
		public void i_have_to_click_sit_mast() throws InterruptedException {
			Sitcall.btnsitting5();
			
		}

		@When("I have to click on call reason")
		public void i_have_to_click_on_call_reason() throws InterruptedException {
			Sitcall.btncallr();
			
		}

		@Then("I have to click on create call reason")
		public void i_have_to_click_on_create_call_reason() throws InterruptedException {
			Sitcall.btncal();
			
		}

		@Then("I have to text call reason {string}")
		public void i_have_to_text_call_reason(String string) throws InterruptedException {
			Sitcall.btncallname();
			
		}

		@Then("I have to click an create")
		public void i_have_to_click_an_create() throws InterruptedException {
			Sitcall.btncallcrt();
			
		}
		
		
		//Complaint ..............................................................................................
		
		@Given("I have to click sit master")
		public void i_have_to_click_sit_master() throws InterruptedException {
			Sitcmplt.btnsitting6();
			
		}

		@When("I click on complaint button")
		public void i_click_on_complaint_button() throws InterruptedException {
			Sitcmplt.btncmplt();
			
		}

		@Then("I have to click on new complaint button")
		public void i_have_to_click_on_new_complaint_button() throws InterruptedException {
			Sitcmplt.btncmpltnew();
			
		}

		@Then("I have to select the category")
		public void i_have_to_select_the_category() throws InterruptedException {
			Sitcmplt.btncatg();
			
		}

		@Then("I have to text the complaint name")
		public void i_have_to_text_the_complaint_name() throws InterruptedException {
			Sitcmplt.btncmpltname();
			
		}

		@Then("I have to text on complaint number")
		public void i_have_to_text_on_complaint_number() throws InterruptedException {
			Sitcmplt.btncmpltnumb();
			
		}

		@Then("I have to select the priority")
		public void i_have_to_select_the_priority() throws InterruptedException {
			Sitcmplt.btncmpltprt();
			
		}

		@Then("I have to select the facility")
		public void i_have_to_select_the_facility() throws InterruptedException {
			Sitcmplt.btncmpltfct();
			
		}

		@Then("I have to select the department")
		public void i_have_to_select_the_department() throws InterruptedException {
			Sitcmplt.btncmpltdep();
			
		}

		@Then("I have to click the create btn")
		public void i_have_to_click_the_create_btn() throws InterruptedException {
			Sitcmplt.btncreate();
			
		}
		
		
		
		//Category complaint....................................................................
		@Given("I have to click sitting mast")
		public void i_have_to_click_sitting_mast() throws InterruptedException {
			Sitcmt.btnsitting7();
			
		}

		@When("I have to click an category button")
		public void i_have_to_click_an_category_button() throws InterruptedException {
			Sitcmt.btncatc();
			
		}

		@Then("I have to click the create category complaint name")
		public void i_have_to_click_the_create_category_complaint_name() throws InterruptedException {
			Sitcmt.btnnew();
			
		}

		@Then("I have to text on category name")
		public void i_have_to_text_on_category_name() throws InterruptedException {
			Sitcmt.btnname();
			
		}

		@Then("I have to click cat apply")
		public void i_have_to_click_cat_apply() throws InterruptedException {
			Sitcmt.btncmltapply();
			
		}

}


