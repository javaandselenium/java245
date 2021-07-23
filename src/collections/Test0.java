package collections;

import java.util.ArrayList;

public class Test0 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10.90);
		a.add("Hello");
		a.add("Lion");
		a.add('A');
		a.add("");
		a.add(10);
		a.add("Hello");
		a.add(true);
		a.add("fgg7647647%^%^");
		
		System.out.println("value at index 3 "+a.indexOf(3));
	
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}

	}

}
