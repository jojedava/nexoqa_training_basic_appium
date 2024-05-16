package pageobject.home;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class HomePageAndroid {

    private AppiumDriver driver;
    private WebElement title;
    private WebElement displayTextButton;
    private WebElement displayAToastButton;
    private WebElement registrationButton;


    public HomePageAndroid(AppiumDriver driver){
        this.driver = driver;
        this.title = this.driver.findElement(AppiumBy.id("android:id/title"));
        this.displayTextButton =  this.driver.findElement(AppiumBy.id("io.selendroid.testapp:id/visibleButtonTest"));
        this.displayAToastButton =  this.driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc='showToastButtonCD']"));
        this.registrationButton = this.driver.findElement(AppiumBy.id("io.selendroid.testapp:id/startUserRegistration"));
    }

    public WebElement getTitle(){
        return this.title;
    }

    public WebElement getDisplayTextButton() {
        return this.displayTextButton;
    }

    public WebElement getTextDisplayed() {
        return this.driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='io.selendroid.testapp:id/visibleTextView']"));
    }

    public WebElement getDisplayAToastButton() {
        return displayAToastButton;
    }

    public WebElement getToastMessage() throws InterruptedException {
        Thread.sleep(1000);
        return this.driver.findElement(AppiumBy.xpath("//android.widget.Toast"));
    }

    public WebElement getToastMessage(String text) throws InterruptedException {
        return this.driver.findElement(AppiumBy.xpath("//android.widget.Toast[@text='"+text+"']"));
    }

    public WebElement getRegistrationButton() {
        return this.registrationButton;
    }

}
