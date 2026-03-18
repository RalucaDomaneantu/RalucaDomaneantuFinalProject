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

public class CreateNewUserTest{
    public WebDriver driver;

    @BeforeMethod
    public void setupEnvironment() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();
    }

    @Test
        public void createNewUserTest () {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
            loginButton.click();
            LogUtility.infoLog("The user clicks on login button");

            WebElement newUserButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newUser")));
            newUserButton.click();
            LogUtility.infoLog("The user clicks on newuser button");

            WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
            firstNameField.sendKeys("Raluca");
            LogUtility.infoLog("The user fills the firstname field");

            WebElement lastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastname")));
            lastNameField.sendKeys("Domaneantu");
            LogUtility.infoLog("The user fills the lastname field");

            WebElement userNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
            userNameField.sendKeys("ralust");
            LogUtility.infoLog("The user fills the username field");

            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
            passwordField.sendKeys("password123");
            LogUtility.infoLog("The user fills the password field");

            WebElement registerButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register")));
            registerButton.click();
            LogUtility.infoLog("The user clicks on login button");
        }

        @AfterMethod
        public void quitEnvirnonment () {
            driver.quit();
        }
    }


