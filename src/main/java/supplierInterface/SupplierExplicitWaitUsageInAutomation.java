package supplierInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SupplierExplicitWaitUsageInAutomation {


    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .withMessage(()->"custom message")
                .until(ExpectedConditions.elementToBeClickable(By.name("q123"))).sendKeys("Testing mini bytes");

        driver.quit();
    }
}
