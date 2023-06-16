package java_basics_II;

public class SwapWords {
// Write a Java program to replace a string "python" with "java" and "java" with "python" in a given string
	public static void main(String[] args) {
		
		String str = "aa bb cc dd";
		str = str.replace("bb", "bb#");
		str = str.replace("cc", "bb");
		str = str.replace("bb#", "cc");
				
		System.out.println(str);
		
	}

}
