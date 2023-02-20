package ua.hillel.homework32.SelenidTest;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
public class SelenideUploadPage {

    private SelenideElement chooseButton = $x("//input[@name='file']");
    private SelenideElement uploadButton = $x("//input[@type='submit']");
    private SelenideElement successMessage = $(By.tagName("h3"));

    public SelenideUploadPage uploadFile(File file) {
        chooseButton.uploadFile(file);
        return this;
    }
    public SelenideElement getSuccessMessage(){
        return this.successMessage;
    }
    public SelenideUploadPage clickOnUploadButton(){
        uploadButton.shouldBe(Condition.visible).click();
        return this;
    }
}
