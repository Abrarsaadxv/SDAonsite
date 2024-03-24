package Day10;

import Utility.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03fileDownload  extends TestBase {
    //    Go to URL: https://the-internet.herokuapp.com/download
//    Download selenium-snapshot.png
//    Verify if the file downloaded successfully.


        @Test
        public void test() throws InterruptedException {
            //    Go to URL: https://the-internet.herokuapp.com/download
            driver.get("https://the-internet.herokuapp.com/download");

            //    Download selenium-snapshot.png
            driver.findElement(By.linkText("selenium-snapshot.png")).click();
            Thread.sleep(500);
            //    Verify if the file downloaded successfully.

            String s = "/Users/suleymankirkil/Downloads";
            String separater = System.getProperty("file.separator");
            String pathOfFile = System.getProperty("user.home")+ separater+"Downloads"+separater+"selenium-snapshot.png";

            boolean isExist = Files.exists(Paths.get(pathOfFile));
            Assert.assertTrue(isExist);

        }
    }