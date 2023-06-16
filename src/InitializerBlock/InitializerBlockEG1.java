package InitializerBlock;

public class InitializerBlockEG1 {
	
	int i=1;
	static int j=2;	
	{		
		System.out.println("The contents of the initializer block are executed whenever any constructor is invoked (before the constructor’s contents)");
		System.out.println("Instance initializer block with non-static var i = "+i);
		System.out.println("Instance initializer block with static var j = "+j);
	}
	
	static{		
		System.out.println("static initialization block was called as soon as the class was loaded and it accessed static variable");
		System.out.println("Static initializer block with var i giving error \"Cannot make a static reference to the non-static field i\" ");
		System.out.println("Static initializer block with var j = "+j);
	}

	public static void main(String[] args) {
		
		System.out.println("...............creating obj of class now..............");
		InitializerBlockEG1 obj = new InitializerBlockEG1();
		
	}

}
