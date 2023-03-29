import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;
import java.util.Objects;

public class formData {
    static WebDriver driver = null;
    public static void main(String[] args) throws IOException, InterruptedException {

        String ProjectPath = System.getProperty("user.dir");
        XSSFWorkbook book = new XSSFWorkbook(ProjectPath + "/pages/data.xlsx");
        XSSFSheet sheet = book.getSheet("Sheet1");
        int rowCount = sheet.getPhysicalNumberOfRows();

        int i = 8, j = 0;
        while (i < rowCount) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get("https://formy-project.herokuapp.com/form");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            String firstName = sheet.getRow(i).getCell(j).getStringCellValue();
            driver.findElement(By.id("first-name")).sendKeys(firstName);
            j++;
            String lastName = sheet.getRow(i).getCell(j).getStringCellValue();
            driver.findElement(By.id("last-name")).sendKeys(lastName);
            j++;
            String jobTitle = sheet.getRow(i).getCell(j).getStringCellValue();
            driver.findElement(By.id("job-title")).sendKeys(jobTitle);
            j++;
            String education = sheet.getRow(i).getCell(j).getStringCellValue();
            if (Objects.equals(education, "High School")) {
                driver.findElement(By.id("radio-button-1")).click();
            } else if (Objects.equals(education, "College")) {
                driver.findElement(By.id("radio-button-2")).click();
            } else {
                driver.findElement(By.id("radio-button-3")).click();
            }
            Thread.sleep(1000);
            j++;
            String gender = sheet.getRow(i).getCell(j).getStringCellValue();
            if (Objects.equals(gender, "Male")) {
                driver.findElement(By.id("checkbox-1")).click();
            } else if (Objects.equals(gender, "Female")) {
                driver.findElement(By.id("checkbox-2")).click();
            } else {
                driver.findElement(By.id("checkbox-3")).click();
            }
            Thread.sleep(1000);
            j++;
            double experience = sheet.getRow(i).getCell(j).getNumericCellValue();
            if (experience<2) {
                driver.findElement(By.cssSelector("option[value='1']")).click();
            } else if (experience<5) {
                driver.findElement(By.cssSelector("option[value='2']")).click();
            } else if (experience<10) {
                driver.findElement(By.cssSelector("option[value='3']")).click();
            } else {
                driver.findElement(By.cssSelector("option[value='4']")).click();
            }
            Thread.sleep(1000);
            j++;
            String dateField = sheet.getRow(i).getCell(j).getStringCellValue();
            driver.findElement(By.id("datepicker")).sendKeys((CharSequence) dateField);

            driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
            Thread.sleep(1000);
            j = 0;
            i++;
            driver.quit();
        }
    }
}