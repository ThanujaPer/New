package TestScenarios;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Objects.Login;
import Objects.UserLogin;
import Objects.UserRole;
import Objects.logout;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestS {
    @BeforeClass
    public static void startTest()
    {
        ExtentTest test;
        ExtentReports report;
        report = new ExtentReports(System.getProperty("user.dir")+("ThanujaPer.dir")+"\\ExtentReportResults.html");
        test = report.startTest("ExtentDemo");
    }
    @Test(priority = 2)
    public  void reportcheck() throws InterruptedException {
        ExtentTest test;
        ExtentReports report;
        report = new ExtentReports(System.getProperty("user.dir")+("ThanujaPer.dir")+"\\ExtentReportResults.html");
        test = report.startTest("ExtentDemo");

        System.setProperty(
                "driver.chrome.driver",
                "D:\\Canchana_Backup\\chromedriver_win32");
        WebDriver driver = new ChromeDriver();
        driver.get("https://indodigitalmeuat.lolc.com/indo-digital-loan/");

        //Creating object of login page

        Login lg = new Login(driver);

        //Click on Login button
        lg.clickloginbtn();
test.log(LogStatus.PASS, "Navigated to the specified URL");


        UserLogin ulg = new UserLogin((driver));
        ulg.enterusername("LUSIM");
        ulg.sendvalues("Lolc@1234");

        ulg.clickLogin();
        System.out.println("passed");
        Thread.sleep(3000);
        test.log(LogStatus.PASS, "login is ok");

        UserRole urole = new UserRole(driver);
        urole.selectrole();
        urole.clickcontinue();
        test.log(LogStatus.PASS, "User role selection is ok");

        logout lot = new logout(driver);
        lot.clicklogout();
        lot.clicklout();
        test.log(LogStatus.PASS, "User logout is ok");


        //Capture the page heading and print on console
        //  System.out.println("The page heading is --- " +dashboard.getHeading());

        //Perform search and display search string on console
        //  dashboard.enterSearchStr("java");

        //CLick on Logout button
        // dashboard.clickLogout();
    }

   @Test(priority = 1)
    public  void reportcheck2() throws InterruptedException {
        System.out.println("test is ok");

    }
}

