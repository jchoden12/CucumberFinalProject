package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BackgroundPage;
import pages.TestBase;

public class BackgroundColorStepDefination extends TestBase {

	BackgroundPage background;
//	Given Set sky blue Background button exist

	@Before
	public void beforeRun() {
		initDriver();
		background = PageFactory.initElements(driver, BackgroundPage.class);
	}

	@Given("^Set sky blue Background button exist$")
	public void Set_sky_blue_Background_button_exist() {
		background.verifySetSkyblueBackgroundButton();

	}

	@Given("^\"([^\"]*)\" button exist$")
	public void button_exist(String name) throws Throwable {
	    
	}
   

	@When("^I click on the button$")
	public void i_click_on_the_button() {
		background = PageFactory.initElements(driver, BackgroundPage.class);
		background.clickOnSetSkyblueBackgroundButton();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		background.verifyBackgroundColor();
	}

	@Given("^Set white Background button exist$")
	public void set_white_Background_button_exist() {
		background.verifySetWhiteBackgroundButton();
	}

	@When("^I click on the white button$")
	public void i_click_on_the_white_button() throws Throwable {
		background.clickOnSetWhiteBackgroundButton();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
		background.verifyWhiteBackgroundColor();
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
