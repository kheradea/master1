package test;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Base;
public class LogInStep extends Base {
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	Base.LaunchURL();
	}
	@When("I enter UserNAme")
	public void i_enter_user_n_ame() {
	lp.userId();
	}
	@When("I enter Password")
	public void i_enter_password() {
	lp.password();
	}
	@When("I click on Log In button")
	public void i_click_on_log_in_button() {
	lp.login();
	}
	@Then("I verify Pin validation screen is Opened")
	public void i_verify_pin_validation_screen_is_opened() {
	Assert.assertEquals(true, lp.pinPageValidation());
	}
	@Then("I enter Pin")
	public void i_enter_pin() {
	lp.pin();
	}
	@Then("I click on continue button")
	public void i_click_on_continue_button() {
	lp.continueButton();
	}
	@Then("I verify LogIn successfull")
	public void i_verify_log_in_successfull() {
	}
	@Then("I close The application")
	public void i_close_the_application() {
	}

	}

