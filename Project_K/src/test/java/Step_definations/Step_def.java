package Step_definations;

import Main_class.Auto_Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_def {
	Auto_Main a = new Auto_Main();

	@Given("user opens {string}")
	public void user_opens(String string) {
		a.Open(string);
	}

	@When("user clicks on Accesorices")
	public void user_clicks_on_accesorices() throws InterruptedException {
		String m = "//a[normalize-space()='Apparel & accessories']";
		a.click(m);
	}

	@Then("user close the browser")
	public void user_close_the_browser() throws InterruptedException {
		a.close();
	}

}
