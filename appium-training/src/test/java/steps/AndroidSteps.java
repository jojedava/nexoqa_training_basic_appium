package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.home.HomePageAndroid;
import pageobject.home.InitialPopUp;
import utils.WrapMobileDriver;

public class AndroidSteps {

    private AppiumDriver driver;
    private HomePageAndroid homePage;

    public AndroidSteps(){
        this.driver = WrapMobileDriver.getInstance("android");
    }

    @Given("the user closes the popup message")
    public void theUserClosesThePopupMessage() throws InterruptedException{
        // Thread.sleep(1000);
        InitialPopUp popUp = new InitialPopUp(driver);
        popUp.getOkButton().click();
    }

    @Given("the user is on Home Screen")
    public void theUserIsOnHomeScreen(){
        this.homePage = new HomePageAndroid(driver); 
        assertTrue(this.homePage.getTitle().isDisplayed());
    }

    @When("Display text button tapped")
    public void displayTextButtonTapped(){
        this.homePage.getDisplayTextButton().click();
    }
    
    //text "Text is sometimes displayed" is shown
    @Then("text {string} is shown")
    public void validateTextDiplayed(String text){
        assertEquals(text, this.homePage.getTextDisplayed().getText());
    }

}
