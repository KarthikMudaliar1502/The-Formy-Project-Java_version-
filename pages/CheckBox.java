import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {

    public static void checkboxes(WebDriver driver) throws InterruptedException {
        WebElement checkBoxes = driver.findElement(By.xpath("/html/body/div/div/li[3]/a"));
        checkBoxes.click();
        Thread.sleep(1000);

        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.id("checkbox-3")).click();
    }
}
