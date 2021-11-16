package dsa1week;
import java.util.Arrays;
import java.util.Scanner;
public class ValidAnagram {
  public static void main(String [] args ) {
	  Scanner scan = new Scanner(System.in);
	  String a= scan.next();
	  String b = scan.next();
	  scan.close();
	  boolean ret =isAnagram(a,b);
	  System.out.println((ret)? " not Anagrams": " anagrams");
  }
  static boolean isAnagram(String a,String b) {
	  int a_length = a.length();
	  int b_length = b.length();
	  if(a_length != b_length) return false;
	  a=a.toLowerCase();
	  b=b.toLowerCase(); 
	  char[] a_chars =a.toCharArray();
	  char[] b_chars =a.toCharArray();
	  Arrays.sort(a_chars);
	  Arrays.sort(b_chars);
	  if(a_chars.equals(b_chars)) return true;
	  else return false;
  }
}
