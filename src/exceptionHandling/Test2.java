package exceptionHandling;

public class Test2 {

	public static void main(String[] args) {
     int[] a=new int[3];
     a[0]=10;
     a[1]=20;
     a[2]=30;
     try {
     a[3]=40;
     }
     catch(ArrayIndexOutOfBoundsException e) {
    	 System.out.println("handle");
     }

     catch(Exception e1) {
     System.out.println(a[4]);
     }
     
     System.out.println("hello");
		


	}

}
