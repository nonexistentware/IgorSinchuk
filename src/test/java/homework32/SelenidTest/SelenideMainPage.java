package homework32.SelenidTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelenideMainPage {

    private SelenideElement downloadFileLink = $(By.linkText("File Download"));
    private SelenideElement uploadFileLink = $(By.linkText("File Upload"));

    private SelenideElement dynamicallyLoadedLink =$(By.linkText("Dynamic Loading"));


    public SelenideDownloadPage goToSelenideDownloadPage() {
        downloadFileLink.shouldBe(Condition.visible).click();
        return new SelenideDownloadPage();
    }

    public SelenideUploadPage goToSelenideUploadPage() {
        uploadFileLink.shouldBe(Condition.visible).click();
        return  new SelenideUploadPage();
    }
    public SelenideDynamicallyLoadedPage goToSelenideDynamicallyLoadedPage(){
        dynamicallyLoadedLink.shouldBe(Condition.visible).click();;
        return new SelenideDynamicallyLoadedPage();
    }
}
