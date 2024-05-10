package pageobject.home;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;


public class HomePageIOS {

    private WebElement number1;
    private WebElement number2;
    private WebElement button;
    private WebElement result;
    private WebElement buttonAlertMessage;
    private WebElement slider;


    public HomePageIOS(AppiumDriver driver){

        this.number1 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeTextField[@name='IntegerA']"));
        this.number2 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeTextField[@name='IntegerB']"));
        this.button = driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name='ComputeSumButton']"));
        this.result = driver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name='Answer']"));
        this.buttonAlertMessage = driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name='show alert']"));
        this.slider = driver.findElement(AppiumBy.xpath("//XCUIElementTypeSlider[@name='AppElem']"));
    }


    public WebElement getButton() {
        return this.button;
    }

    public WebElement getNumber1() {
        return this.number1;
    }

    public WebElement getNumber2() {
        return this.number2;
    }

    public WebElement getResult() {
        return this.result;
    }

    public WebElement getButtonAlertMessage(){
        return this.buttonAlertMessage;
    }


    public WebElement getSlider() {
        return this.slider;
    }

}
