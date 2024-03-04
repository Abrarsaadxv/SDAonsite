package Homeworks.day06;

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

public class HWTask1 {
    //Hw:1
    //Go to URL: https://the-internet.herokuapp.com/dropdown
    //Select Option 1 using index .
    //Select Option 2 by value.
    //Select Option 1 value by visible text.
    //Print all dropdown value.
    //Verify the dropdown has Option 2 text.
    //Print first selected option.
    //Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.

    static WebDriver driver;
    //*************************Task:1*********************************************

    @Test
    public void test() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dropdown");
        //Select Option 1 using index .
        WebElement elemnt1 = driver.findElement(By.id("dropdown"));
        Select select1 = new Select(elemnt1);
        elemnt1.click();
        //  Select Option 1 using index .
        select1.selectByIndex(1);
        //Select Option 2 by value.
        select1.selectByValue("2");
//    //Print all dropdown value.
        List<WebElement> options = select1.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println("dropdown value : " + options.get(i).getText());
        }
        Assert.assertTrue(options.get(2).isDisplayed());

        //Print first selected option.
        //Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.




        //************************* end_of_Task:1 *********************************************


    }
}
