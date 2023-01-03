package ua.hillel.tests.homework21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class UserNameTest {


    @Test
    public void displayName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/hovers");


//        actions.moveToElement(driver.findElement(By.cssSelector(".div.figure"))).build().perform();

        List<WebElement> figures = driver.findElements(By.cssSelector(".figure"));

       for (WebElement figure : figures) {
           actions.moveToElement(figure).pause(1000).perform();
           System.out.println(figure.getText()
                   .replaceAll("name: ", "")
                   .replaceAll("View profile", ""));
       }

        driver.quit();
    }
}
