package testsFE;

import models.UserModel;
import org.testng.annotations.Test;
import pages.LoginUserPage;
import sharedData.SharedData;
import utils.LogUtility;


public class LoginUserTest extends SharedData {


    @Test
    public void loginUserTest() {

        UserModel testData = new UserModel("src/test/resources/UserData.json");

        LoginUserPage loginPage = new LoginUserPage(getDriver());
        loginPage.clickLogin();
        LogUtility.infoLog("The user clicks on login button");

        loginPage.userLogin(testData);
        LogUtility.infoLog("The user fills the username and password field");

    }

}

