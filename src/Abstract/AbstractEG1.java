package Abstract;

public class AbstractEG1 {
	//abstract int j=2;           //Illegal modifier for the field j; only public, protected, private, static, final, transient & volatile are permitted
	//abstract void method1() ;   //The abstract method method1 in type AbstractEG1 can only be defined by an abstract class
	
	public static void main(String[] args) {
		System.out.println("hello main");
		//AbstractEG1A obj1 = new AbstractEG1A(); //Cannot instantiate the type AbstractEG1A( abstract class )
	}

}

abstract class AbstractEG1A{
	//abstract int i=2;   //only public, protected, private, static, final, transient & volatile are permitted
	void method2() {
		System.out.println("abs class non abs method");
	}
}