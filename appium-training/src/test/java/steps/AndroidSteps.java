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
import pageobject.register.RegisterUserPage;
import pageobject.register.VerificationPage;
import utils.WrapMobileDriver;

public class AndroidSteps {

    private AppiumDriver driver;
    private HomePageAndroid homePage;
    private RegisterUserPage registerUserPage;
    private VerificationPage verificationPage;

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
    public void theUserIsOnHomeScreen() throws InterruptedException{
        Thread.sleep(1000);
        this.homePage = new HomePageAndroid(driver); 
        assertTrue(this.homePage.getTitle().isDisplayed());
    }

    @When("^Display (text|a toast) button tapped$")
    public void displayTextButtonTapped(String button){
        if (button.equals("text")) this.homePage.getDisplayTextButton().click();
        else if (button.equals("a toast")) this.homePage.getDisplayAToastButton().click();
    }
    
    //text "Text is sometimes displayed" is shown
    @Then("text {string} is shown")
    public void validateTextDisplayed(String text){
        assertEquals(text, this.homePage.getTextDisplayed().getText());
    }

    // the toast message "Hello selendroid toast" is shown
    @Then("the toast message {string} is shown")
    public void theToastMessageDisplayed(String text) throws InterruptedException{
        assertEquals(text, this.homePage.getToastMessage().getText());
    }

    // //the toast message "Hello selendroid toast" is shown
    // @Then("the toast message {string} is shown")
    // public void theToastMessageDisplayed(String text) throws InterruptedException{
    //     assertTrue(this.homePage.getToastMessage(text).getText() != "");
    // }
    

//     Given the user is on Home Screen
//     And the user taps on registration button
//     And the register page is shown
//     When the user adds the Username "Username"
//     And the user adds the Email "username@email.com"
//     And the user adds the Password "u12345678"
//     And the user adds the Name "Name"
//     And the user adds the programming Language "PHP"
//     And the user select the checkbox
//     And the user taps on Register button
//     Then the verification page is shown

        @Given("the user taps on registration button")
        public void theUserTapsOnRegistrationButton(){
            homePage.getRegistrationButton().click();
        }

        @Given("the register page is shown")
        public void theRegisterPageIsShown() throws InterruptedException{
            Thread.sleep(1000);
            this.registerUserPage = new RegisterUserPage(driver); 
            assertTrue(this.registerUserPage.getUserName().isDisplayed());
        }

        @When("the user adds the Username {string}")
        public void theUserAddsTheUsername(String userName){
            this.registerUserPage.getUserName().clear();
            this.registerUserPage.getUserName().sendKeys(userName);
        }

        @When("the user adds the Email {string}")
        public void theUserAddsTheEmail(String email){
            this.registerUserPage.getEmail().clear();
            this.registerUserPage.getEmail().sendKeys(email);
        }

        @When("the user adds the Password {string}")
        public void theUserAddsThePassword(String password){
            this.registerUserPage.getPassword().clear();
            this.registerUserPage.getPassword().sendKeys(password);
        }

        @When("the user adds the Name {string}")
        public void theUserAddsTheName(String name){
            this.registerUserPage.getName().clear();
            this.registerUserPage.getName().sendKeys(name);
        }

        @When("the user adds the programming Language {string}")
        public void theUserAddsTheProgrammingLanguage(String programmingLanguage) throws InterruptedException{
            this.registerUserPage.getPreferedProgrammingLanguage().click();
            Thread.sleep(1000);
            this.registerUserPage.getSelectProgrammingLanguage(programmingLanguage).click();
        }

        @When("the user selects the checkbox")
        public void theUserSelectsTheCheckbox(){
            this.registerUserPage.getInputAdds().click();
        }

        @When("the user taps on Register button")
        public void theUserTapsOnRegisterButton(){
            this.registerUserPage.getRegisterButton().click();
        }

        @Then("the verification page is shown")
        public void theVerificationPageIsShown() throws InterruptedException{
            Thread.sleep(1000);
            this.verificationPage = new VerificationPage(driver); 
            assertTrue(this.verificationPage.getButtonRegisterUser().isDisplayed());
            this.verificationPage.getButtonRegisterUser().click();
        }

        



}
