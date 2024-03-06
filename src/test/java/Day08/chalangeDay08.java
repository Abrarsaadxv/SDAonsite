package Day08;

import Utility.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class chalangeDay08 extends TestBase {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://clarusway.getlearnworlds.com/sda-test-registration-form");

//        WebElement iframe = driver.findElement(By.xpath("//[@name='Name']"));
//         driver.switchTo().frame(iframe);
        driver.switchTo().frame(0);
//********_____________**********________**********_______

        WebElement firsrname = driver.findElement(By.xpath("//*[@complink='Name_First']"));
        firsrname.sendKeys("Reem ");
        WebElement Lirsrname = driver.findElement(By.xpath("//*[@complink='Name_Last']"));
        Lirsrname.sendKeys("Alex ");
        Assert.assertNotNull(firsrname);
        Assert.assertNotNull(Lirsrname);
        List<WebElement> radButtons = driver.findElements(By.id("Radio-li"));
        radButtons.get(0).click();
        Assert.assertFalse(radButtons.get(0).isSelected());
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*

        //Dropdown
        WebElement elemnt1 = driver.findElement(By.xpath("//*[@id ='Dropdown-arialabel']"));
        Select select1 = new Select(elemnt1);
        select1.selectByValue("Third Choice");
        Assert.assertNotNull(elemnt1);
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*


//Single Line
       WebElement elment2 = driver.findElement(By.id("SingleLine-arialabel"));
        Assert.assertFalse(elment2.isEnabled());

        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*
        //checkBox
      //List<WebElement> checkBox =driver.findElements(By.cssSelector("label[id='Checkbox-arialabel'] span"));
       List<WebElement> checkBox =driver.findElements(By.id("Checkbox-li"));

        checkBox.get(0).click();
        //Assert.assertTrue(checkBox.get(0).isSelected());
// // Q: somthin is Woring if i chose index 1 the test failed
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*

        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*
        //*_*_*_*_*_*_*_*_*_ DONE *_*_*_*__**_*_**_*_*_*_*
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*
//Rating
        By rating= By.id("Rating-arialabel");
         WebElement star =driver.findElement(rating);

//        actions
//        .moveToElement(star)
//        .perform();


    }


}

