package _28_PatternMatching;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternMatchingEG1 {
    
    public static void main(String[] args) {
    	String data = "This is a test String and 'This is data we want'";
    	Pattern pattern = Pattern.compile("'(.*?)'");
    	Matcher matcher = pattern.matcher(data);
    	System.out.println(matcher.matches());
    	System.out.println(matcher.find());
    	
    	System.out.println("5 alphanumeric match : "+ Pattern.matches("[a-zA-Z0-9]{5}", "a7tgr"));
    	System.out.println("10 digit starting with 1, 2 or 3 only : "+Pattern.matches("[123][0-9]{9}", "1762345698"));
    	System.out.println("removing more then 1 space : "+Pattern.compile("\\s{2,}").matcher("  dsre   ").find());
    	System.out.println("  ds r  e   ".replaceAll("\\s{2,}", "*"));
    	System.out.println("8".matches(".?|(..+?)\\1+"));
    	
	}
}