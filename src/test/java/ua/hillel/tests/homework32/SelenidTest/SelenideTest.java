package ua.hillel.tests.homework32.SelenidTest;

import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static com.codeborne.selenide.Condition.text;

public class SelenideTest extends SelenideBase{

    @Test
    public void downloadChangeUploadFile() throws IOException, NullPointerException, IllegalMonitorStateException {

        File file = new SelenideMainPage().goToSelenideDownloadPage().downloadTxtFile();

        List<String> lines = Files.readAllLines(file.toPath());
        for (int i=1; i<3; i++) {
            lines.add("added new line " + i);
            Files.write(file.toPath(), lines);
        }

        newSession();

        new SelenideMainPage().goToSelenideUploadPage().uploadFile(file).clickOnUploadButton();
        new SelenideUploadPage().getSuccessMessage().shouldHave(text("File Uploaded!"));
    }

    @Test
    public void textAfterLoader(){
        newSession();

        new SelenideMainPage().goToSelenideDynamicallyLoadedPage().example1();

        SelenideLoadedPage1 page1 = new SelenideLoadedPage1();
        Assert.assertTrue(page1.clickStartButton1().getLoadedText1().contains("Hello World!"));

        newSession();

        new SelenideMainPage().goToSelenideDynamicallyLoadedPage().example2();

        SelenideLoadedPage2 page2 = new SelenideLoadedPage2();
        Assert.assertTrue(page2.clickStartButton2().getLoadedText2().contains("Hello World!"));
    }

}
