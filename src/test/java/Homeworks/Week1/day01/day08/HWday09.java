package Homeworks.Week1.day01.day08;

import Utility.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HWday09 extends TestBase {
    //Go to URL: http://demo.guru99.com/test/drag_drop.html
    //Drag and drop the BANK button to the Account section in DEBIT SIDE  -- DONE
    //Drag and drop the SALES button to the Account section in CREDIT SIDE  --DONE

    //Drag and drop the 5000 button to the Amount section in DEBIT SIDE
    //Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
    //Verify the visibility of Perfect text.

    @Test
    public void test() {

//Drag and drop the BANK button to the Account section in DEBIT SIDE
        //Drag and drop the SALES button to the Account section in CREDIT SIDE
        By element1 = By.id("credit2");
        By elemen2 = By.id("credit1");
        By elemen3 = By.xpath("//*[text()=' 5000']");
        By elemen4 = By.xpath("//*[text()=' 5000 ']");
       // By finalmessage = By.xpath("//*[ text()='Perfect!']");

        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_*
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_*
//       By elemen3 = By.xpath("//*[ text()=' 5000']");
//   By elemen4 = By.xpath("//*[ text()=' 5000'][1]and @class='button button-orange'][1]");
        ////*[ text()=' 5000' and @class='button button-orange'][1]
//        By elemen4 = By.xpath("//ol[@id='amt8']//li[@class='placeholder']");

        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_*
        //-----------------------------------------------------------------------------------
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_*


        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_*
        By cart1 = By.id("shoppingCart1");
        By cart2 = By.id("shoppingCart3");
        By cart3 = By.xpath("//ol[@id='amt8']//li[@class='placeholder']");
        By cart4 = By.xpath("//ol[@id='amt7']//li[@class='placeholder']");

        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_*
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement elem1 = driver.findElement(element1);
        WebElement elem2 = driver.findElement(cart1);
        WebElement elem3 = driver.findElement(elemen2);
        WebElement elem4 = driver.findElement(cart2);
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_*

        WebElement elem5 = driver.findElement(elemen3);
        WebElement elem6 = driver.findElement(cart3);
        WebElement elem7 = driver.findElement(elemen4);
        WebElement elem8 = driver.findElement(cart4);

       // WebElement elemnt9 = driver.findElement(finalmessage);
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_*
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_*

        actions
                .dragAndDrop(elem1, elem2)
                .dragAndDrop(elem3, elem4)
                .dragAndDrop(elem5, elem6)
                .dragAndDrop(elem7, elem8)
                .perform();
        //Verify the visibility of Perfect text.
By finleMessage = By.xpath("//*[@class='button button-green' and text()='Perfect!']");
String text = driver.findElement(finleMessage).getText();
   Assert.assertTrue(text.contains("Perfect!"));

        // WebElement elemnt9 = driver.findElement(finalmessage);
//        if (elemnt9.isDisplayed()) {
//            System.out.println(" Perfect text is visible");
//        } else {
//            System.out.println(" Perfect text is NOT visible");
//
//        }


    }
}
// COMPLETED