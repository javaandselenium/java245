package collections;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20.89);
		a.add("Hello");
		a.add('A');
		a.add(800);
		
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add(200.89);
		a1.add("Bye");
		a1.add('B');
		a1.add(800);
		
		System.out.println(a.addAll(a1));
		System.out.println(a.containsAll(a1));
	
		
		
		System.out.println(a.removeAll(a1));
		System.out.println(a.retainAll(a1));
		

	}

}
