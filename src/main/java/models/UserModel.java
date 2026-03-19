package models;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserModel {
    private String firstNameValue;
    private String lastNameValue;
    private String userNameValue;
    private String passwordValue;

    public UserModel (String filePath) {
        loadFromJson(filePath);
    }

    public void loadFromJson(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readerForUpdating(this)
                    .readValue(new File(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public String getUserNameValue() {
        return userNameValue;
    }

    public String getPasswordValue() {
        return passwordValue;
    }
}
