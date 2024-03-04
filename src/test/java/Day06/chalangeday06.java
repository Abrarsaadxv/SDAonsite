package Day06;
import com.github.javafaker.Faker;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class chalangeday06 {
    static WebDriver driver;


        @BeforeClass
        public static void setup() {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            driver.get("https://thinking-tester-contact-list.herokuapp.com");
        }

        @AfterClass
        public static void tearDown() {
            // driver.quit();
        }
        @Test
        public void test() {
            // driver.get("https://thinking-tester-contact-list.herokuapp.com/contactList");

            WebElement element =  driver.findElement(By.id("email"));
            //Click on Add a New contact button
            element.sendKeys("sda232@gmail.com");

            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("sda@321");

            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();

            WebElement add = driver.findElement(By.id("add-contact"));
            add.click();

            WebElement Title = driver.findElement(By.xpath("//h1[text()='Add Contact']"));
            Assert.assertTrue(Title.isDisplayed()); //--- check the page is displayed

            Faker faker = new Faker();

            String first = faker.name().firstName();
            WebElement firstname =  driver.findElement(By.id("firstName"));
            firstname.sendKeys(first); //---> to make a good check

            //WebElement fname=  driver.findElement(By.id("firstName"));
            //fname.sendKeys(faker.name().firstName());

            String lname1 = faker.name().lastName();
            WebElement lname=  driver.findElement(By.id("lastName"));
            lname.sendKeys(lname1);

            WebElement DOF= driver.findElement(By.id("birthdate"));
            DOF.sendKeys("2005-02-12"); //--> date not allowed in faker


            WebElement email = driver.findElement(By.id("email"));
            email.sendKeys(faker.internet().emailAddress());

            WebElement phone = driver.findElement(By.id("phone"));
            phone.sendKeys(faker.number().digits(8));

            WebElement adress1=  driver.findElement(By.id("street1"));
            adress1.sendKeys(faker.address().streetName());

            WebElement adress2 =  driver.findElement(By.id("street2"));
            adress2.sendKeys(faker.address().streetAddress());


            WebElement city = driver.findElement(By.id("city"));
            city.sendKeys(faker.address().city());

            WebElement state = driver.findElement(By.id("stateProvince"));
            state.sendKeys(faker.address().state());

            WebElement postal = driver.findElement(By.id("postalCode"));
            postal.sendKeys(faker.address().zipCode());

            WebElement country = driver.findElement(By.id("country"));
            country.sendKeys(faker.address().country());


            WebElement supmit1 = driver.findElement(By.id("submit"));
            supmit1.click();

            String allname = "//*[contains(text(),'"+first+" "+lname1+"')]";
            System.out.println(allname);
            WebElement create = driver.findElement(By.xpath(allname));
            Assert.assertEquals(first +" "+lname1 , create.getText());


//        String allname = "//*[contains(text(),'"+first+" "+lname1+"')]";
//        //System.out.println(allname);
//        List<WebElement> create = driver.findElements(By.xpath(allname));
//        Assert.assertFalse(create.isEmpty());
//
//        WebElement creat = driver.findElement(By.className("contactTableBodyRow"));
//        Assert.assertTrue(creat.isDisplayed());  ------> there are another way

    }
}








