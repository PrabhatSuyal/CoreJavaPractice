package Multithreading;

import java.util.concurrent.TimeUnit;

class Table  
{      
 void printTable(int n){    
   synchronized(this){											//synchronized block with lock on this object   
     for(int i=1;i<=5;i++){    
      System.out.print(n*i+">>");    
      try{    
       Thread.sleep(400);    
      }catch(Exception e){System.out.println(e);}    
     }    
   }    
 }//end of the method    
}   

		class Table2  
		{      
		 void printTable(int n){    
		      
		     for(int i=1;i<=5;i++){    
		      System.out.print(n*i+">>");    
		      try{    
		       //Thread.sleep(400);    
		      }catch(Exception e){System.out.println(e);}    
		     }    
		       System.out.println();
		 }
		}   
    
class MyThread1 extends Thread{    
Table t;    
MyThread1(Table t){
this.t=t;    
}    
public void run(){    
t.printTable(5);    
}    
    
}    
class MyThread2 extends Thread{    
Table2 t;    
MyThread2(Table2 t){    
this.t=t;    
}    
public void run(){    
t.printTable(100);    
}    
}    
    
public class SyncronizedBlockEG1{    
public static void main(String args[]){    
Table obj = new Table();//only one object    
MyThread1 t1=new MyThread1(obj);    
MyThread1 t2=new MyThread1(obj);    
t1.start();    
t2.start();    

Table2 table2A = new Table2();
Table2 table2B = new Table2();
Integer i=4, j=4;
/*
synchronized (table2A) {									// this block is not working as synchronized manner
	MyThread2 t3=new MyThread2(table2A);    
	MyThread2 t4=new MyThread2(table2A);
	t3.start();
	t4.start();
	try {
		TimeUnit.SECONDS.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("___________________________");
	MyThread2 t5=new MyThread2(table2B);    
	MyThread2 t6=new MyThread2(table2B); 
	t5.start();
	t6.start();
}
*/

}    
} 