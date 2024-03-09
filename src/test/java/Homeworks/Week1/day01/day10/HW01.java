package Homeworks.day10;

import Utility.TestBase;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class HW01 extends TestBase {
    @Test
    public void test(){
        driver.get("https://www.facebook.com");
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(" ______*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*____" );
        //get cookies
for(Cookie hw1: cookies){
    System.out.println("hw1 = " + hw1); }
       
        //add cookies
        Cookie newcookie = new Cookie("Homework","Task01");
driver.manage().addCookie(newcookie);
        driver.manage().getCookies().forEach(hw-> System.out.println(hw));
        Cookie newcookie2 = new Cookie("Homework2","Task02");
        driver.manage().addCookie(newcookie);
        System.out.println(" ______*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*_*__*____" );
        //delete cookie by name
driver.manage().deleteCookieNamed("Homework2");
        //delete all cookie
        driver.manage().deleteAllCookies();

    }
}
