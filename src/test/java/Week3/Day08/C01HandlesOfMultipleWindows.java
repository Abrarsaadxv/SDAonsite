package Day08;

import Utility.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C01HandlesOfMultipleWindows  extends TestBase {
    @Test
    public void test(){

        // driver.findElements(By.id())
        By tabElment =By.id("tabButton");
        By windElment=By.id("windowButton");
        By messageElment = By.id("messageWindowButton");
        By tabTextMessage =By.id("sampleHeading");
        //Go to URL: https://demoqa.com/browser-windows
driver.get("https://demoqa.com/browser-windows");
        //Click on all the child windows.
        driver.findElement(tabElment).click();
        driver.findElement(windElment).click();
        driver.findElement(messageElment).click();
        //Print the text present on all the child windows in the console.
        Set<String> handeles =  driver.getWindowHandles();
        Iterator<String> itr = handeles.iterator();;
         String firstMainhandeler =itr.next();
        String handlerTab =itr.next();
        String windowHandler =itr.next();
        String messageHandler =itr.next();



        //Print the heading of the parent window in the console.
        driver.switchTo().window(handlerTab);
        System.out.println(driver.findElement(tabTextMessage).getText());

    }
}
