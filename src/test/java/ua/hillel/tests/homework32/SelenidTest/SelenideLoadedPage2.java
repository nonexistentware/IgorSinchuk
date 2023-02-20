package ua.hillel.tests.homework32.SelenidTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
public class SelenideLoadedPage2 {

    private SelenideElement startButton2 = $x("//button[text()='Start']");
    private SelenideElement text2 = $x("//h4[text()='Hello World!']");

    public SelenideLoadedPage2 clickStartButton2(){
        startButton2.shouldBe(Condition.visible).click();
        return new SelenideLoadedPage2();
    }
    public String getLoadedText2(){
        return text2.shouldBe(Condition.visible).getText();
    }
}
