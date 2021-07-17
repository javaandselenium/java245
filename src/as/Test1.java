package as;

import accessSpecifiers.Test0;
import accessSpecifiers.Test2;
import accessSpecifiers.Test3;
import accessSpecifiers.Test4;

public class Test1 extends Test4 {
public static void main(String[] args) {
	Test0 t=new Test0();
	t.add();
	System.out.println("public varabile "+t.a);

	Test1 t1=new Test1();
	t1.demo();
	System.out.println("protected varaible "+t1.a);

}
}
