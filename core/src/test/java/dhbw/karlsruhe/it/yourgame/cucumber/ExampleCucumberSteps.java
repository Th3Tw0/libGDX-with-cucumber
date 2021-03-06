package dhbw.karlsruhe.it.yourgame.cucumber;

import static org.junit.Assert.assertTrue;

import com.badlogic.gdx.Gdx;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dhbw.karlsruhe.it.yourgame.core.YourGame;
import dhbw.karlsruhe.it.yourgame.testhelper.TestHelper;

public class ExampleCucumberSteps {

	@Given("^this is your first cucumber test$")
	public void mainMenuCompletelyLoaded() throws InterruptedException {
		setUp();
		System.out.println("Given");
	}
	
	@When("^you see this$")
	public void clickOnShowInstructions() {
		System.out.println("When");
	}
	
	@Then("^you'll understand the purpose of life$")
	public void showInstructionsScreen() {
		System.out.println("Then: profit");
		assertTrue(true);
	}
	
	private void setUp() throws InterruptedException {
		// prepare Application
		TestHelper.setToMainMenuScreen();
		// get Application listener for manipulation
		YourGame game = (YourGame) Gdx.app.getApplicationListener();
	}
}
