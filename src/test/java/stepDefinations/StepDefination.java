package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^User  login into application with \"([^\"]*)\"and passowrd \"([^\"]*)\"$")
	public void user_login_into_application_with_and_passowrd(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	
	System.out.println(arg1);
	System.out.println(arg2);
	
	}
	
	

	@Then("^Home page is polpulated$")
	public void home_page_is_polpulated() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^card are displayed \"([^\"]*)\"$")
	public void card_are_displayed(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	
		System.out.println(arg1);
	
		
		
	}
	
}
