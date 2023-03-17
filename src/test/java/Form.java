import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class Form {
    static WebDriver driver = null;
    public static void main(String[] args) {
        // Opening a new instance of Firefox Browser //

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        // Checking the functionality of the Form page //

        formPage form = new formPage();
        form.submitForm(driver);

        confirmation confirmationPage = new confirmation();
        confirmation.waitForAlert(driver);

        assertEquals("The form was successfully submitted!", confirmation.getAlertText(driver));

        System.out.println(confirmation.getAlertText(driver));
        driver.quit();
    }
}
