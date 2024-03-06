package Day09;

import Utility.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class day09chalenage extends TestBase {

    @Test
    public void  test(){
        By serchBar = By.name("search_query");
        By fVideo= By.xpath("//a[contains(@href,'/watch?v=mPZkdNFkNps&pp=ygULcmFpbmUgc291bmQ%3D')]");
        driver.get("https://www.youtube.com ");
        WebElement searchFor= driver.findElement(serchBar);
       // WebElement video= driver.findElement(fVideo);
        searchFor.click();
        //searchFor.sendKeys("raine sound"+ Keys.ENTER);
        actions
                .sendKeys("raine sound").click()
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
        searchFor.submit();
        WebElement video= driver.findElement(fVideo);

       video.click();

        String url= driver.getCurrentUrl();
        String exurl="https://www.youtube.com/watch?v=mPZkdNFkNps";
Assert.assertEquals(url,exurl);
    }
}
