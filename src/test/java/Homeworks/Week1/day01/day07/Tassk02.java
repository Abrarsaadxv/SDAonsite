package Homeworks.Week1.day01.day07;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// *_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
// *_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_Task2_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
// *_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*

public class Tassk02 {
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/basic_auth");
    }


    @Test
    public void test() {

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        WebElement element1 = driver.findElement(By.xpath("//*[@class='example']"));
        //verify
        Assert.assertTrue(element1.getText().contains("Congratulations! You must have the proper credentials."));
    }
}


// *_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
// *_*_*_*_*_*_*_*_*_**_*_*_*_*_*End_of_task2 _*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
// *_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*