package ua.hillel.tests.homework18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CheckBoxTest {

   @Test
    public void checkBoxClickTest() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://the-internet.herokuapp.com/");
       driver.findElement(By.linkText("Checkboxes")).click();

       WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
       Thread.sleep(2000);
       checkbox.click();
        driver.quit();

    }
}
