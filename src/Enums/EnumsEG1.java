package Enums;

import java.util.Enumeration;

public class EnumsEG1 {

	public static void main(String[] args) {

		// Enum
		
		EnumsEG1A[] enumArray = EnumsEG1A.values();        //compiler or JVM provides this method, nowhere it is declared 
		for (EnumsEG1A element : enumArray) {     // accessing the constants of enums
			System.out.print(element);
		}System.out.println();
		EnumsEG1A.B.Afun1();                               // accessing the method of enums
		System.out.println("instance var value enum1 : "+EnumsEG1A.a.enum1);
		System.out.println("Ordinal/index of B : "+EnumsEG1A.B.ordinal()+" ");
		System.out.print("before changing enum1 var of obj B : "+EnumsEG1A.B.enum1); 
		EnumsEG1A.B.setEnum1(10);
		System.out.println("... after changing enum1 var of obj B : "+EnumsEG1A.B.getEnum1());
		EnumEG1B.b.Bfun1();
		
		//Enumeration<E>
		
	}
}



enum EnumsEG1A{
	A(1),a(2),B,b(4);               // int value can be provided as per constructor(int) and constant can be objectname(String) only
	public int enum1 = 30 ;
	EnumsEG1A(){                   // for constant B() object 
		System.out.println("constructor() of EnumsEG1A "+this.name()+" is called...");
	}
	EnumsEG1A(int i) {                 //only private modifier is permitted so that work as enum not as class
		this.enum1 = i;
		System.out.println("constructor(int) of EnumsEG1A "+this.name()+" is called...");
	}
	void Afun1(){
		System.out.println(this+" >> EG1A >> Afun1");
	}
	public int getEnum1() {
		return enum1;
	}
	public void setEnum1(int enum1) {
		this.enum1 = enum1;
	}
}

enum EnumEG1B{
	A {
		@Override
		void Bfun1() {
			System.out.println("abstract of EnumEG1B >> A >> Bfun1");
		}
	},b {
		@Override
		void Bfun1() {
			System.out.println("abstract of EnumEG1B >> B >> Bfun1");
		}
	};
	abstract void Bfun1();                             //enum can have abstract methods but must be overridden in each constants
}

//class EnumEG1C extends EnumEG1B{	                   //enums can neither extended nor inherited as it is final implicitly
//}