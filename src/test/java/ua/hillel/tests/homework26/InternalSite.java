package ua.hillel.tests.homework26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class InternalSite extends BasePage{
    @FindBy(linkText = "Form Authentication")
    private WebElement LoginPageLink;
    @FindBy(linkText = "Challenging DOM")
    private WebElement ChallengingLink;
    @FindBy(linkText = "Checkboxes")
    private WebElement CheckboxesLink;
    @FindBy(linkText = "Hovers")
    private WebElement HoversLink;
    @FindBy(linkText = "File Download")
    private WebElement DownloadFileLink;
    @FindBy(linkText = "File Upload")
    private WebElement UploadFileLink;

    public InternalSite(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public DownloadPage goToDownloadPage(){
        DownloadFileLink.click();
        return  new DownloadPage(driver);
    }
    public UploadP goToUploadPage(){
        UploadFileLink.click();
        return new UploadP(driver);
    }
}
