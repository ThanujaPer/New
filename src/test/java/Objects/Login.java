package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    By loginbtn = By.xpath("/html/body/div/div/div[1]/button");


    //Method to click login button
    public void clickloginbtn() {
        driver.findElement(loginbtn).click();
    }

}