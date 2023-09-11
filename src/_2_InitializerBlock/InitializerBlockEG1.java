package _2_InitializerBlock;

public class InitializerBlockEG1 {
	
	int i=1;
	static int j=2;	
	{		
		System.out.println("The contents of the initializer block are executed whenever any constructor is invoked (before the constructor’s contents)");
		System.out.println("Instance initializer block with non-static var i = "+i);
		System.out.println("Instance initializer block with static var j = "+j);
	}

	{
		System.out.println("In the initializer block");
		try {
			int jj = 10/0;
		} catch(Exception e){
			System.out.println("Exception while initializing" + e.getMessage());
//			throw new RuntimeException(e.getMessage());		// run time Exception is allowed inside initializer block	//Exception in thread "main" java.lang.RuntimeException: / by zero
//			throw new IOException(e.getMessage());			// Unhandled exception: java.io.IOException
		}
	}
	
	static{		
		System.out.println("static initialization block was called as soon as the class was loaded and it accessed static variable");
		System.out.println("Static initializer block with var i giving error \"Cannot make a static reference to the non-static field i\" ");
		System.out.println("Static initializer block with var j = "+j);
	}

	static {
		System.out.println("In the static block");
		try {
			int jj = 10/0;
		} catch(Exception e){
			System.out.println("Exception while initializing" + e.getMessage());
//			throw new RuntimeException(e.getMessage());		// run time Exception is allowed inside static block	// runtime Exp + Exception in thread "main" java.lang.ExceptionInInitializerError
//			throw new IOException(e.getMessage());			// Unhandled exception: java.io.IOException
		}
	}


	public static void main(String[] args) {
		
		System.out.println("...............creating obj of class now..............");
		InitializerBlockEG1 obj = new InitializerBlockEG1();
		
	}

}

/*
* ..................if class A extends B : flow of execution is.........
B class is loaded
A class is loaded
An object of B is being created
Constructor of B class is called classA
An object of A is being created
Constructor of class A is called classA
 * */