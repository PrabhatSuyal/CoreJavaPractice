package _14_datetime;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		int yr1=2010, yr2=2022;
		for(int count=yr1 ; count<=yr2; count++) {
			if(count%400==0) {
				System.out.println(count+" is a leap year");
			}else if(count%100==0) {
				System.out.println(count +" is not a leap year");
			}else if(count%4==0) {
				System.out.println(count+" is a leap year.");
			}else {
				System.out.println(count + " is not a leap year");
			}
			//is_Leap_Year(count);
			//Calendar
		}
		
	}

}
