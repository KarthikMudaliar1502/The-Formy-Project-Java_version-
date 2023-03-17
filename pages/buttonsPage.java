import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class buttonsPage {

    public static void btnPage(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div/li[2]/a")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-success")).click();
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-info")).click();
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-warning")).click();
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-danger")).click();
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-link")).click();
        driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[3]")).click();
    }

}
