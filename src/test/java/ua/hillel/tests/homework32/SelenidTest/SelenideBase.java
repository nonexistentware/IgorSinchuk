package ua.hillel.tests.homework32.SelenidTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import ua.hillel.tests.homework32.utils.CustomExtentReportListener;


import static com.codeborne.selenide.Selenide.open;

@Listeners(CustomExtentReportListener.class)
public class SelenideBase {

    static {
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.html.out", "target/extentReport/Extent.html");
    }

    @BeforeTest
    public void setUp() {
        Configuration.browser = "chrome";
        open("https://the-internet.herokuapp.com/");
        Configuration.timeout = 40000;
        Configuration.savePageSource = false;
    }
    public void newSession() {
        Selenide.closeWindow();
        Selenide.open("https://the-internet.herokuapp.com/");
    }
}
