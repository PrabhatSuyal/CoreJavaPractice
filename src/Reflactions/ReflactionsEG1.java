package Reflactions;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflactionsEG1 {

	public static void main(String[] args) {
		
		ReflactionsEG1A obj1 = new ReflactionsEG1A(6,7);
		Class ref = obj1.getClass();               // for reflactions , create object of Class first
		System.out.println("syso ref obj : "+ref+" __tostring__ "+ref.toString());
		System.out.println("......using getDeclaredMethods().......");
		Method[] methods = ref.getDeclaredMethods();
		for (Method method : methods) {				// get all methods
			
			method.getName();						// get name of method 
			int modifier = method.getModifiers();
			//Modifier.toString(modifier);			// get modifier
			method.getReturnType();					//get return type 
			System.out.println(method.getName()+" "+method.getModifiers()+" "+method.getParameterCount()+" "+method.getReturnType());
			try { method.invoke(obj1, null); }      //invoke only public method of real object
			catch (InvocationTargetException | IllegalAccessException | IllegalArgumentException e) {	e.printStackTrace();	}
		}
		System.out.println("......using getDeclaredFields().......");
		Field[] fields = ref.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType()+" "+field.getName()+" "+field.getModifiers()+" ");
			if(field.getModifiers()==2) {
				field.setAccessible(true);
				//field.set(obj1.i, 4);       //Can not set int field Reflactions.ReflactionsEG1A.j to java.lang.Class
			}
		}
		System.out.println("......using getFields().......");
		Field[] fields2 = ref.getFields();
		for (Field field : fields2) {
			System.out.println(field.getType()+" "+field.getName()+" "+field.getModifiers()+" ");
		}
		System.out.println("......using getconstructor().......");
		Constructor[] cnst = ref.getConstructors();
		for (Constructor constructor : cnst) {
			System.out.println(constructor.getName()+" "+constructor.getModifiers()+" "+constructor.getParameterCount());
		}
//		ref.getInterfaces(); //access interfaces
//		ref.getSuperclass();  //access parent class
		
	}

}

class ReflactionsEG1A{
	
	public int i=1;
	private int j=2;
	
	public void fun1() {
		System.out.println("fun1()");
	}
	private void fun2() {
		System.out.println("fun2()");
	}
	public ReflactionsEG1A(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	
}