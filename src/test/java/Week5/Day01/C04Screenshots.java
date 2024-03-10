package Week5.Day01;

import Utility.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class C04Screenshots extends TestBase {


    @Test
    public void takefullscreenshot() throws IOException {
        //go to linkedin
        driver.get("https://www.linkedin.com/");
// take a page screenshoot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String date = new SimpleDateFormat("yyyy_MM_hh_m_ss").format(new Date());

        System.out.println("date = " + date);
        String seprartor = System.getProperty("file.separator");
        File destination = new File(System.getProperty("user.dir") + seprartor + "test-output" + seprartor + "screenshots" + seprartor + "Linkedin" + date + ".png");
        FileUtils.copyFile(source, destination);
    }

    @Test
    public void test2() throws IOException {
        //go to linkedin
        driver.get("https://www.linkedin.com/");
        WebElement headline = driver.findElement(By.xpath("//*[@data-test-id='hero__headline']"));
       String date =  new SimpleDateFormat("yyyy_MM_hh_m_ss").format(new Date());
       String seprartor = System.getProperty("file.separator");
        File source = headline.getScreenshotAs(OutputType.FILE);
        TakesScreenshot ts = (TakesScreenshot) driver;

                File destination = new File(System.getProperty("user.dir") + seprartor + "test-output" + seprartor + "screenshots" + seprartor + "Linkedin" + date + ".png");
        FileUtils.copyFile(source, destination);
    }




}
