import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.*;

public class NeedOfJava8 {

    /**
     *  steps -
     *  1. Go to amazon.in
     *  2. Fetch all links
     *  3. Remove empty links text
     *  4. Sort the links
     *  5. Print links starting with "C" or "D"
     */
    WebDriver driver;
    @Test
    public void withJava8(){

        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
        List<String> listOfLinksText = new ArrayList<>();

        for(int i=0;i<listOfLinks.size();i++){
            if(!listOfLinks.get(i).getText().isEmpty()) {
                listOfLinksText.add(listOfLinks.get(i).getText());
            }
            System.out.println("***** lisr ");
            List<String> listAfterRemovingDuplicates = new ArrayList<>(new HashSet<>(listOfLinksText));
            Collections.sort(listAfterRemovingDuplicates);

            for(int j=0;j<listAfterRemovingDuplicates.size();j++){
                System.out.println("******list without duplicates*******"+listAfterRemovingDuplicates.get(j));
                if(listAfterRemovingDuplicates.get(j).startsWith("C")
                    || listAfterRemovingDuplicates.get(j).startsWith("D")){
                    System.out.println("******list without duplicates and with starting " +
                            "characters 'C' or 'D' *******"+listAfterRemovingDuplicates.get(j));
                }
            }

        }
        driver.quit();
    }

    @Test
    public void usingJava8(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.findElements(By.tagName("a"))
                .stream()
                .map(e->e.getText())
                .filter(s->!s.isBlank())
                .distinct()
                .sorted()
                .filter(s->s.startsWith("C") || s.startsWith("D"))
                .forEach(s->System.out.println(s));

        driver.quit();
    }
}
