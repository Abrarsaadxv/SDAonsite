package Homeworks.day06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HWTask3 {
    //Task:3
    //Launch the browser.
    //Open "https://demoqa.com/select-menu".
    //Select the Standard Multi-Select using the element id.
    //Verifying that the element is multi-select.
    //Select 'Opel' using the index and deselect the same using index.
    //Select 'Saab' using value and deselect the same using value.
    //Deselect all the options.
    //Close the browser.
    //*************************Task:3*********************************************

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
    public void Test() {
        //Open "https://demoqa.com/select-menu".
        //Select the Standard Multi-Select using the element id.
        driver.get("https://demoqa.com/select-menu");

        WebElement element = driver.findElement(By.id("cars"));
        Select select = new Select(element);

        System.out.println("select.isMultiple() = " + select.isMultiple());

        select.selectByIndex(2);
        select.deselectByIndex(2);

        select.selectByValue("saab");
        select.deselectByValue("saab");


        select.deselectAll();

        driver.close();


        //************************* end_of_Task:3  *********************************************

    }
}

