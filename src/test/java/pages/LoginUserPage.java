package pages;

import models.UserModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUserPage extends BasePage {


    @FindBy(id = "login")
    public WebElement loginButtonElement;

    @FindBy(id = "userName")
    public WebElement userNameElement;

    @FindBy(id = "password")
    public WebElement passwordElement;

    public LoginUserPage(WebDriver driver) {
        super(driver);
    }

    public void clickLogin() {
        loginButtonElement.click();
    }

    public void userLogin(UserModel testdata) {
        userNameElement.sendKeys(testdata.getUserNameValue());
        passwordElement.sendKeys(testdata.getPasswordValue());
    }
}

