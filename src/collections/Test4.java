package collections;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("Jan");
		a.add("Feb");
		a.add("March");
		a.add("April");
		a.add("May");
		
		for(Object b:a) {
			System.out.println(b);
		}

	}

}
