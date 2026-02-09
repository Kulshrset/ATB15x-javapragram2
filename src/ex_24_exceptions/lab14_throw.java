package ex_24_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab14_throw {
    static void main(String[] args) {

    }

    static void t() throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("C://abc.txt");

//throws is adding to functions
        //try catch is adding in block of code
    }
}

