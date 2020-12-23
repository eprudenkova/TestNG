package com.syntax.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

//    tasks are from user stories

    WebDriver driver;

    @BeforeMethod
    public void openAndNavigate() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void validAdminLogin() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        WebElement welcomeMessage = driver.findElement(By.cssSelector("a#welcome"));
        if (welcomeMessage.isDisplayed()) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test fail");
        }
    }

    @Test
    public void titleValidation() {
        String expectedTitle = "Human Management System";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title is valid. Test pass");
        } else {
            System.out.println("Title is not matched. Test failed");
        }
    }

//        @Test(priority = 2)
//    public void logoValidation() {
//        LoginPageElements login = new LoginPageElements();
//        boolean logoDis = login.logo.isDisplayed();
//        logoDis = false;
//        // Code will be executed after soft assert fails
//        SoftAssert sof = new SoftAssert();
//        sof.assertTrue(logoDis, "Logo is not Displayed");
//        sof.assertAll();
//        // HARD ASSERT - code will not be executed
//        // Assert.assertEquals(logoDis, true, "Logo is not Displayed");
//        // Assert.assertTrue(logoDis, "Logo is not Displayed");
//    }


    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
