package __RoughPractice__;

import java.util.HashMap;
import java.util.Map;

//import org.apache.commons.collections4.map.HashedMap;

public class OccuranceOfCharInString {

	public static void main(String[] args) {
		
		String str = "saderdffgjsfascfe";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			int count=0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			map.put(str.charAt(i), count);
//			System.out.println(" char "+str.charAt(i)+" occures "+count+" times");
		}
		System.out.println(map);
		
	}

}
