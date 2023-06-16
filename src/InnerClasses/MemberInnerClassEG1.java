package InnerClasses;

public class MemberInnerClassEG1 {

	public static void main(String[] args) {
		
		MemberInnerClassEG1 obj1 = new MemberInnerClassEG1();
		MemberInnerClassEG2 obj2 = obj1.new MemberInnerClassEG2();
		System.out.println(obj2.j);
		
	}
	
	class MemberInnerClassEG2 {
		//static int i=1;//The field i cannot be declared static in a non-static inner type, unless initialized with a constant expression
		static final int j=1;
	}
	
}