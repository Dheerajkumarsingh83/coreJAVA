package CHECKEDEXCEPTION;

import java.io.*;
import java.io.FileNotFoundException;

//Main class
public class FileNotFoundExceptiontrycatch {

public static void main(String args[]) {
// passing local directory path to identify a file

try {
	FileInputStream fe = new FileInputStream("/Desktop/Java/new.txt");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}