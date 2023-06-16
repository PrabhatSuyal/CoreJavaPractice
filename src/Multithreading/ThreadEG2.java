package Multithreading;

import java.util.concurrent.TimeUnit;

public class ThreadEG2 {

	public static void main(String[] args) {
		CustomThread1 thread1 = new CustomThread1();
		CustomThread1 thread2 = new CustomThread1();
		
		thread1.start();
		thread2.start();		
		
	}

}

class CustomThread1 extends Thread{
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Task1.task1Fun1(this.getName());
		}
	}
}

class Task1{
	public static int count=0;
	public static synchronized void task1Fun1(String string) {					// synchronized print count in sequence
		count++;
		System.out.println("running Task : "+count+" ; name : "+string);
	}
}