package pageobject.home;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AlertIOS {

    private WebElement okButton;
    private WebElement alertMessage;

    public AlertIOS(AppiumDriver driver){
        this.okButton = driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name='OK']"));
        this.alertMessage = driver.findElement(AppiumBy.xpath("//XCUIElementTypeAlert[@name='Cool title']"));
    }

    public WebElement getOkButton(){
        return this.okButton;
    }

    public WebElement getAlertMessage(){
        return this.alertMessage;
    }
    
}
