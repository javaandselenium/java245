package collections;

import java.util.Vector;

public class Test7 {

	public static void main(String[] args) {
		Vector c=new Vector();
		c.add(10);
		c.add(23.90);
		c.add("hello");
		c.add(true);
		c.add('A');
		c.add(10);
		c.add(23.90);
		c.add("hello");
		c.add(true);
		c.add('A');
		c.add('A');
		
		System.out.println("The size of the vector "+ c.size());
		System.out.println("The capacity of the list "+c.capacity());
		

	}

}
