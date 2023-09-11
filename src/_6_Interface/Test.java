package Interface;

import Interface.A.AA;

interface A {	
	 void m1(A a);	
	 static interface AA{
		 default void funAA() {
			 System.out.println("AA > default funAA");
		 }

		void m1(AA a);
	 }
}

abstract class B implements A.AA {            
 void m1(B b){
  System.out.println("One");	 
 }
}

public class Test extends B {
 public void m1(A a){
 System.out.println("Two");
}
 void m1(B b){
	System.out.println("Three");
}
public static void main(String[] args){
 A.AA a = new Test();
 a.m1(a); 
 a.funAA();//  
 }
public void m1(AA a) {
	System.out.println("AA");	
}
}