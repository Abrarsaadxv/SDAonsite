package Day08;

import Utility.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C05KeyBoardActions  extends TestBase {
    @Test
    public void test(){
        By boxId= By.id("autoCompleteMultipleContainer");
driver.get("https://demoqa.com/auto-complete");
        WebElement textBox= driver.findElement(boxId);

        actions
                //usingkeybord
                .click(textBox)
                .keyDown(Keys.SHIFT)
                .sendKeys("ex")
                .keyUp(Keys.SHIFT)
                .sendKeys("ceptional")
                .perform();



    }
}
