package ua.hillel.tests.homework27;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$$x;
public class SelenideDownloadPage {
    private ElementsCollection downloadFiles = $$x("//a[contains(@href, '.txt')]");

    public File downloadTxtFile() throws IOException, NullPointerException {
        return this.downloadFiles.filterBy(Condition.visible).get(0).download();
    }
}
