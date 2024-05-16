package pageobject.home;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class HomePageAndroid {

    private AppiumDriver driver;
    private WebElement title;
    private WebElement displayTextButton;

    //


    public HomePageAndroid(AppiumDriver driver){
        this.driver = driver;
        this.title = this.driver.findElement(AppiumBy.id("android:id/title"));
        this.displayTextButton =  this.driver.findElement(AppiumBy.id("io.selendroid.testapp:id/visibleButtonTest"));
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

}
