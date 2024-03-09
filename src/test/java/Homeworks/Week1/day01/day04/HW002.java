package Homeworks.Week1.day01.day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class HW002 {

    //1.Go to https://www.temu.com/.
    //2.Type "iphone" in the search bar and click ENTER.
    //3.Print the result number.
    //4.Click on the first product that appears.
    //5.Add to cart.
    //6.Click on the cart icon.
    //7.Print the product price
    //8.Complete your shopping..
    //9.Turn off the driver.

    // static WebDriver driver;
    @Test
    public void test() {
        ChromeOptions option =new ChromeOptions();

        WebDriver driver = new ChromeDriver(option);
        option.addArguments("start-maximized");

        driver.get("https://www.noon.com/saudi-en/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement searchBar = driver.findElement(By.id("searchBar"));

        //2.Type "iphone" in the search bar and click ENTER.

        searchBar.sendKeys("iphone" + Keys.ENTER);
        //**********************************error*****************************************

        //3.Print the result number.
//String totalResult = driver.findElement(results).getText();
//        System.out.println("totalResult = " + totalResult);
        //String result = driver.findElement(By.className("sc-3729600-4 XsUIG")).getText();

       // System.out.println("result number is  : " + result);

        //**********************************erro************************

        //4.Click on the first product that appears.
        //5.Add to cart.

        //driver.findElement(By.className("sc-19edbe5f-1 iqMsQv"));
    }}