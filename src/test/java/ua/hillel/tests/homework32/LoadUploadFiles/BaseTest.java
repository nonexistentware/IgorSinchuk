package ua.hillel.tests.homework32.LoadUploadFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import ua.hillel.tests.homework32.utils.CustomExtentReportListener;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Listeners(CustomExtentReportListener.class)

public class BaseTest {
    protected WebDriver driver;

    static {
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.html.out", "target/extentReport/Extent.Html");
    }

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", new File("target/downloads").getAbsolutePath());
        options.setExperimentalOption("prefs", prefs);

        this.driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver !=null){
            driver.quit();
        }
    }

    public InternalSite openMainPageTheInternetSite(){
        driver.get("https://the-internet.herokuapp.com/");
        return new InternalSite(driver);
    }
    public void waitForPreparation() throws InterruptedException {
        Thread.sleep(3000);
    }

}
