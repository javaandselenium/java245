package collections;

import java.util.PriorityQueue;

public class Test13 {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.add(10);
		p.add(300);
		p.add(1);
		p.add(30);
		p.add(20);
		
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p);

	}

}
