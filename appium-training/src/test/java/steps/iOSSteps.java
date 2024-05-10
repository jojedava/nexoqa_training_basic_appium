package steps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.home.AlertIOS;
import pageobject.home.HomePageIOS;

import org.junit.Assert;
import utils.WrapMobileDriver;

public class iOSSteps {

    private HomePageIOS homePageIOS;
    private AlertIOS alertIOS;

    private AppiumDriver driver;

    public iOSSteps() {
        driver = WrapMobileDriver.getInstance("ios");
        homePageIOS = new HomePageIOS(driver);
    }

    @Given("the user adds the first number {int}")
    public void addNumber1(int number) throws InterruptedException {
        homePageIOS.getNumber1().clear();
        homePageIOS.getNumber1().sendKeys(String.valueOf(number));
    }

    @And("the user adds the second number {int}")
    public void addNumber2(int number) throws InterruptedException {
        homePageIOS.getNumber2().clear();
        homePageIOS.getNumber2().sendKeys(String.valueOf(number));
    }

    @When("the user clicks on the button")
    public void clickOnButton() throws InterruptedException {
        homePageIOS.getButton().click();

    }

    @Then("the app show the operation result {int}")
    public void getResult(int result) {
        Assert.assertTrue(result == Integer.valueOf(homePageIOS.getResult().getText()));
    }

    @Then("the app show the operation result {int} and expected {string}")
    public void getResultWithExpectedResult(int result, String failure) {
        Assert.assertTrue((result == Integer.valueOf(homePageIOS.getResult().getText())) == Boolean.valueOf(failure));
    }

    // @Then("^the app show the operation result (\\d+) and expected \"(true|false)\"$")
    // public void getResultWithExpectedResult(int result, String failure) {
    //     Assert.assertTrue((result == Integer.valueOf(homePageIOS.getResult().getText())) == Boolean.valueOf(failure));
    // }

    @Given("the alert message is open")
    public void theAlertMessageIsOpen(){
        homePageIOS.getButtonAlertMessage().click();

    }

    @When("the ok button is clicked")
    public void theOkButtonIsClicked(){
        alertIOS = new AlertIOS(driver);
        alertIOS.getOkButton().click();
    }

    @When("the alert message is closed")
    public void theAlertMessageIsClosed(){
        boolean isPresent = false;
        try{
            isPresent = alertIOS.getAlertMessage().isDisplayed();
        }
        catch(Exception ex){
            isPresent = false;
        }
        Assert.assertFalse(isPresent);
    }

    @Given("the slider element is present")
    public void theSliderElementIsPresent(){
        Assert.assertTrue(homePageIOS.getSlider().isDisplayed());
    }

    @When("the slider has moved to {int}")
    public void theSliderHasMovedtoNumber(int value){
        homePageIOS.getSlider().clear();
        double percentage = Double.valueOf(value)/100.0;
        homePageIOS.getSlider().sendKeys(String.valueOf(percentage));
    }

    @Then("value should be {int} exceeded or less than {int}")
    public void theSliderValue(int value, int threhold){
        String sliderValue = homePageIOS.getSlider().getText();
        int sliderNumberValue = Integer.valueOf(sliderValue.replaceAll("%", ""));
        Assert.assertTrue(sliderNumberValue >= value - threhold && sliderNumberValue <= value + threhold );
    }

}
