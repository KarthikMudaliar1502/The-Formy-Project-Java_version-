import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alertSwitch {

    public static void alertMsg(WebDriver driver) throws InterruptedException {
        WebElement switchWindow = driver.findElement(By.xpath("/html/body/div/div/li[13]/a"));
        switchWindow.click();
        Thread.sleep(1000);

        WebElement switchAlertButton = driver.findElement(By.id("alert-button"));
        switchAlertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("Test Successfully Completed!");
    }
}
