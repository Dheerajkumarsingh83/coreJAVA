package CHECKEDEXCEPTION;

import java.io.*;
import java.io.FileNotFoundException;

//Main class
public class FileNotFoundExceptionthrows {

public static void main(String args[]) throws FileNotFoundException {
 // passing local directory path to identify a file

 FileInputStream fe = new FileInputStream("/Desktop/Java/new.txt");
}
}
