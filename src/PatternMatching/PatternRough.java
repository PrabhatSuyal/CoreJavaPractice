package PatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRough {

	public static void main(String[] args) {
		
		// Compile regular expression
        final Pattern pattern = Pattern.compile("2020-03-12T13:34:56\\.123Z INFO  \\[org\\.example\\.Class]: This is a #simple #logline containing a 'value'\\.", Pattern.CASE_INSENSITIVE);
        // Match regex against input
        final Matcher matcher = pattern.matcher("aammmsa");
        // Use results...
        //System.out.println(matcher.matches());
        
        System.out.println("\"[amn]\", \"a\"    "+Pattern.matches("[amn]", "a"));//true
        System.out.println("\"[amn]+\", \"am\"    "+Pattern.matches("[amn]+", "am"));//false
        System.out.println("\"[amn]\", \"a\"    "+Pattern.matches("[amn][a-z]", "as"));//all true : "[amn][s]", "[amn].", "[amn][a-z]"
        
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JJ2Uk2"));//true  
        System.out.println(Pattern.matches("[a-z]+", "amn"));//false (m and a comes more than once) 
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
        
        System.out.println("wertr".matches("^[\\w]+$"));//only a certain set of characters (in this case a-z, A-Z and 0-9)
        System.out.println("prr".matches("pq*?"));//matches a string that has a p followed by zero or more q's.((validate("pqq"))true)
        
        System.out.println("java_exercises : "+"java_exercises".matches("^[a-z]+_[a-z]+$"));//
        System.out.println("^ 1java_exercises : "+"1java_exercises".matches("^[a-z]+_[a-z]+$"));//
        System.out.println("j1ava_exercises : "+"1java_exercises".matches("[a-z]+_[a-z]+$"));//
        System.out.println("java_exercises3 $: "+"java_exercises3".matches("^[a-z]+_[a-z]+$"));//
        System.out.println("java_exercises3 : "+"java_exercises3".matches("^[a-z]+_[a-z]+"));//
        
        System.out.println("one upper case letter followed by lower case letters. : JAava : "+"JAava".matches("[A-Z][a-z]+$"));//
        System.out.println("has a 'p' followed by anything, ending in 'q' : "+"pwer345q".matches("p.*?q$"));//
        System.out.println("character 'g' in a given string."+Pattern.compile("\\w*g.\\w*").matcher("assd g."));//
        System.out.println("lowerUPPER : "+"aaBbcCDD".replaceAll("[A-Z]*", "")+"aaBbcCDD".replaceAll("[a-z]*", ""));//
        
	}

}
