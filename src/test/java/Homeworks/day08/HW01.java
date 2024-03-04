package Homeworks.day08;

import Utility.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.List;

public class HW01  extends TestBase {

    //Go to URL: http://demo.guru99.com/test/guru99home/
    //Find the number of iframes on the page.
    //Link to the third iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
    //Exit the iframe and return to the main page.

    @Test
    public void test(){
        //Go to URL: http://demo.guru99.com/test/guru99home/

        driver.get("http://demo.guru99.com/test/guru99home/");
        //Find the number of iframes on the page.
        List<WebElement>iframeNum = driver.findElements(By.xpath("//iframe"));
        int iframeSize=iframeNum.size();
        System.out.println("iframeSize = " + iframeSize);
        //Link to the third iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
        driver.switchTo().frame(3);
//*****************________________************___________
// ********to be checked **********
// *****************________________************___________

        //Exit the iframe and return to the main page.
driver.switchTo().defaultContent();

    }



}
