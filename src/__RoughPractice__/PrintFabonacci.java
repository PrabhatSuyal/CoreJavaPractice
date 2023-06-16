package __RoughPractice__;

public class PrintFabonacci {

	public static void main(String[] args) {
		int upto=50, i=1, j=1, temp=0, count=1;
		
		System.out.println(i);
		System.out.println(j);
		while (count<=10) {
			temp = i+j;
			System.out.println(temp);
			i=j;
			j=temp;
			count++;
		}
		

	}

}
