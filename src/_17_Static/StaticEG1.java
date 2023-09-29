package _17_Static;

public class StaticEG1 extends StaticEG1A{
	//StaticEG1A.d=6;                                   //Syntax error on token "d", VariableDeclaratorId expected after this token
	void fun1() {
		StaticEG1A.d=6;                               //static variables can be accessed inside function only
	}

	public static void main(String[] args) {
		
		StaticEG1A obj = new StaticEG1A();
		System.out.println(obj.getC());
		StaticEG1A.d=5;                               //static variable can be changed
		System.out.println(StaticEG1A.d);
		
		
	}
}

class StaticEG1A{
	int c = 3;
	static int d=4;
	static {
		//System.out.println(c);    //Cannot make a static reference to the non-static field c
		d=5;                        //we can’t access non-static variable inside static block, bcoz for that instance needs to be created
		int a = 1; a++;
		final int b = 2;
		//static int d = 2;       //Illegal modifier for the variable d; only final is permitted
	}
	public int getC() {
		d=3;
		return c;
	}
}