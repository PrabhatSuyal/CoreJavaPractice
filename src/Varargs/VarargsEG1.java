package Varargs;

public class VarargsEG1 {
	
	public static void VarargsEG1fun1(String[] args) {
		System.out.println("inside VarargsEG1fun1");
	}
	public static void VarargsEG1fun2(String... strings) {
		System.out.println("inside VarargsEG1fun2");
	}
	public static void VarargsEG1fun3(int... ints) {
		System.out.println("inside VarargsEG1fun3");
	}
	public static void VarargsEG1fun2(String str) {                  // this method will get high priority
		System.out.println("inside VarargsEG1fun2 overloaded String str");
	}
	
	public static void main(String[] args) {
		
		VarargsEG1fun2("aa","bb");
		String[] strArray = { "Ani", "Sam", "Joe" };
		VarargsEG1fun1(strArray);
		VarargsEG1fun2(strArray);
		int[] intArray = { 1,2,3,4 };
		VarargsEG1fun3(intArray);
		VarargsEG1fun2("aaaa");
		
		
	}

}
