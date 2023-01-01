package ua.hillel.tests.homework18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ButtonsAndTable {

    @Test
    public void webPageTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Challenging DOM")).click();

        driver.findElement(By.cssSelector("div a:nth-of-type(1).button")).click();
        driver.findElement(By.cssSelector(".button.alert")).click();
        driver.findElement(By.cssSelector(".button.success")).click();

        List<String> tableMeans = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            tableMeans.add(driver.findElement(By.cssSelector("tbody tr:nth-of-type(" + i + ") td:nth-of-type(4)")).getText());
        }
        System.out.println(tableMeans);
        driver.quit();
    }

}
