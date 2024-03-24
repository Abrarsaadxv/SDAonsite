package Week5.Day01.Day02;

import Utility.TestBase;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class C03logTask extends TestBase {

    @Test
    public void test() {
        PropertyConfigurator.configure("log4j.properties");

        Logger logger = Logger.getLogger(C03logTask.class);



        //Go to URL: https://healthunify.com/bmicalculator/
        driver.get("https://healthunify.com/bmicalculator/");
        //Entring weight
        logger.trace("This is a trace message");
        WebElement weight = driver.findElement(By.xpath("//*[@name='wg']"));
        weight.sendKeys("55" + Keys.ENTER);
        //Selecting kilograms
        logger.debug("This is a debug message");

        WebElement kilo = driver.findElement(By.name("opt1"));
        logger.info("This is an info message");

        Select select1 = new Select(kilo);
        select1.selectByIndex(1);

        //Selecting height in feet
        WebElement Height = driver.findElement(By.name("opt2"));
        Select select2 = new Select(Height);
        select2.selectByIndex(3);
        logger.error("This is an error message");

        //Selecting height in inchs
        WebElement Height02 = driver.findElement(By.name("opt3"));
        Select select3 = new Select(Height02);
        select3.selectByIndex(6);
        //Clicking on calculate
        WebElement Calculate = driver.findElement(By.name("cc"));
        Calculate.click();
        //Getting SIUnit value
        logger.fatal("This is a fatal message");

        WebElement si = driver.findElement(By.xpath("//*[@name='si'  and  @readonly='readonly']"));
        System.out.println(" SIUnit value  is " + si.getText());
        //Getting USUnit value
        driver.findElement(By.name("us")).getText();
        //Getting UKUnit value
        driver.findElement(By.name("uk")).getText();

        //Getting overall description


    }

}
