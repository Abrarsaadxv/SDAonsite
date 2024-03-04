package Homeworks.day08;

import Utility.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

public class HW02 extends TestBase {

By titelM= By.xpath("//*[title ='New Window']");
    @Test
    public void test() {
        //Go to URL: https://the-internet.herokuapp.com/windows

        driver.get("https://the-internet.herokuapp.com/windows");
        //Verify the text: “Opening a new window”
        WebElement verifyTitele1 = driver.findElement(By.xpath("//*[text()='Opening a new window']"));
        // System.out.println("verTitel.getText() = " + verTitel.getText());
        Assert.assertTrue(verifyTitele1.getText().contains("Opening a new window"));
        //Verify the title of the page is “The Internet”
        String actualTitle = driver.getTitle();
        String expectedTitle = "The Internet";
        Assert.assertEquals(actualTitle, expectedTitle);

        //********_____________**********________**********_______
        //********_____________**********________**********_______
        //Click on the “Click Here” button

        By titleText =By.xpath("//*[text()='Click Here']");
        driver.findElement(titleText).click();
        //********_____________**********________**********_______
        //********_____________**********________**********_______

        //Verify the new window title is “New Window”
        Set<String> handlesSet =driver.getWindowHandles();
        Iterator<String> handlesItr = handlesSet.iterator();
        //********_____________**********________**********_______
        String InternetHandle = handlesItr.next();
        String newWindHandle = handlesItr.next();
        //********_____________**********________**********_______
        driver.switchTo().window(newWindHandle);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("New Window"));

        //********_____________**********________**********_______
// Go back to the previous window and then verify the title: “The Internet”

        driver.switchTo().window(InternetHandle);
        Assert.assertTrue(driver.getTitle().contains("The Internet"));


    }
}
