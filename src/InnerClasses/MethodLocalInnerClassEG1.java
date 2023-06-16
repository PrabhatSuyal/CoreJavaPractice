package InnerClasses;

public class MethodLocalInnerClassEG1 {

	public static void main(String[] args) {
		
		MethodLocalInnerClassEG1 obj1 = new MethodLocalInnerClassEG1();
		obj1.fun1();
		
	}
	
	public void fun1() {
		//static int j = 9;                                          //Illegal modifier for parameter j; only final is permitted
		class MethodLocalInnerClassEG2{                              //methodlocal inner class
			int i1;//The field i1 cannot be declared static in a non-static inner type, unless initialized with a constant expression
			
			public MethodLocalInnerClassEG2(int i1) {
				super();
				this.i1 = i1;
			}
			{System.out.println("constructor of method local inner class");}
			void show() {
				System.out.println("inside method local inner class");
			}
		}
		MethodLocalInnerClassEG2 obj2 = new MethodLocalInnerClassEG2(0); //instance of methodlocal inner class is created insid that method
		obj2.show();
	}
	
}
