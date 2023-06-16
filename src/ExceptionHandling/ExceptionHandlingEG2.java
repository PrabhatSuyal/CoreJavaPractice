package ExceptionHandling;

import java.io.IOException;

class ExceptionHandlingEG2 {
  
    // exception propagated to n()
    void m() throws IOException
    {
    	throw new IOException("device error");             //Unhandled exception type IOException
        //throws is required in signature for checked exc
    	//throw new ArithmeticException("device error");   //throws is not required in signature for AExc or unchecked exc
    }
  
    // exception propagated to p()
    void n() throws IOException
    {
        m();
    }
    void p()
    {
        try {  
            // exception handled
            n();
        }
        catch (Exception e) {
            System.out.println("exception handled : "+e.getMessage());
        }
    }
  
    public static void main(String args[])
    {
    	ExceptionHandlingEG2 obj = new ExceptionHandlingEG2();
        obj.p();
        System.out.println("normal flow...");
    }
}