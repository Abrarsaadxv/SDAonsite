package Day08;

import Utility.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsEXERCISE extends TestBase {

    @Test
    public void  test (){
        By box1 = By.id("box1");
        By box2 = By.id("box2");
        By box3 = By.id("box3");
        By box4 = By.id("box4");
        By box5 = By.id("box5");
        By box6 = By.id("box6");
        By box7 = By.id("box7");
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*_*_*_*_*__**_*_*
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*
        By country6 = By.id("box106");
        By country7 = By.id("box107");
        By country4 = By.id("box104");
        By country5 = By.id("box105");
        By country2 = By.id("box102");
        By country3 = By.id("box103");
        By country1 = By.id("box101");
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*
        //Go to URL: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        //Fill in capitals by country.
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
      WebElement elem1= driver.findElement(box1);
        WebElement elem2= driver.findElement(country1);
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*

        WebElement elem3= driver.findElement(box2);
        WebElement elem4= driver.findElement(country2);
        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*
        WebElement elem5= driver.findElement(box3);
        WebElement elem6= driver.findElement(country3);
        WebElement elem7= driver.findElement(box4);
        WebElement elem8= driver.findElement(country4);

        //*_*_*_*_*_*_*_*_*_*_*_*_*__**_*_**_*_*_*_*
        WebElement elem9= driver.findElement(box5);
        WebElement elem10= driver.findElement(country5);
        WebElement elem11= driver.findElement(box6);
        WebElement elem12= driver.findElement(country6);
        WebElement elem13= driver.findElement(box7);
        WebElement elem14= driver.findElement(country7);

        Actions actions = new Actions(driver);

        actions

                .dragAndDrop(elem1,elem2)
                .dragAndDrop(elem3,elem4)
                .dragAndDrop(elem5,elem6)
                .dragAndDrop(elem7,elem8)
                .dragAndDrop(elem9,elem10)
                .dragAndDrop(elem11,elem12)
                .dragAndDrop(elem13,elem14)

                .perform();
        /*
        can be written in a better way such as

    String url = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
    @Test
    public void test(){

        driver.get(url);
        dragCapitolInCountryBox("Madrid","Spain");
        dragCapitolInCountryBox("Washington","United States");
        dragCapitolInCountryBox("Rome","Italy");
        dragCapitolInCountryBox("Seoul","South Korea");
        dragCapitolInCountryBox("Copenhagen","Denmark");
        dragCapitolInCountryBox("Oslo","Norway");
        dragCapitolInCountryBox("Stockholm","Sweden");

    }
    public void dragCapitolInCountryBox(String capital, String country){
        By cap = By.xpath("//div[text()='"+ capital +"'][2]");
        By count = By.xpath("//div[text()='"+country+"']");

        WebElement capitalBox = driver.findElement(cap);
        WebElement countryBox = driver.findElement(count);
        actions.dragAndDrop(capitalBox,countryBox).perform();
    }
         */

    }
}
