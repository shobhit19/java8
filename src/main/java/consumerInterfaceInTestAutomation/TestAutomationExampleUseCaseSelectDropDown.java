package consumerInterfaceInTestAutomation;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class TestAutomationExampleUseCaseSelectDropDown {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        WebElement element = driver.findElement(By.id("oldSelectMenu"));
        /**
         * With out java 8
         */
        selectDropDownBy(element,"3","index");
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        selectDropDownBy(element,"1","value");
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        selectDropDownBy(element,"Magenta","text");

        /**
         *  With Java 8
         */
        selectDropDownByJava8((e)->e.selectByValue("1"),element);
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        selectDropDownByJava8((e)->e.selectByIndex(3),element);
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        selectDropDownByJava8((e)->e.selectByVisibleText("Magenta"),element);

        driver.quit();
    }

    // With Java8
    private static void selectDropDownByJava8(Consumer<Select> consumer,WebElement ele){
        Select select = new Select(ele);
        consumer.accept(select);
    }
    // Without Java8
    private static void selectDropDownBy(WebElement element,String textorValueorIndex,String strategy){
        Select select = new Select(element);
        if(strategy.equalsIgnoreCase("value")){
            select.selectByValue(textorValueorIndex);
        } else if (strategy.equalsIgnoreCase("text")) {
            select.selectByVisibleText(textorValueorIndex);
        } else if (strategy.equalsIgnoreCase("index")) {
            select.selectByIndex(Integer.parseInt(textorValueorIndex));
        }
    }
}

