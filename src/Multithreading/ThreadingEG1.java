package Multithreading;

import java.security.PublicKey;

import MathEG.Count_nums_not_7;

public class ThreadingEG1 {
	
	public static int count = 0;

	public static void main(String[] args) {
		
		
		CustomThreadRun1 runobj1= new CustomThreadRun1();
		Thread t1 = new Thread(runobj1);
		Thread t2 = new Thread("threadname2");
		CustomThread11 t3 = new CustomThread11("thread3");
		Thread t4 = new Thread(runobj1);
		//t1.run();                           //run() can work before start()
		//t1.sleep(4444);                     //Unhandled exception type InterruptedException
//		t1.start();
//		t2.start();
//		t3.start();
		t1.setName("Thname1");
//		System.out.println(t3.getName());
		System.out.println("run() will execute just after thread starts.");
		
		for (int i = 0; i < 3; i++) {
			t1.run();
			t2.run();
			t3.run();
			t4.run();
		}
		
	}
	
	
	static synchronized void fun1(String string) {
		System.out.println("time : "+System.currentTimeMillis()+" thread name : "+string);
	}
	
}

class CustomThreadRun1 implements Runnable {
	public void run() {
//		System.out.println("thread is running......");
		ThreadingEG1.fun1(this.name);
		System.out.println(volVar++);
	}
	String name;
	static volatile int volVar = 2;			// value will be read in sync manner
	
}

class CustomThread11 extends Thread{
	CustomThread11(String string){
//		System.out.println("CustomThread1 > cunstructor");
		this.setName(string);
	}
	@Override
	public void run() {
		ThreadingEG1.fun1(this.getName());
	}
	
}
