import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class scrollFunction {
    public static void scrollTo(WebDriver driver) throws InterruptedException {
        WebElement scroll = driver.findElement(By.xpath("/html/body/div/div/li[11]/a"));
        scroll.click();
        Thread.sleep(1000);

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Automation");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/23");

        Thread.sleep(1000);

        System.out.println("Test Successfully Completed");

    }
}
