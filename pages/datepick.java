import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class datepick {
        public static void datepicker(WebDriver driver) throws InterruptedException {
                WebElement picker = driver.findElement(By.xpath("/html/body/div/div/li[4]/a"));
                picker.click();
                Thread.sleep(1000);

                WebElement date = driver.findElement(By.id("datepicker"));
                date.click();
                date.sendKeys("02/15/2017");
                date.sendKeys(Keys.RETURN);
    }
}
