import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class switchAlert {
    static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {

        // Opening a new instance of Firefox Browser //
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://formy-project.herokuapp.com/");

        // Checking the functionality of Alert message //
        alertSwitch alert = new alertSwitch();
        alert.alertMsg(driver);
        driver.quit();



    }
}
