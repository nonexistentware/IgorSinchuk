package ua.hillel.tests.homework15;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

    @Test(dataProvider = "userData", groups = "login")
    public void loginTest(String user, String password, String role) {
        System.out.println("User " + user + " has role - " + role);
    }

    @DataProvider(name = "userData")
    public Object[][] getDataFromDataProvider() {
       Object[][] result = {
                {"profile1", "123456", "user"},
                {"adminprofile", "q1234", "admin"},
                {"guest_profile", "guest", "guest"},
                {"profile2", "guest", "deprecated"}
        };
       return result;
    }

}
