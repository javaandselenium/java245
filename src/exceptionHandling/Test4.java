package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {

	public static void main(String[] args) {

		try {
		int i=1/0;
		}
		catch(Exception e) {
		System.out.println(e);
		System.out.println("AE Handled");
		}
		
		try {
		FileInputStream fis=new FileInputStream("./s");
		}
		catch(FileNotFoundException p){
			System.out.println(p);
			System.out.println("FNF Handled");
		}
		
		
		System.out.println("Hello java");


	}

}
