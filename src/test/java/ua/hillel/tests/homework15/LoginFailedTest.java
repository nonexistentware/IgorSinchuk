package ua.hillel.tests.homework15;

import org.testng.annotations.Test;

public class LoginFailedTest extends LoginTest{
    @Test(dataProvider = "userData", dependsOnGroups = "login")
    public void failedTest(String user, String pass, String role) {
        if (user.equals("profile2")) {
            throw new RuntimeException("Error! " + user + " has locked IP.");
        }
    }
}
