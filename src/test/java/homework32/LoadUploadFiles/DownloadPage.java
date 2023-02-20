package homework32.LoadUploadFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
public class DownloadPage extends BasePage{

    @FindBy(how = How.XPATH, using = "//a[contains(@href, '.txt')]")
    private List<WebElement> downloadFiles;
    public DownloadPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public DownloadPage downloadTxtFile(){
        downloadFiles.get(0).click();
        return this;
    }

}
