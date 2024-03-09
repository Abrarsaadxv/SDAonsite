package Homeworks.day03;

import org.checkerframework.checker.units.qual.K;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Teask01 {

        /*
Create the driver with BeforeClass and make it static inside the class.
Go to http://www.google.com
Type "Green Mile" in the search box and print the number of results.
Type "Premonition" in the search box and print the number of results.
Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
Close with AfterClass.
 */




   static WebDriver driver;
  // By searchBox = By.name("q");
  //  By result =By.id("result-stats");
    @BeforeClass
    public static void setup(){
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().fullscreen();
        driver.get("http://www.google.com");

    }

    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }
    @Test
    public void  greenMileTest(){
       // Type "Green Mile" in the search box and print the number of results.

        WebElement elemntkey =driver.findElement(By.name("q"));
        elemntkey.sendKeys("Green Mile" + Keys.ENTER);
        //Type "Premonition" in the search box and print the number of results.
        String totalResult= driver.findElement(By.id("result-stats")).getText();
        System.out.println("totalResult = " + totalResult);

    }



    @Test
    public void  PremonitionTest(){
        // Type "Premonition" in the search box and print the number of results.
        driver.get("http://www.google.com");

        WebElement elemntkey =driver.findElement(By.name("q"));
        elemntkey.sendKeys(" Premonition" + Keys.ENTER);
        //Type "Premonition" in the search box and print the number of results.
        String totalResult= driver.findElement(By.id("result-stats")).getText();
        System.out.println("totalResult = " + totalResult);

    }

    @Test
    public void  BenjaminTest(){
        // Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
        driver.get("http://www.google.com");

        WebElement elemntkey =driver.findElement(By.name("q"));
        elemntkey.sendKeys(" The Curious Case of Benjamin Button" + Keys.ENTER);
        //Type "Premonition" in the search box and print the number of results.
        String totalResult= driver.findElement(By.id("result-stats")).getText();
        System.out.println("totalResult = " + totalResult);

    }

}
