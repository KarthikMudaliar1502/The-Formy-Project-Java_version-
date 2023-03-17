import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class formPage {
    public static void submitForm(WebDriver driver) {
        driver.findElement(By.id("first-name")).sendKeys("Will");
        driver.findElement(By.id("last-name")).sendKeys("Smith");
        driver.findElement(By.id("job-title")).sendKeys("Test Analyst");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value='2']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("01/01/2024");
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
