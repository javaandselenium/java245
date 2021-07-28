package collections;

import java.util.TreeMap;

public class Test17 {

	public static void main(String[] args) {
		TreeMap<String,Integer> t=new TreeMap<String,Integer>();
		t.put("Ramesh",123);
		
		t.put("Ganesh",456);
		
		t.put("Mahesh",789);
		t.put("Suresh",987);
		t.put("Dinesh",123);
		
		t.put("Ganesh",987);
		t.put("Dinesh",1230);
		
		System.out.println(t);
		System.out.println(t.keySet());
		System.out.println(t.values());
		
		System.out.println(t.get("Suresh"));


		
		

	}

}
