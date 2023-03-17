import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioButtons {

    static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        // Opening a new instance of Firefox Browser //

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://formy-project.herokuapp.com/");

        // Checking the functionality of RadioButtons page //

        radio buttons = new radio();
        buttons.radioBtn(driver);

        driver.quit();

    }
}
