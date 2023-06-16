package numbers;

public class HummingNumbers {
/*
 27. Write a Java program to create the first twenty Hamming numbers. Go to the editor
In computer science, regular numbers are often called Hamming numbers, Hamming Numbers are numbers whose only prime factors are 2, 3 and 5.
The first few hamming numbers are :
1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18, 20, 24, 25, 27, 30, 32

Expected Output
First Twenty Hamming numbers: 1 2 3 4 5 6 8 9 10 12 15 16 18 20 24 25 27
 30 32 36\
 
 */
	public static void main(String[] args) {
		
		int max=30;
		for(int i=3; i<=30; i++) {
			boolean hamming=false;
			/*if(i%2==0 || i%3==0 || i%5==0) {
				System.out.println(i);
			}*/
			for(int j=i-1; j>1; j--) {
				if(i%j==0) {
					if(j!=2 && j!=3 && j!=5) {
						hamming=false;
						break;
					}else if(j==2 || j==3 || j==5) {
						hamming=true;
						break;
					}
				}
			}
			if(hamming==true) {
				System.out.println(i);				
			}
		}
		
	}

}
