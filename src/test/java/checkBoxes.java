import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkBoxes {
    static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        // Opening a new instance of Firefox Browser //
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://formy-project.herokuapp.com/");

        // Checking the functionality of Check boxes //

        CheckBox box = new CheckBox();
        box.checkboxes(driver);

        driver.quit();
    }
}
