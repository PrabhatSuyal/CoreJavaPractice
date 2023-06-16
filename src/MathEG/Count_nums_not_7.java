package MathEG;

public class Count_nums_not_7 {

	public static void main(String[] args) {
		
		int range = 30, count=0;
		for(int i=1; i<=range; i++) {
			if(!(Integer.toString(i).contains("7"))) {
				count++;
			}
		}
		System.out.println(count);
		float f = (float) 3.4;
		System.out.println((int)f);
	}

}
