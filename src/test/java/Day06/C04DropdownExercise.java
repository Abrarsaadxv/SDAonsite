package Day06;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C04DropdownExercise {
         /*
    Launch the browser.
    Open "https://demoqa.com/select-menu".
    Select the Standard Multi-Select using the element id.
    Verifying that the element is multi-select.
    Select 'Opel' using the index and deselect the same using index.
    Select 'Saab' using value and deselect the same using value.
    Deselect all the options.
    Close the browser.
     */

    static WebDriver driver;
    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu");
    }

    @AfterClass
    public static void tearDown() {
        // driver.quit();
    }
    @Test
    public void test() {

        //    Select the Standard Multi-Select using the element id.
        WebElement elemnt1= driver.findElement(By.id("cars"));
        Select select1 = new Select(elemnt1);
       // Verifying that the element is multi-select.
        Assert.assertTrue(select1.isMultiple());
        //  Select 'Opel' using the index and deselect the same using index.

        select1.selectByIndex(2);
        List<WebElement> options =select1.getOptions();
       Assert.assertTrue(options.get(2).isSelected());

//deselect
        select1.deselectByIndex(2);
        //    Select 'Saab' using value and deselect the same using value.
        select1.selectByValue("saab");
//Assert.assertEquals(2,select1.getAllSelectedOptions().size());
// or can be writen an another waay such as
       // select1.getAllSelectedOptions().size(2);

        //deselect
        select1.deselectByValue("saab");
        //System.out.println("select1.getAllSelectedOptions().get(0).getText() = " +
        // select1.getAllSelectedOptions().get(0).getText());  ** diffrent  way to assert
//    Deselect all the options.
        select1.deselectAll();
     //   select1.getAllSelectedOptions().get(0).getAttribute("value"); ** Diffrent way to assert


//    Close the browser.
       // driver.close();
    }
}
