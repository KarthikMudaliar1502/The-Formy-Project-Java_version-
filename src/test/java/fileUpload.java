import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileUpload {
    static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        // Opening a new instance of Firefox Browser //

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://formy-project.herokuapp.com/");
        Thread.sleep(1000);

        // Checking the functionality of FileUpload Page //

        fileUploadButton upload = new fileUploadButton();
        upload.uploadFunction(driver);

        driver.quit();

    }
}
