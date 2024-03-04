package Day08;

import Utility.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
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
//********_____________**********________**********_______
//********_____________**********________**********_______

        //Dropdown
        WebElement elemnt1 = driver.findElement(By.xpath("//*[@id ='Dropdown-arialabel']"));
        Select select1 = new Select(elemnt1);
        select1.selectByValue("Third Choice");
        Assert.assertNotNull(elemnt1);
//********_____________**********________**********_______
//********_____________**********________**********_______


//Single Line
       WebElement elment2 = driver.findElement(By.id("SingleLine-arialabel"));
        Assert.assertFalse(elment2.isEnabled());

        //********_____________**********________**********_______
//********_____________**********________**********_______

        //checkBox
//        List<WebElement> checkBox =driver.findElements(By.xpath("//*[text()='Checkbox']"));
//        checkBox.get(1).click();



    }


}

