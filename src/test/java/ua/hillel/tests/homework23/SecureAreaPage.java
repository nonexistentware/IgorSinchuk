package ua.hillel.tests.homework23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecureAreaPage extends BasePage{

    @FindBy(css = ".icon-2x")
    private WebElement logOutButton;
    @FindBy(xpath = "//div[@class='flash success']")
    private WebElement loginStatus;
    @FindBy(xpath = "//div[@class='flash success']")
    private WebElement sign;

    public SecureAreaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public LogInPage logOut() {
        clickButton(logOutButton);
        return new LogInPage(driver);
    }

    public String getLoginStatus() {
        return loginStatus.getText();
    }

    public String getValidSign() {
        return sign.getText();
    }
}
