package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    public WebDriver driver;

    @Test
    public void loginTest() {
        driver = new ChromeDriver();
        driver.get("https://stage.corlantrans.ro/backoffice/login");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement emailField =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form.email")));
        String emailValue = "raluca@corlantrans.ro";
        emailField.sendKeys(emailValue);

        WebElement passwordField =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form.password")));
        String passwordValue = "Parola123$";
        passwordField.sendKeys(passwordValue);

        WebElement rememberMeButton =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form.remember")));
        rememberMeButton.click();

        WebElement authentificationButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
        authentificationButton.click();

        driver.quit();

    }
}
