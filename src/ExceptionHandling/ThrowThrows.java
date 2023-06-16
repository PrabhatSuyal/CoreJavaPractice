package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowThrows {
	//We cannot use throw inside static block directly without try-catch
	static {try{ throw new ArithmeticException();}catch(Exception e) {} System.out.println("inside static block");}
	
    public static void method() throws FileNotFoundException {  
    	System.out.println("method fun starting...");
    	//throw new ArithmeticException();
        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
        BufferedReader fileInput = new BufferedReader(file);        
        //throw new FileNotFoundException();        
    } 
	
	public static void f1() {
		int i=3;
		if(i==3) {
			throw new ArithmeticException("...............ArithmeticException handled...............");
		}else {
			System.out.println("f1 else worked");
		}
	}
	
	public static void f2 () throws ArithmeticException {
		int i=3/0;
		System.out.println("try of  f2() throws ArithmeticException");
	}
	
	public static void main(String[] args) {
		System.out.println("starting of the code...");
/*		try {
			f1();
		}catch (ArithmeticException e) {
			System.out.println("catch of  f1() throw ArithmeticException");
		}
		try {
			//System.out.println("trytrytry");
			f2();
			//System.out.println("catchcatch");
		}catch (ArithmeticException e) {
			System.out.println("catch of  f2() throws ArithmeticException");
		}
		//f2();  //this will through exception if exception raised and not written inside try catch block
*/		//int u=8/0;   //finally will not work in this situation
        try  
        {  
            //return ;        //only finally block still will run after this return stmt in try.
        	method();  
        }   
        catch (FileNotFoundException e)   
        {  
            
        	System.out.println("inside catch...");
        	//return ;       //only finally block still will run after this return stmt in catch.
        	//e.printStackTrace();  
        }  
        finally {
			System.out.println("inside finally...");
		}
        
        System.out.println("rest of the code...");  
        
	}

}
