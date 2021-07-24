package collections;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20.89);
	a.add("Hello");
	a.add('A');
	
	System.out.println(a.size());
	
	System.out.println(a.indexOf('A'));
	
	System.out.println(a.contains(10));
	
          a.add(2,"Java");
          
          a.clear();
          
          System.out.println("After clear "+a.size());
	
	
	
	
	
	
	
	
	

	}

}
