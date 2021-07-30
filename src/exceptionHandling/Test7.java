package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test7 {
	
	public static void demo() throws FileNotFoundException 
 {
		FileInputStream f=new FileInputStream("./d");
	}

	public static void main(String[] args) {
		try {
Test7.demo();
		}
		catch(Exception e) {
			System.out.println("handle");
		}


	}

}
