package ua.hillel.tests.homework27;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
public class SelenideDynamicallyLoadedPage {
    private SelenideElement example1 = $x("//a[contains(@href, '/1')]");
    private SelenideElement example2 =$x("//a[contains(@href, '/2')]");
    public SelenideDynamicallyLoadedPage example1(){
        example1.shouldBe(Condition.visible).click();
        return new SelenideDynamicallyLoadedPage();
    }
    public SelenideDynamicallyLoadedPage example2(){
        example2.shouldBe(Condition.visible).click();
        return new SelenideDynamicallyLoadedPage();
    }
}
