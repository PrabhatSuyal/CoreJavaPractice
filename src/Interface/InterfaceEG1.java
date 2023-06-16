package Interface;

//import Interface.InterfaceEG1A.*;

public class InterfaceEG1 extends InterfaceEG1C implements InterfaceEG1A,InterfaceEG1D, InterfaceEG1A.InterfaceEG1E {
	int i=3;                                       //  if not defined hear giving error "The field obj.i is ambiguous"
	public void fun1() {
		System.out.println("fun1 of InterfaceEG1");
	}
	public static void main(String[] args) {
		InterfaceEG1A.InterfaceEG1B objB = new InterfaceEG1A.InterfaceEG1B();
		objB.fun1();
		//InterfaceEG1A.InterfaceEG1B.fun1();
		InterfaceEG1 obj= new InterfaceEG1();
		//obj.i =2;                                //The final field InterfaceEG1A.i cannot be assigned
		System.out.println("i = "+obj.i);
		//InterfaceEG1A.j=2;                       //The final field InterfaceEG1A.j cannot be assigned
		//InterfaceEG1C.k=4;                         //it is accessible if k will be public
		System.out.println("K = "+obj.getK());
		System.out.println("j = "+InterfaceEG1A.j);
		
		InterfaceEG1A objA = new InterfaceEG1();
		System.out.println("i = "+objA.i);         //value of i would be of interface because of its reference
		
		InterfaceEG1A.InterfaceEG1E objE = new InterfaceEG1();
		objE.fun1InterfaceEG1D();
	}
}

interface InterfaceEG1A {                   //I1.I2 by this way we can access nested interface/ static interface
	public int j=1;                        // in backend j is working as "public static final int j=1"
	public int i=1;                        // public variable can get inherited // if not initialized will give error
	default void fun1() {
		System.out.println("fun1 of InterfaceEG1A");
	}
	//public static void main(String[] args) { System.out.println("sdfhuytr"); }//interface can’t be instantiated but can be invoked if it contains a main method.
	interface InterfaceEG1E{
		default void fun1InterfaceEG1D() {
			System.out.print("inside InterfaceEG1A > InterfaceEG1E > fun1InterfaceEG1D()");
		} 
	}
	
	class InterfaceEG1B implements InterfaceEG1A{
		//public int i=2;                                     
//		public static void fun1() {                         // drawback : the static methods of an interface are not inherited
//			System.out.println("fun1 of InterfaceEG1B");
//		}		
	}
}
interface InterfaceEG1D {
	public int i=2;
}

class InterfaceEG1C{
	private static int k = 5;
	public int l=4;
	public void fun2() {
		System.out.println("fun2 of InterfaceEG1C");
	}
	public int getK() {
		return k;
	}
}