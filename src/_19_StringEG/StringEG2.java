package _19_StringEG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringEG2 {

	public static void main(String[] args) {
		
		//print duplicate char from given string
		/* String str1="eef huu vv", str2 = "";
		for(int i=0; i<str1.length()-1; i++) {
			
			if(str2.contains( String.valueOf(str1.charAt(i)) )) {
				continue;
			}
			else {
				str2=str2+str1.charAt(i);
				for(int j=i+1; j<str1.length(); j++) {
					if(str1.charAt(i)==str1.charAt(j)) {
						System.out.println(str1.charAt(j));
					}
				}
			}
		}
		*/
		
		//System.out.println(checkrotation("abacde","cdeaba"));
		
		//to reverse a string
//		String str1="aabbcc",str2="";
//		StringBuffer strbuf = new StringBuffer(str1);     strbuf=strbuf.reverse();		
//		StringBuilder strbld = new StringBuilder(str1);   strbld.reverse();
//		System.out.println("reverse a string : "+strbld);
//		str2 = rev("abcde");
//		System.out.println(str2);
		
		System.out.println(SmallestSubstringWithAllChars("abcb","cb acb g"));
		
	}
	
	private static int SmallestSubstringWithAllChars(String string, String string2) {
		Set<Character> set1 = new HashSet(Arrays.asList(string.toCharArray()));
		//char[] chararr = (char[])set1.toArray();
		return 0;
	}

	//reverse a string using recursive method
	public static String rev(String str2){
		if(str2.length()==0) {return "";}
		if(str2.length()==1) {return str2;}
		return rev(str2.substring(1,str2.length()))+str2.substring(0, 1);
	}
	
	//check if 2 strings are rotations of each other..............................................................
	/*private static boolean checkrotation(String str1, String str2) {
		if(str1.length()!=str2.length()) {return false;}
		String str3=str2+str2;
		if(str3.contains(str1)) {
			return true;
		}
		return false;
	}*/

}
