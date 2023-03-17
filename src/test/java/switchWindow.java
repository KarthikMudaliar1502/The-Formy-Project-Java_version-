import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchWindow {
    static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        // Opening a new instance of Firefox Browser //

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://formy-project.herokuapp.com/");

        // Checking the functionality of Switching windows //
        switchWndw window = new switchWndw();
        window.windowSwtch(driver);
        driver.quit();

    }
}
