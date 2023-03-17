import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class radio {

    public static void radioBtn(WebDriver driver) throws InterruptedException {
        WebElement radioButtons = driver.findElement(By.xpath("/html/body/div/div/li[12]/a"));
        radioButtons.click();
        Thread.sleep(1000);
        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        WebElement radioButton3= driver.findElement(By.cssSelector("input[value='option3']"));
        radioButton3.click();
    }
}
