package numbers;

public class PellSeries {
/*
 25. Write a Java program to print the first 15 numbers of the Pell series. Go to the editor
In mathematics, the Pell numbers are an infinite sequence of integers. The sequence of Pell numbers starts with 0 and 1, and then each Pell number is the sum of twice the previous Pell number and the Pell number before that.:
thus, 70 is the companion to 29, and 70 = 2 × 29 + 12 = 58 + 12.
The first few terms of the sequence are :
0, 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860,…

Expected Output
First 20 Pell numbers:                                                  
1 2 5 12 29 70 169 408 985 2378 5741 13860 33461 80782 195025 470832 113
6689 2744210 6625109 15994428
 */
	public static void main(String[] args) {
		
		int len=20, a=0, b=1, now;
		for(int i=3; i<=20; i++) {
			now=2*b+a;
			System.out.println(now);
			a=b; b=now;
		}
		
	}

}
