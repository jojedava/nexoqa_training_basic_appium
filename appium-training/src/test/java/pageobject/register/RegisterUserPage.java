package pageobject.register;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class RegisterUserPage {

    private AppiumDriver driver;
    private WebElement userName;
    private WebElement email;
    private WebElement password;
    private WebElement name;
    private WebElement preferedProgrammingLanguage;
    private WebElement input_adds;
    private WebElement registerUserButton;

    public RegisterUserPage(AppiumDriver driver) {
        this.driver = driver;
        this.userName = this.driver.findElement(AppiumBy.id("io.selendroid.testapp:id/inputUsername"));
        this.email = this.driver.findElement(AppiumBy.id("io.selendroid.testapp:id/inputEmail"));
        this.password = this.driver.findElement(AppiumBy.id("io.selendroid.testapp:id/inputPassword"));
        this.name = this.driver.findElement(AppiumBy.id("io.selendroid.testapp:id/inputName"));
        this.preferedProgrammingLanguage = this.driver.findElement(AppiumBy.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage"));
        this.input_adds = this.driver.findElement(AppiumBy.id("io.selendroid.testapp:id/input_adds"));
        this.registerUserButton = this.driver.findElement(AppiumBy.id("io.selendroid.testapp:id/btnRegisterUser"));
    }

    public WebElement getUserName(){
        return this.userName;
    }

    public WebElement getEmail(){
        return this.email;
    }

    public WebElement getPassword(){
        return this.password;
    }

    public WebElement getName(){
        return this.name;
    }

    public WebElement getPreferedProgrammingLanguage(){
        return this.preferedProgrammingLanguage;
    }

    public WebElement getInputAdds(){
        return this.input_adds;
    }

    public WebElement getRegisterButton(){
        return this.registerUserButton;
    }

    public WebElement getSelectProgrammingLanguage(String programmingLanguage) {
        return this.driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='" + programmingLanguage + "']"));
    }

    //io.selendroid.testapp:id/inputUsername
    //io.selendroid.testapp:id/inputEmail
    //io.selendroid.testapp:id/inputPassword
    //io.selendroid.testapp:id/inputName
    //io.selendroid.testapp:id/input_preferedProgrammingLanguage
    // xpath //android.widget.CheckedTextView[@resource-id="android:id/text1" and @text="Scala"]
    // io.selendroid.testapp:id/input_adds
    //io.selendroid.testapp:id/btnRegisterUser
}
