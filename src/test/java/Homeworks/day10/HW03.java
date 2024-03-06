package Homeworks.day10;

import Utility.TestBase;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;

public class HW03 extends TestBase {
    public static void main(String[] args) {


//Day:11/HW:2
//Create a File on Desktop
//Verify that the file exists


        String Filename = "Homework.txl";
        String desktop = "Desktop";
        String userHome = System.getProperty("user.home");
        String separator = System.getProperty("file.separator");

        String path = userHome+separator+desktop+separator+Filename;
        System.out.println("path = " + path);

        boolean isExists = Files.exists(Path.of(path));
        System.out.println("is Exists = " + isExists);
        Assert.assertTrue(isExists);

    }
}
