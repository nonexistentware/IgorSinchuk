package ua.hillel.tests.homework26;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FilesTestRunner extends BaseTest {
    @Test
    public void downloadAndChangeFile() throws ArrayIndexOutOfBoundsException, IOException, InterruptedException {
        openMainPageTheInternetSite().goToDownloadPage()
                .downloadTxtFile();
        waitForPreparation();

        File filesInFolder = new File("target/downloads");
        File[] files = filesInFolder.listFiles();
        for (File file : files) {

            List<String> lines = Files.readAllLines(file.toPath());
            lines.add("New file");
            lines.add("Content was changed");

            Files.write(file.toPath(), lines);
        }
    }

    @Test
    public void uploadFile() throws InterruptedException {
        waitForPreparation();
        Assert.assertTrue(openMainPageTheInternetSite().goToUploadPage()
                .uploadFile().checkSuccessText().contains("File Uploaded!"));
    }
}
