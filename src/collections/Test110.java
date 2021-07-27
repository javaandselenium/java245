package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test110 {

	public static void main(String[] args) {

List<Integer> a = Arrays.asList(10,20,30,40,50);
ArrayList list = new ArrayList<>();
list.addAll(a);


Collections.addAll(list,a);
System.out.println(a);

	}

}
