package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
	public static void demo() {
		try {
		FileInputStream f=new FileInputStream("./d");
	}
		catch(Exception e) {
			System.out.println("Handled");}
		}
	

	public static void main(String[] args) {

Test8.demo();

	}

}
