import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fileUploadButton {

    public static void uploadFunction (WebDriver driver) throws InterruptedException {

        WebElement fileUpload = driver.findElement(By.xpath("/html/body/div/div/li[8]/a"));
        fileUpload.click();
        Thread.sleep(1000);

        WebElement chooseFile = driver.findElement(By.id("file-upload-field"));
        chooseFile.sendKeys("fileToUpload.txt");
        chooseFile.sendKeys(Keys.RETURN);
    }
}
