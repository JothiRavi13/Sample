package com.app.stepdefenition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition {
	public  WebDriver dr;
	@Given("Open browser")
	public void open_browser() {
	    dr= new ChromeDriver();
	   }
	@Given("Launch Adactin URL {string}")
	public void launch_adactin_url(String a) {
		dr.get(a);
	}
	@When("Enter Usename {string}")
	public void enter_usename(String b) {
	   dr.findElement(By.id("username")).sendKeys(b);
	}
	@When("Enter password {string}")
	public void enter_password(String c) {
		 dr.findElement(By.id("password")).sendKeys(c);
	}
	@Then("Click login button")
	public void click_login_button() {
		 dr.findElement(By.id("login")).click();
	}
	
	
	//background
	
	@Given("OpenBrowser and launchURL")
	public void open_browser_and_launch_url() {
		dr= new ChromeDriver();
		dr.get("https://adactinhotelapp.com/");
	}
	@When("Enter the username {string}")
	public void enter_the_username(String a) {
		 dr.findElement(By.id("username")).sendKeys(a);
	}
	@When("Enter the password {string}")
	public void enter_the_password(String b) {
		 dr.findElement(By.id("password")).sendKeys(b);
	}
	@When("Click the login button")
	public void click_the_login_button() {
		 dr.findElement(By.id("login")).click();
	}
	@Then("Validate the Home page")
	public void validate_the_home_page() {
	   
	}
	
	//aslist
	
	@When("Enter the values present in the form")
	public void enter_the_values_present_in_the_form(DataTable values) {
	    List<String> a= values.asList();
	    System.out.println(a.get(2));
	}

	
	//aslists
	
	@When("Enter the values present in the form asLists")
	public void enter_the_values_present_in_the_form_as_lists(DataTable data) {
	    List<List<String>> b= data.asLists();
	    System.out.println(b.get(1).get(1));
	}

	
	//asmap
	
	@When("Enter the values present in the form asmap")
	public void enter_the_values_present_in_the_form_asmap(DataTable data) {
	    Map<String,String> c= data.asMap();
	    System.out.println(c.get("email"));
	}
	
	


}
