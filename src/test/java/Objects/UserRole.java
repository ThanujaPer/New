package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserRole {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public UserRole(WebDriver driver) {
        this.driver = driver;
    }

    By URole = By.xpath("/html/body/div/div/div[2]/div[2]/div/h5");
    By Continue = By.xpath("/html/body/div/div/div[2]/div[3]/button/span[2]");



    public void selectrole() {
        driver.findElement(URole).click();
    }

    public void clickcontinue() {
        driver.findElement(Continue).click();

    }




}