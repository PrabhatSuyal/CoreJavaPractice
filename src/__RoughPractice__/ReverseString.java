package __RoughPractice__;

public class ReverseString {

	public static void main(String[] args) {
		String string = "sdfewrw";
		
		StringBuffer stringBuffer = new StringBuffer(string);
		System.out.println(stringBuffer.reverse());
				
		StringBuilder stringBuilder = new StringBuilder(string);
		System.out.println(stringBuilder.reverse());
	}

}
