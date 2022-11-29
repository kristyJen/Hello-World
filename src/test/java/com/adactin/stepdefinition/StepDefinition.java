package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver= RunnerClass.driver; //to get the driver from RunnerClass
	@Given("^user Launch The Adactin Application$")
	public static void user_Launch_The_Adactin_Application() throws Throwable {
		 driver.get("https://adactinhotelapp.com/");
	}
	@When("^user Enter The Username In Username Field$")
	public static void user_Enter_The_Username_In_Username_Field() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("kristyJeni");
	}

	@When("^user Enter The Password In Password Field$")
	public static void user_Enter_The_Password_In_Password_Field() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("123456");
	}

	@Then("^user Click On The Login Button and It Navigates To Search Hotel Page$")
	public static void user_Click_On_The_Login_Button_and_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		driver.findElement(By.id("login")).click();
	}
	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		WebElement location= driver.findElement(By.cssSelector("#location"));
	}

	@When("^user Select The Hotel Name$")
	public void user_Select_The_Hotel_Name() throws Throwable {
		WebElement hotel= driver.findElement(By.id("hotels"));
	}

	@When("^user Select The Type of Room$")
	public void user_Select_The_Type_of_Room() throws Throwable {
		WebElement roomType= driver.findElement(By.cssSelector("#room_type"));
	}

	@When("^user Select The Number Of Rooms Needed$")
	public void user_Select_The_Number_Of_Rooms_Needed() throws Throwable {
		WebElement no_rooms= driver.findElement(By.id("room_nos"));
	}

	@When("^user Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
		driver.findElement(By.id("datepick_in")).sendKeys("25/12/2022");
	}

	@When("^user Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {
	}

	@When("^user Select The Number Of Adults Per Room$")
	public void user_Select_The_Number_Of_Adults_Per_Room() throws Throwable {
	}

	@When("^user Select The Number Of Children Per Room$")
	public void user_Select_The_Number_Of_Children_Per_Room() throws Throwable {
	}

	@Then("^user Click The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
	}

	@When("^user Click The Button Of the Needed Hotel$")
	public void user_Click_The_Button_Of_the_Needed_Hotel() throws Throwable {
	}

	@Then("^user Click The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
	}

	@When("^user Enter The Valid First Name$")
	public void user_Enter_The_Valid_First_Name() throws Throwable {
	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
	}

	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
	}

	@When("^user Enter The CreditCard Number$")
	public void user_Enter_The_CreditCard_Number() throws Throwable {
	}

	@When("^user Select The Type Of The CreditCard$")
	public void user_Select_The_Type_Of_The_CreditCard() throws Throwable {
	}

	@When("^user Provide The Expiry Date Of The Card By Selecting Month And Year$")
	public void user_Provide_The_Expiry_Date_Of_The_Card_By_Selecting_Month_And_Year() throws Throwable {
	}

	@When("^user Enter The CCV Number Of The Card$")
	public void user_Enter_The_CCV_Number_Of_The_Card() throws Throwable {
	}

	@Then("^user Click The Book Now Botton And It Confirm The Booking By Generating The Order Number$")
	public void user_Click_The_Book_Now_Botton_And_It_Confirm_The_Booking_By_Generating_The_Order_Number() throws Throwable {
	}

	@When("^user Click The Logout Button$")
	public void user_Click_The_Logout_Button() throws Throwable {
	}

	@Then("^user Logged out Of The Appliction And It Goes to Click Here To Login Again Page$")
	public void user_Logged_out_Of_The_Appliction_And_It_Goes_to_Click_Here_To_Login_Again_Page() throws Throwable {
	}


}
