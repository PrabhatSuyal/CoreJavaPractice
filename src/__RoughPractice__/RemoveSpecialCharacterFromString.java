package __RoughPractice__;

public class RemoveSpecialCharacterFromString {

	public static void main(String[] args) {
		String str = "f*dw%aer", newstr="";
		int a = 'a', z= 'z', A = 'A', Z='Z', zero = '0', nine = '9';
		
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i)>=a && str.charAt(i)<=z) || (str.charAt(i)>=A && str.charAt(i)<=Z) || (str.charAt(i)>=zero && str.charAt(i)<=nine)) {
				newstr=newstr+str.charAt(i);
				System.out.println(str.charAt(i));
			}
		}
		
		System.out.println(newstr);
		
	}

}
