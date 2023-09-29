package _9_Generics;

import java.util.ArrayList;

public class GenericsEG1 {

	public static void main(String[] args) {
		
		Test<Integer> iObj = new Test<Integer>(15); // instance of Integer type
        System.out.println("int obj : "+iObj.getObject());  
        Test<String> sObj = new Test<String>("GeeksForGeeks");// instance of String type
        System.out.println("string obj : "+sObj.getObject());
        Test<Test> customObj = new Test<Test>(sObj);
        System.out.println("custom obj : "+customObj.getObject());
        
        ArrayList list = new ArrayList<>();
        list.add("aaa");
        list.add(3);
        list.add(iObj);
        list.add(sObj);
        list.add(customObj);
        for (Object object : list) {
			System.out.println(object);
		}
        
	}
}

class Test<T> {    
    T obj;   // An object of type T is declared, T is “type”
    Test(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}