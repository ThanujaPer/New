package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logout {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public logout(WebDriver driver) {
        this.driver = driver;
    }

    By logouticon = By.xpath("/html/body/div/div/div/header/div/button/span/span");

   By logout = By.xpath("/html/body/div[2]/div/ul/li[2]/span[2]");


    //Method to click login button
    public void clicklogout() {
        driver.findElement(logouticon).click();
    }
    public void clicklout() {
        driver.findElement(logout).click();
    }

}