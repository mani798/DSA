package dsa1week;



public class SortingaSentense {
	public static void main(String[] args) {
		String s = "sentence4 a3 is2 This1";
		System.out.println(stringsentense(s));
		}
		public static String stringsentense(String s) {
			  String str[]=s.split(" ");
		        String res[]=new String[str.length+1];
		        String ret="";
		        for(int i=0;i<str.length;i++){
		            int inx=Character.getNumericValue(str[i].charAt(str[i].length()-1));
		            res[inx]=str[i].substring(0,str[i].length()-1);
		        }
		        for(int j=1;j<res.length;j++)
		            ret+=(j==res.length-1)?res[j]:res[j]+" ";
		        return ret;
		
	}
}