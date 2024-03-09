package Homeworks.Week1.day01.day05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class Task02Day5 {
    //     Task 2:
    //     * breakout task: (in a separate class)
    //     * navigate to this url https://www.saucedemo.com/v1/inventory.html
    //     * add the first item you find to your cart
    //     * open your cart*
    //     * assert that the item name is correct inside the cart
    //     */
    @Test
    public void test1() {


        ChromeOptions opthions = new ChromeOptions();
        opthions.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(opthions);
        // JavascriptException js =(JavascriptException)driver.getDriver()
        ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Go to URL: https://demoqa.com/radio-button
        driver.get("https://www.saucedemo.com/v1/inventory.html");
          //     * add the first item you find to your cart
        WebElement addToCartButton = driver.findElement(By.xpath("//*[@class='btn_primary btn_inventory' and text()='ADD TO CART'][1]"));
        addToCartButton.click();
        //     * open your cart*
WebElement myCart=driver.findElement(By.xpath("//*[@class='svg-inline--fa fa-shopping-cart fa-w-18 fa-3x ']"));
myCart.click();
        //     * assert that the item name is correct inside the cart
 WebElement firstItemName = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        Assert.assertTrue(firstItemName.isDisplayed());

    }
}