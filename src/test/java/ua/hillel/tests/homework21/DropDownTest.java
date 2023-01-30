package ua.hillel.tests.homework21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest {

    @Test
    public void menuCheck() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html#");

        driver.findElement(By.linkText("Dropdown")).click();
        driver.findElement(By.linkText("Secondary Menu")).click();

        driver.findElement(By.linkText("Secondary Action")).click();
        driver.findElement(By.className("container-fluid")).click();

        String secondPage = driver.findElement(By.cssSelector(".jumbotron.secondary-clicked")).getText();
        Assert.assertTrue(secondPage.contains("Secondary Page"));

        driver.quit();


    }
}
