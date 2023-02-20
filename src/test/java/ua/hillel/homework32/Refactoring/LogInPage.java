package ua.hillel.homework32.Refactoring;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage{

    @FindBy(id = "username")
    private WebElement userName;
    @FindBy(id = "password")
    private WebElement passWord;
    @FindBy(css = ".radius")
    private WebElement radius;
    @FindBy(css = ".flash.error")
    private WebElement signRejection;

    public LogInPage() {
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String username) {
        userName.sendKeys(username);
    }

    public void setPassword(String password) {
        passWord.sendKeys(password);
    }

    public SecureAreaPage clickLoginButton() {
        radius.click();
        return new SecureAreaPage();
    }

    public SecureAreaPage loginValid(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public LogInPage loginInvalid(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickButton(radius);
        return new LogInPage();
    }

    public String getInvalidSign() {
        return signRejection.getText();
    }

}
