package ua.hillel.tests.homework26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class UploadP extends BasePage{

    @FindBy(xpath = "//input[@name='file']")
    private WebElement chooseButton;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement uploadButton;
    @FindBy(tagName = "h3")
    private static WebElement successMessage;

    public UploadP(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public UploadP uploadFile(){
        File[] filesInFolder = new File("target/downloads").listFiles();
        chooseButton.sendKeys((CharSequence) filesInFolder[0].getAbsolutePath());
        uploadButton.click();
        return this;
    }
    public String checkSuccessText(){
        return successMessage.getText();
    }
}
