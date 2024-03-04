package Day08;

import Utility.TestBase;
import org.junit.Test;

public class C03BaseClass extends TestBase {
    @Test
    public void test() {
        driver.get("https://google.com/");

        System.out.println("driver.getTitle() = " + driver.getTitle());

    }

    @Test
    public void test1() {
        driver.get("https://clarusway.com");

        System.out.println("driver.getTitle() = " + driver.getTitle());
    }

    @Test
    public void test2() {
        driver.get("https://Amazon.com/");

        System.out.println("driver.getTitle() = " + driver.getTitle());


    }
}
