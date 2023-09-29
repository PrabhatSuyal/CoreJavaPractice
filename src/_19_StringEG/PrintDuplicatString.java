package _19_StringEG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicatString {

	public static void main(String[] args) {
		
		String string = "de gt ff gt de de ff hy bn df";
		List<String> strList = new ArrayList<String>(Arrays.asList(string.split(" ")));
		int index=0;
		String newString = "";
		
		for (int i = 0; i < strList.size()-1; i++) {
			
			for (int j = i+1; j < strList.size(); j++) {
				if (strList.get(i).contains(strList.get(j)) && !newString.contains(strList.get(i)) ) {
					newString = newString + strList.get(i)+ " ";
				}
			}
			
		}
		System.out.println(newString.trim());

	}

}
