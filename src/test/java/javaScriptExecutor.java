import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javaScriptExecutor {
    static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        // Opening a new instance of Firefox Browser //

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://formy-project.herokuapp.com/");
        Thread.sleep(1000);

        // Checking the functionality of Modal page using JavaScript Executor //

        jsModal jsExecute = new jsModal();
        jsExecute.modal(driver);

        System.out.println("Test Successfully Completed!");

        driver.quit();

    }

}
