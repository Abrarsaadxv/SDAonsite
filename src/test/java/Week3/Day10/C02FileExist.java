package Day10;

import Utility.TestBase;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;


import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class C02FileExist {

    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        String sepertor = System.getProperty("file.separator");
        System.out.println("userDir = " + userDir);
        System.out.println("sepertor = " + sepertor);


        String path =userDir + sepertor + "FileExist";

        System.out.println("path = " + path);
        boolean isExists =Files.exists(Path.of(path));

        System.out.println("isExists = " + isExists);


    }

}