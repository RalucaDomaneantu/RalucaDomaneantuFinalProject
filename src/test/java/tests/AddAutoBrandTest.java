package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddAutoBrandTest {

    public WebDriver driver;

    @Test
    public void addAutoBrand(){
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

        WebElement nomenclatoare = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Nomenclatoare']")));
        nomenclatoare.click();

        WebElement marci = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Mărci']")));
        marci.click();

        WebElement adaugaMarca = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'fi-ac fi-align-start']")));
        adaugaMarca.click();

        WebElement numeMarcaMasina = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mountedActionSchema0.name")));
        String marcaMasina = "TESLA";
        numeMarcaMasina.sendKeys(marcaMasina);

        WebElement adaugaButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Adaugă']")));
        adaugaButton.click();

    }
}
