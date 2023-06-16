package MethodReference;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceEG1 {

	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(32,54,23,87,45);
		int j=0;
		list.forEach(l -> System.out.println(l+0.1*l));
		//list.forEach(j -> System.out.println(j));			//Lambda expression's parameter j cannot redeclare another local variable defined in an enclosing scope. 
		
//		Interface1 obj = new Interface1() {					// way 1, using lambda exp 
//			
//			@Override
//			public int print() {
//				return 8;
//			}
//		};
		
//		Interface1 obj;										// way 2 using lambda exp
//		obj = () -> {
//				return 7;
//			} ;
			
//		Interface1 obj = (()-> 6);							// way 3 using lambda exp
		
//		Interface2 obj = (Interface1::show1);				// way 1 , method reference  using static method
//		obj.show();
		
//		LambdaEG1A obj1 = new LambdaEG1A();					// way 2 , method reference using non static method
//		Interface2 obj = (obj1::show2);
//		obj.show();
		
//		Interface2 obj = (LambdaEG1A::new);					// way 3 , method reference using constructor
//		obj.show();
		
	}

}

interface Interface1{
	int print();
//	static void show1() {
//		System.out.println("show1()");
//	}
	
}

interface Interface2{
//	default void show() {
//		System.out.println("show()");
//	}
	void show();
}

class LambdaEG1A{
	public void show2() {
		System.out.println("show2()");
	}
	public LambdaEG1A() {
		System.out.println("LambdaEG1A()");
	}
}
