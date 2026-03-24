package testsFE;

import models.UserModel;
import org.testng.annotations.Test;
import pages.CreateNewUserPage;
import sharedData.SharedData;
import utils.LogUtility;

public class CreateNewUserTest extends SharedData {

    @Test
        public void createNewUserTest () {

            UserModel testData = new UserModel("src/test/resources/UserData.json");

            CreateNewUserPage createNewUserPage = new CreateNewUserPage(getDriver());

            createNewUserPage.clickLogin();
            LogUtility.infoLog("The user clicks on login button");

            createNewUserPage.clickNewUser();
            LogUtility.infoLog("The user clicks on newuser button");

            createNewUserPage.createUserProcess(testData);
            LogUtility.infoLog("The user fills the users datas fields");

            createNewUserPage.userRegister();
            LogUtility.infoLog("The user clicks on register button");

        }
    }


