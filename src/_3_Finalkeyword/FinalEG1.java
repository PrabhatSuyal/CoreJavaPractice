package _3_Finalkeyword;

public class FinalEG1{


	public static void main(String[] args) {
		
		FinalEG1A obj1 = new FinalEG1A(1);
		//obj1.i = 2; //The final field FinalEG1A.i cannot be assigned
		System.out.println(obj1.i);
		obj1.fun();
				
		final StringBuilder sb = new StringBuilder("G"); //non-transitivity in final
		sb.append("FG"); System.out.println(sb);         //by changing the string, sb obj start referring to other location
	}
}

final class FinalEG1A{
	final int i;                                     //final var can be inherited     //blank final variable
	final void fun() {                               //final method can be inherited
		System.out.println("parent final method");
	}
//	{                                                // final var can be initiated using instance initializer block, constructor and by declaration
//		i=1;
//	}
	public FinalEG1A(int i) {
		this.i = i;
	}
}