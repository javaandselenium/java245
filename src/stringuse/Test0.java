package stringuse;

public class Test0 {

	public static void main(String[] args) {

          String s=" Hello Java ";
          
          System.out.println(s.length());
          System.out.println(s.charAt(3));
          System.out.println(s.lastIndexOf('v'));
          System.out.println(s.lastIndexOf("Java"));
          System.out.println(s.lastIndexOf('l',4));
          System.out.println(s.concat("Selenium"));
          System.out.println(s.toLowerCase());
          System.out.println(s.toUpperCase());
          System.out.println(s.contains("Hello"));
          System.out.println(s.endsWith(" "));
          System.out.println(s.equals(" Hello Java "));
          System.out.println(s.equalsIgnoreCase(" HELLO JAVA "));
          System.out.println(s.trim());
	}

}
