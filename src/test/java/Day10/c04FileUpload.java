package Day10;

import Utility.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class c04FileUpload extends TestBase {

    @Test
    public void test() {
//Go to URL: https://the-internet.herokuapp.com/upload
//Find the path of the file that you want to upload.
//Click on Upload button.
//Verify the upload message.
        By uploade = By.id("file-upload");

        String userdir = System.getProperty("user.dir");
        String separator = System.getProperty("file.separator");
        String fileName = "imagei.jpg";
        String path = userdir + separator + fileName;

        //Go to URL: https://the-internet.herokuapp.com/upload
        driver.get("https://the-internet.herokuapp.com/upload");
         //Find the path of the file that you want to upload.
        WebElement  selectfile= driver.findElement(uploade);

        selectfile.sendKeys("C:\\Users\\Abbey\\Pictures\\imagei.jpg");
       // selectfile.sendKeys(path);// both way  works

        WebElement uploadeMessage = driver.findElement(By.xpath("//h3['File Uploaded!']"));
        Assert.assertTrue(uploadeMessage.isDisplayed());
    }
}
