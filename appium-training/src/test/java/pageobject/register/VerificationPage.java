package pageobject.register;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class VerificationPage {

    private AppiumDriver driver;
    private WebElement buttonRegisterUser;

    public VerificationPage(AppiumDriver driver) {
        this.driver = driver;
        this.buttonRegisterUser = this.driver.findElement(AppiumBy.id("buttonRegisterUser"));
    }

    public WebElement getButtonRegisterUser(){
        return this.buttonRegisterUser;
    }
    //io.selendroid.testapp:id/buttonRegisterUser
}
