package pageobject.home;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class InitialPopUp {

    private AppiumDriver driver;
    private WebElement okButton;

    public InitialPopUp(AppiumDriver driver){
        this.driver = driver;
        this.okButton = this.driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id='android:id/button1']"));

    }

    public WebElement getOkButton(){
        return okButton;
    }

}
