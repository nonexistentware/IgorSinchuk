package ua.hillel.tests.homework27;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;


public class SelenideBase {
    @BeforeTest
    public void setUp() {
        Configuration.browser = "chrome";
        open("https://the-internet.herokuapp.com/");
        Configuration.timeout = 40000;
        Configuration.savePageSource = false;
    }
    public void newSession() {
        Selenide.closeWindow();
        open("https://the-internet.herokuapp.com/");
    }
}
