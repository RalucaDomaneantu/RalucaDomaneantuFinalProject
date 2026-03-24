package pages;

import models.UserModel;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateNewUserPage extends BasePage {


    @FindBy(id = "login")
    private WebElement loginButtonElement;

    @FindBy(id = "newUser")
    private WebElement newUserElement;

    @FindBy(id = "firstname")
    public WebElement firstNameElement;

    @FindBy(id = "lastname")
    public WebElement lastNameElement;

    @FindBy(id = "userName")
    public WebElement userNameElement;

    @FindBy(id = "password")
    public WebElement passwordElement;

    @FindBy(id = "register")
    public WebElement registerButtonElement;

    public CreateNewUserPage(WebDriver driver) {
        super(driver);
    }

    public void clickLogin() {
        loginButtonElement.click();
    }

    public void clickNewUser() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(newUserElement));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", newUserElement);
    }

    public void createUserProcess(UserModel testData) {
        firstNameElement.sendKeys(testData.getFirstNameValue());
        lastNameElement.sendKeys(testData.getLastNameValue());
        userNameElement.sendKeys(testData.getUserNameValue());
        passwordElement.sendKeys(testData.getPasswordValue());
    }

    public void userRegister() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", registerButtonElement);
    }
}




