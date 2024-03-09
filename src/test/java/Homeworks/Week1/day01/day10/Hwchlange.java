package Homeworks.Week1.day01.day10;

import Utility.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Hwchlange extends TestBase {

    @Test
    public void test() {
//Day:11/HW:3 ------> Will be done on weekend
//Go to URL: https://opensource-demo.orangehrmlive.com/
//Login page valid credentials.
//Click PIM on the left side bar
//Click Configuration and select Data Import
//Download sample CSV file.
//Verify if the file downloaded successfully.

        //__*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*_
        //__*__*_*__*_*__*_*__*_*_HW_CHALNAGE_*_*__*_**__*_*__*_*___
        //__*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*

        By userName = By.name("username");
        By password = By.name("password");
        driver.get(" https://opensource-demo.orangehrmlive.com/");
        //__*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*_

        WebElement passelement = driver.findElement(password);
        WebElement userelement = driver.findElement(userName);
//       WebElement pimelment = driver.findElement(pim);
        //__*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*_

        userelement.click();
        actions
                .sendKeys("Admin")
                .build()
                .perform();
        passelement.sendKeys("admin123" + Keys.ENTER);
        //__*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*_
        //Click PIM on the left sidebar             --DONE
        By PIM = By.xpath("//*[text()='PIM']");
        WebElement pimelemente = driver.findElement(PIM);
        pimelemente.click();
        //__*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*_
        //Click Configuration and select Data Import    --DONE
       By config= By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent']");
       WebElement configelemnt = driver.findElement(config);
       configelemnt.click();
       By dataimport = By.xpath("//*[text()='Data Import']");
       WebElement data= driver.findElement(dataimport);
       data.click();
        //__*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*_
        // Download sample CSV file.    --DONE
        driver.findElement(By.linkText("Download")).click();
        //Verify if the file downloaded successfully.  --DONE
        String filePath ="Downloads";
        String fileName ="importData";
        String separater = System.getProperty("file.separator");
        String userHome = System.getProperty("user.home");
//        String path = userHome+separater+filePath+separater+fileName;

        String pathOfFile = System.getProperty("user.home")+ separater+"Downloads"+separater+"importData.csv";

        boolean isExists = Files.exists(Path.of(pathOfFile));
        System.out.println("is Exists = " + isExists);
        Assert.assertTrue(isExists);

        //__*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*_

        //__*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*
        //__*__*_*__*_*__*_*__*_*_HW_CHALNAGE_IS_COMPLETED_*_*__*_*
        //__*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*



    }
}
