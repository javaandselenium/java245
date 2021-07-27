package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Test11 {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.add(10);
		p.add(300);
		p.add(1);
		p.add(30);
		p.add(20);
		
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
		

	}

}
