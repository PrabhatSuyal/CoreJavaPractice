package _4_Polymorphism;

public class PolymorphismEG1 extends PolymorphismEG1A{	
	PolymorphismEG1A method1() {                  // covarient return type = method overriding by changing return type
		System.out.println("inside child");
		return new PolymorphismEG1();
	}	
	void method3() {
		System.out.println("PolymorphismEG1 >> method3");
	}
	void method4() {
		System.out.println("PolymorphismEG1 >> method4");
	}
				public static void main(String[] args) {
					System.out.println( (new PolymorphismEG1()).method1() );
					System.out.println( (new PolymorphismEG1A()).method1() );		
					PolymorphismEG1A obj = new PolymorphismEG1A();
					obj.method2(1, true);    //overloading by changing the sequence is accepted
					obj.method2(false, 2);
					
					PolymorphismEG1A obj2 = new PolymorphismEG1();    //upcasting
					//obj2.method3();                                 //The method method3() is undefined for the type PolymorphismEG1A
					obj2.method4();                                   //overriding method is running
					((PolymorphismEG1) obj2).method3();               //downcasting : for downcasting we first need to do upcasting first
				}
}
class PolymorphismEG1A{
	PolymorphismEG1A method1() {
		System.out.println("inside parent");
		return new PolymorphismEG1A();
	}
	
	void method2(int i, boolean bol) {
		System.out.println("inside method2 int,bol");
	}
	void method2(boolean bol, int i) {
		System.out.println("inside method2 bol,int");
	}
	void method4() {
		System.out.println("PolymorphismEG1A >> method4");
	}
}