package Interface;

interface MyInterface {
	   public abstract void demo();
	   public default void defaultMethod() {
//	      privateMethod();
//	      staticPrivateMethod();
	      System.out.println("This is a default method of the MyInterface");
	   }

	   public static void staticMethod() {
//	      staticPrivateMethod();
	      System.out.println("This is a static method of the interface");
	   }

//	   private void privateMethod(){                                         //we can use private & private static methods in Java9 Interfaces.
//	      System.out.println("This is a private method of the interface");
//	   }
//	   private static void staticPrivateMethod(){
//	      System.out.println("This is a static private method of the interface");
//	   }
	}

	public class InterfaceMethodsExample implements MyInterface {           //Illegal modifier for the class asdfg; only public, abstract & final are permitted
		

		
	   public void demo() {
	      System.out.println("Implementation of the demo method");
		  //interface MyInterface2{    }  //The member interface MyInterface2 can only be defined inside a top-level class or interface or in a static context
	   }

	   public static void main(String[] args){
	      InterfaceMethodsExample obj = new InterfaceMethodsExample();
	      obj.defaultMethod();
	      obj.demo();
	      MyInterface.staticMethod();
	      
	   }
	}
	