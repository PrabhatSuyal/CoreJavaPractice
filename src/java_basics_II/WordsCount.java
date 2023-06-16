package java_basics_II;

public class WordsCount {

	public static void main(String[] args) {
		
		String str="aa bb aa ccc aa aa";
		String[] strarr=str.split(" ");
		int maxfq=0, maxlen=0;
		
		for(int i=0; i<strarr.length; i++) {
			
			if(maxlen<strarr[i].length()) { maxlen = strarr[i].length(); }
			
			int strnowcount=0;
			for(int j=i; j<strarr.length; j++) {
				
				if(strarr[i].equals(strarr[j])) { strnowcount++;  }
				
			}
			
			if(maxfq<strnowcount) { maxfq=strnowcount; }
			
		}
		System.out.println("maxfre is : "+maxfq+" and maxlen is : "+maxlen);
	}

}
