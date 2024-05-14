package functionalInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalInterfaceTestAutomationUsage {

    private By menuitems = By.xpath("//div[@id='nav-xshop']/a");


    @Test
    public void webElementTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        List<WebElement> elements=driver.findElements(menuitems);

//        List<String> textFromWebElements=getAttributeFromElements(elements,"href");
//        List<String> tagNameFromWebElements = getTagNameFromElements(elements);
//        List<String> attributeFromWebElements = getTextFromElements(elements);
//
//        textFromWebElements.forEach((a)->System.out.println(a));
//        tagNameFromWebElements.forEach((a)->System.out.println(a));
//        attributeFromWebElements.forEach((a)->System.out.println(a));
//
        List<String> text=getDesiredValueFromJava8(elements,(e)->e.getText());
        List<String> tageName = getDesiredValueFromJava8(elements,(e)->e.getTagName());
        List<String> href =getDesiredValueFromJava8(elements,(e)->e.getAttribute("href"));

        text.forEach((a)->System.out.println(a));
        tageName.forEach((a)->System.out.println(a));
        href.forEach((a)->System.out.println(a));
    }

    private List<String> getDesiredValueFromJava8(List<WebElement> elements, Function<WebElement,String> function){
        return elements.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    private List<String> getTagNameFromElements(List<WebElement> elements){
        List<String> list = new ArrayList<>();
        for(WebElement e:elements){
            list.add(e.getTagName());
        }
        return list;
    }
    private List<String> getTextFromElements(List<WebElement> elements){
        List<String> list = new ArrayList<>();
        for(WebElement e : elements){
            list.add(e.getText());
        }
        return list;
    }
    private List<String> getAttributeFromElements(List<WebElement> elements,String attribute){
        List<String> list = new ArrayList<>();
        for(WebElement e : elements){
            list.add(e.getAttribute(attribute));
        }
        return list;
    }
}
