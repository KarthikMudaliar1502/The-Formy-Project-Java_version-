import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDownMenu {

    public static void dropDownFunction (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement dropDownMenu = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("/html/body/div/div/li[6]/a")));
        dropDownMenu.click();

        WebElement dropDownButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownMenuButton")));
        dropDownButton.click();

        WebElement buttons = driver.findElement(By.xpath("/html/body/div/div/div/a[2]"));
        buttons.click();

    }
}
