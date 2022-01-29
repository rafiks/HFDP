package com.Javaiodecorator;

import javax.imageio.IIOException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("test.txt"))); // test.txt should be in project root
            while ((c = in.read()) >=0 ){
                System.out.print((char) c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
