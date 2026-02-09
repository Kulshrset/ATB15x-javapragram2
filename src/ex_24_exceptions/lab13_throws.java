package ex_24_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab13_throws {
    static void main(String[] args) {

    }
    static void t(){
        try {
            FileInputStream fileInputStream=new FileInputStream("C://abc.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
