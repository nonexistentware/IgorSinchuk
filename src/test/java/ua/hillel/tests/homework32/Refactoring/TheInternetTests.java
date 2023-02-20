package ua.hillel.tests.homework32.Refactoring;


import org.testng.Assert;
import org.testng.annotations.Test;


public class TheInternetTests extends BaseTest{

    @Test
    public void LogInValidTest() {
        String signValid = openMainPage()
                .goToLogInPage()
                .loginValid("tomsmith", "SuperSecretPassword!")
                .getValidSign();
        Assert.assertEquals(signValid, "You logged into a secure area!\n" + "×");
    }

    @Test
    public void testLogInInvalid() {
        String signInvalid = openMainPage().goToLogInPage().loginInvalid("NoNameUser", "SMB_Password")
                .getInvalidSign();
        Assert.assertEquals(signInvalid, "Your username is invalid!\n" + "×");
    }

    @Test
    public void testCheckbox() {
        openMainPage().goToCheckboxes().checkboxesStatus();
    }

    @Test
    public void testClickButton() {
        openMainPage().goChallengingDOM()
                .clickFirstButton()
                .clickSecondButton()
                .clickThirdButton()
                .showСolumn();
    }

    @Test
    public void userNames() {
        openMainPage().goToHowers().showNamesPictures();
    }

}
