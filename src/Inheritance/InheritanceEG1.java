package Inheritance;

public class InheritanceEG1 {
	public static void main(String[] args) {		
		InheritanceEG1A objb = new InheritanceEG1B(21);
		System.out.println(objb.j);							//runtime poly is not applicable for Variables
		objb.show();
		System.out.println(objb.getI1());
		objb.fun1(); 										// static fun() of reference works same as runtime policy of variables
		objb.fun2();
		//objb.fun3();										//  The method fun3() is undefined for the type InheritanceEG1A
		// check weather runtime polymorphism is working for static method or not? same as variable.
	}
}

class InheritanceEG1A{
	static int i=2;                              //static can be inherited
	private int i1;                              //private var of super class is accessible in child using public method of super class contains that private var
	int j=1;
	public InheritanceEG1A(int i1) {
		super();
		this.i1 = i1;
	}
	InheritanceEG1A show() {
		System.out.println("InheritanceEG1A >> show()");
		return new InheritanceEG1A(i1);
	}
	public int getI1() {
		return i1;
	}
	public static void fun1() {
		System.out.println("inside InheritanceEG1A >> fun1()");
	}
	public void fun2() {
		System.out.println("inside InheritanceEG1A >> fun2()");
	}
}

class InheritanceEG1B extends InheritanceEG1A{
	public InheritanceEG1B(int i1) {
		super(i1);
	}
	int j=3;
	int k=super.i;                                          //calling variable of immediate parent
	//int i=4;                                              //static can't be overridden but can be hidden
	InheritanceEG1B show() {
		super.show();
		System.out.println("InheritanceEG1B");
		return new InheritanceEG1B(j);
	}
//	private int getI1() {                                  //Cannot reduce the visibility of the inherited method from InheritanceEG1A
//		System.out.println("getI1 of InheritanceEG1B");
//		return 0;
//	}
	public static void fun1() {
		System.out.println("inside InheritanceEG1B >> fun1()");
	}
	public void fun2() {
		System.out.println("inside InheritanceEG1B >> fun2()");
	}
	public void fun3() {
		System.out.println("inside InheritanceEG1B >> fun3()");
	}
}
