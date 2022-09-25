package com.kyro.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.kyro.properties.FileReadManager;
import com.kyro.runner.RunnerClass;

import PageObjectManager.org.ManagerForKyro;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import kyroBaseClass.org.BaseClass;


public class StepDefinition extends BaseClass {
	public static WebDriver driver=RunnerClass.driver;
	public static ManagerForKyro mk= new ManagerForKyro(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url =FileReadManager.getinstance().getinstanceCR().getUrl();
		getUrl(url);
	}

	@When("^user Click The Login Button And It Will Navigate To Login Page$")
	public void user_Click_The_Login_Button_And_It_Will_Navigate_To_Login_Page() throws Throwable {
		clickonButton(mk.getHp().getClick());
	}

	@When("^user Enter The username In Username Field$")
	public void user_Enter_The_username_In_Username_Field() throws Throwable {
		valueEnterElement(mk.getLd().getUsername(), "rdineshbabu97@gmail.com");
		
	}

	@When("^user Enter The password In Password Field$")
	public void user_Enter_The_password_In_Password_Field() throws Throwable {
		valueEnterElement(mk.getLd().getPassword(), "Dineshrdx@10");
	}

	@When("^user Click The Login Button And It  Will Navigate To Home page$")
	public void user_Click_The_Login_Button_And_It_Will_Navigate_To_Home_page() throws Throwable {
		clickonButton(mk.getLd().getSubmit());
	}

	@Then("^click The Dashboard Button And It Will Navigate To Dashboard Page$")
	public void click_The_Dashboard_Button_And_It_Will_Navigate_To_Dashboard_Page() throws Throwable {
		clickonButton(mk.getDb().getNavtodb());
	}

	@When("^Click The Working Project And It Will Navigate To Project Detail Page$")
	public void click_The_Working_Project_And_It_Will_Navigate_To_Project_Detail_Page() throws Throwable {
		Thread.sleep(6000);
		clickonButton(mk.getAp().getPartiproject());
	}

	@When("^click The New Task Button In The Project Page$")
	public void click_The_New_Task_Button_In_The_Project_Page() throws Throwable {
		Thread.sleep(6000);
		clickonButton(mk.getPd().getProject());
	}

	@When("^enter The Summary In The Summary Field$")
	public void enter_The_Summary_In_The_Summary_Field() throws Throwable {
		valueEnterElement(mk.getNt().getSummary(), "construction task");
	}

	@When("^enter The Test-type In The Test-type Field$")
	public void enter_The_Test_type_In_The_Test_type_Field() throws Throwable {
		valueEnterElement(mk.getNt().getTasktype(), "Testing");
	}

	@When("^enter The Description In The Description Field$")
	public void enter_The_Description_In_The_Description_Field() throws Throwable {
		valueEnterElement(mk.getNt().getDescrip(), "automation");
	}

	@When("^enter The Priority In The priority Field$")
	public void enter_The_Priority_In_The_priority_Field() throws Throwable {
		clickonButton(mk.getNt().getPriority());
		clickonButton(mk.getNt().getType());
	}

	@When("^enter The Location In The Location Field$")
	public void enter_The_Location_In_The_Location_Field() throws Throwable {
		valueEnterElement(mk.getNt().getLocation(),"chennai");
	}

	@When("^enter The Start-Date In The State-Date Field$")
	public void enter_The_Start_Date_In_The_State_Date_Field() throws Throwable {
		valueEnterElement(mk.getNt().getStrtdate(), "24-09-2022");
	}

	@When("^enter The Due-Date In The Due-Date Field$")
	public void enter_The_Due_Date_In_The_Due_Date_Field() throws Throwable {
		valueEnterElement(mk.getNt().getDuedate(), "24-10-2022");
	}

	@Then("^click The Submit Button And It Will Create New task$")
	public void click_The_Submit_Button_And_It_Will_Create_New_task() throws Throwable {
		clickonButton(mk.getNt().getSubmit());
	}

	@Then("^by Using Isdisplayed To Check The Task$")
	public void by_Using_Isdisplayed_To_Check_The_Task() throws Throwable {
		WebElement task = driver.findElement(By.xpath("//div[@aria-rowindex='2']"));
		isdisplayed(task);  
	}


}
