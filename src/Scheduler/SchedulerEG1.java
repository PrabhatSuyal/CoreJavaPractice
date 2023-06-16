package Scheduler;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class SchedulerEG1 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask customTimerTask1 = new CustomTimerTask1();
		//CustomThread1 customThread1 = new CustomThread1();			//timer.scheduleAtFixedRate() is compatible with TimerTask
		timer.scheduleAtFixedRate(customTimerTask1, 0, 2000);

	}

}

class CustomTimerTask1 extends TimerTask{

	public static int count=0;
	@Override
	public void run() {
		count++;
		System.out.println(this.getClass().getName()+" >> "+"task count "+count+" is inprogress at time "+(new Date()));
		if (count==7) {	 	System.exit(0);		}
	}
	
}

class CustomThread1 implements Runnable{
	
	public static int count=0;
	@Override
	public void run() {
		count++;
		System.out.println(this.getClass().getName()+" >> "+"task count "+count+" is inprogress at time "+(new Date()));
		if (count==7) {	 	System.exit(0);		}
	}
	
}