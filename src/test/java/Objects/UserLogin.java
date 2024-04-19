package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLogin {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public UserLogin(WebDriver driver) {
        this.driver = driver;
    }

    By UName = By.id("usernameUserInput");
    By Psw = By.id("password");
    By LoginBtn1 = By.xpath("/html/body/main/div/div[2]/div/form/div[11]/div[2]/button");

    //Method to click login button
    public void enterusername(String username) {
        driver.findElement(UName).sendKeys(username);
    }

    public void sendvalues(String Password) {
            driver.findElement(Psw).sendKeys(Password);

    }



    public void clickLogin() {
        driver.findElement(LoginBtn1).click();
    }

}