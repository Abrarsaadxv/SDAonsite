package Day08;

import Utility.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class C04Horizantal  extends TestBase {
    @Test
    public void sliderTest(){
        By slider = By.xpath("//div[@class='range-slider vertical-range']/span[1]");
        By slider2 = By.xpath("//div[@class='range-slider']/span[1]");
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*

        driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");
        WebElement sliderButton = driver.findElement(slider);
        actions
                .dragAndDropBy(sliderButton,0,-32)
                .pause(Duration.ofSeconds(2))
                .dragAndDropBy(sliderButton,0,32)
                .build()
                .perform();

        // horzantel is the himwork

        WebElement sliderButton2= driver.findElement(slider2);
actions
        .dragAndDropBy(sliderButton2,-100,0)
                .pause(Duration.ofSeconds(2))
        .dragAndDropBy(sliderButton2,100,0)
        .build()
         .perform();

    }
}
