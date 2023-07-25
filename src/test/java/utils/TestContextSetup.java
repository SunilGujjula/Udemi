package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

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
import pageObject.Sittingcomplaintpage;
import pageObject.Sittingdeptpage;
import pageObject.Sittingfacilitypage;
import pageObject.Sittinggrouppage;
import pageObject.Sittingrolepage;
import pageObject.Ticketpage;
import pageObjects.PageObjectManager;




public class TestContextSetup {
	
	public WebDriver driver;
	public Loginpage ip;;
	public Customerpage Cust;
	public Ticketpage AddTik;
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
	public TestBase testBase;
	public PageObjectManager pageObjectManager;
	
	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());

}
}
