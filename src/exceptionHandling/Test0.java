package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test0 {
	public static void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
try {
FileInputStream fis=new FileInputStream("./d");
}
catch(Exception e) {
	System.out.println("handled");
	System.out.println(e);
}




System.out.println("hello");
Test0.add();

		

	}

}
