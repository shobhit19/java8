package consumerInterfaceInTestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.function.Consumer;

public class TestAutomationExampleUseCaseForEach {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        List<WebElement> list =driver.findElements(By.xpath("//a"));

        // Without java 8
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i).getText());
//        }

        // OR

//        for(WebElement e: list){
//            System.out.println(e.getText());
//        }

        // With Java 8

//        Consumer<WebElement> consumer = (element)->System.out.println(element.getText());
//        list.forEach(consumer);
        Consumer<WebElement> consumer1 = (e)->{
            if(!e.getText().isBlank())
            System.out.println(e.getText());
        };
        list.forEach(consumer1);
        driver.quit();
    }
}
