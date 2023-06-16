package ExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandlingEG1 {

	public static void main(String[] args)  {
		
													//calling unchecked Exp need to add throws for compiler
		
		try {											// print the custom string using Cunstructor
			fun1();
			System.out.println("inside try 1."); 
			throw new IOException("custom string thrown inside try 1.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		try {											// run that catch block where that thrown Excep is parameterized
			System.out.println("inside try 2.");
			throw new ArrayIndexOutOfBoundsException("throw inside try 2");
		}
		//ArithmeticException
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch 1");
		}
		catch(ArithmeticException e) {
			System.out.println("catch 3");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("catch 2");
		}
		catch(Exception e) {
			System.out.println("catch 4");
		}
		
		
		try {										// custom Exception with/without custom String msg
			//throw new CustomException1();
			//throw new CustomException1(" cunstructor of CustomException1 with custom message.");
			throw new CustomException1(404,"page not found custom Msg");
		}catch (CustomException1 e) {
			System.out.println("error code = "+e.code+" and errorMsg : "+e.errorMsg);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static Exception fun1() throws IOException {
		throw new IOException("throws need add in fun() signature only if unchecked Exp thrown inside for compiler to handle.");		
	}

}
