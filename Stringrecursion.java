package dsa1week;

public class Stringrecursion {
 public static void main(String[] args) {
	 String s="Chirag";
	 System.out.println(recstring(s));
 }
 private static String recstring(String s) {
	 if(s==null || s.length()<=1) 
		 return s;
	 
	 
	return recstring(s.substring(1))+s.charAt(0); 
 }
}
