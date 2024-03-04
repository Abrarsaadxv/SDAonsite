package Day05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.security.Key;
import java.time.Duration;

public class secondeChalenge {


@Test
public void test(){
    ChromeOptions options = new ChromeOptions();
    options.addArguments("start-maximized");
    WebDriver driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
//Add aTODO to the list
    WebElement addItem= driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
    addItem.sendKeys("Wake yp at 7 am "+ Keys.ENTER);
    Assert.assertTrue(addItem.isDisplayed());

    //Remove theTODO that you've added
    WebElement remove =driver.findElement(By.xpath("//*[text()=' Wake yp at 7 am ']"));
    remove.click();
    Assert.assertTrue(remove.isDisplayed());






}

}
