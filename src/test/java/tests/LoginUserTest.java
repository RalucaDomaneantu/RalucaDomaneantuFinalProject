package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LogUtility;
import java.time.Duration;


public class LoginUserTest {

    public WebDriver driver;

    @BeforeMethod
    public void setupEnvironment() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();
    }

    @Test
    public void loginUserTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
        loginButton.click();
        LogUtility.infoLog("The user clicks on login button");

        WebElement userNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
        userNameField.sendKeys("ralust");
        LogUtility.infoLog("The user fills the username field");

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        passwordField.sendKeys("password123");
        LogUtility.infoLog("The user fills the password field");

        WebElement login2Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
        login2Button.click();
        LogUtility.infoLog("The user clicks on login button");

    }

    @AfterMethod
    public void quitEnvirnonment() {
        driver.quit();
    }
}

