package Inheritance;

public class InheritanceEG2 {

	public static void main(String[] args) {
		
		InheritanceEG2B objB = new InheritanceEG2B();
		
		new InheritanceEG2A().fun1();
		new InheritanceEG2B().fun1();
		InheritanceEG2B.fun1();
		InheritanceEG2A.fun1();
		
	}

}

class InheritanceEG2A{
	public static void fun1() {
		System.out.println("inside InheritanceEG2A");
	}
}

class InheritanceEG2B extends InheritanceEG2A{
//	public static void fun1() {                           //   this subclass.fun1() is hiding superclass.fun1()
//		System.out.println("inside InheritanceEG2B");
//	}
}