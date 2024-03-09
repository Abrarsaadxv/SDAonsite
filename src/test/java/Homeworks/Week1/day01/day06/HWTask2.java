package Homeworks.Week1.day01.day06;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HWTask2 {
    // Task:2
    // Launch the browser.
    // Open "https://demoqa.com/select-menu".
    // Select the Old Style Select Menu using the element id.
    // Print all the options of the dropdown.
    // Select 'Purple' using the index.
    // After that, select 'Magenta' using visible text.
    // Select an option using value.
    // Close the browser.

    static WebDriver driver;

    //*************************Task:2*********************************************
    @Test
    public void test() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        // Launch the browser.
        // Open "https://demoqa.com/select-menu".
        driver.get("https://demoqa.com/select-menu");
        // Select the Old Style Select Menu using the element id.
        WebElement elment1 = driver.findElement(By.id("oldSelectMenu"));
        Select select1 = new Select(elment1);
        // *****************for_loop_**********************************
        // Print all the options of the dropdown.
        List<WebElement> options = select1.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println("dropdown value : " + options.get(i).getText());
        }
        // Select 'Purple' using the index.
        select1.selectByIndex(4);
        // After that, select 'Magenta' using visible text.

        select1.selectByValue("9");
        // Select an option using value.
        select1.selectByValue("5");

        // Close the browser.
        // driver.quit();
        //************************* end_of_Task:2 _Done_ *********************************************


    }
}
