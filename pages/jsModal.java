import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class jsModal {

    public static void modal(WebDriver driver) throws InterruptedException {
        WebElement modal = driver.findElement(By.xpath("/html/body/div/div/li[10]/a"));
        modal.click();
        Thread.sleep(1000);

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();
        Thread.sleep(1000);

        WebElement closeButton = driver.findElement(By.id("close-button"));
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",closeButton);
    }
}
