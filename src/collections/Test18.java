package collections;

import java.util.LinkedHashMap;

public class Test18 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Character> l = new LinkedHashMap<Integer, Character>();
		l.put(1, 'A');
		l.put(2, 'B');
		l.put(3, 'C');
		l.put(4, 'D');
		l.put(5, 'B');

		System.out.println(l);

	}

}
