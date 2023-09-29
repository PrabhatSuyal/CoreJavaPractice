package _19_StringEG;

public class StringEG1 {
	
		public static void main(String[] args) {
			
			//...................String Concatenation...................
			//System.out.println("aaa '+' bbb" + (5-2) + "ccc");
			//"aaa".concat("bbb");
			//StringBuilder str = new StringBuilder();   str.append("aaa"); System.out.println(str);
			//StringBuffer str = new StringBuffer();    str.append("aaa"); System.out.println(str);
			
			//...................convert char to string...................
			/*char ch1='c';
			String str1 = Character.toString(ch1) ; //Method1
			String str2 = str1 + ch1 ; //Method2
			String str3 = String.valueOf(ch1) ; //Method3
			*/ //System.out.println(str3);
			
			//...................Add char to string...................
			//Method1 : str.substring(0, index) + c + str.substring(index);
			//Method2 : StringBuffer stringBuffer = new StringBuffer(str);	String str = stringBuffer.insert(position, char).toString();
			
			//...................string to float...................
			//Method1 : float floatValue = Float.parseFloat(str);
			//Method2 : float floatValue = Float.valueOf(str);
			
			//...................String Interpolation( characters are replaced with the variables )...................
			//Method1 : System.out.println(String.format("%s is the best platform to learn %s .", str1, str2));
			//Method2 : System.out.println(MessageFormat.format("{0} is a government of the {1}, for the {1} and by the {1}.", a, b));
			//Method3 : new StringBuilder(str1).append(" is the best portal to learn ").append(str2).append("."));
			
			//...................next line...................
			//System.out.println();
			//System.out.println("GFG" + '\n' + "gfg");
			//System.out.println("GFG" + System.lineSeparator() + "gfg");
			
			//...................string into an Array of Strings...................
			//"geeks for geeks".split(" ")
			
			//...................iterate the char of string...................
			//str.charAt(i)
			//String[] substrings = str.split("");
			//str.toCharArray();
			/*StringTokenizer st = new StringTokenizer(str, "", false);
			while (st.hasMoreTokens()) {st.nextToken());}
			*/
			//Queue<Character> Q = new LinkedList<Character>(); Q.add(str.charAt(i)); Q.peek(); Q.remove();
			/* Creating a CharacterIterator variable        CharacterIterator itr = new StringCharacterIterator(str);
			while (itr.current() != CharacterIterator.DONE) { itr.current(); itr.next(); }
			*/
			
			//...................Print Quotation Marks in a String...................
			//Method1 : String str = " \"Akshit Loves GeeksforGeeks\" "; //using Escape Sequence character
			//Method2 : char value = '"';   String str  = value + "Akshit Loves GeeksforGeeks" + value;
			//Method3 : String str = '\u0022' + "Akshit Loves GeeksforGeeks" + '\u0022';
			
			//...................String to integer...................
//			int ii = Integer.valueOf("64"); System.out.println(ii);
//			int ij = Integer.parseInt("647"); System.out.println(ij);

			//...................integer to String...................


			//...................Check Whether the String Consists of Special Characters...................
			//if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)))
			//System.out.println("sdfg%ytr".contains("%"));
			//System.out.println(Pattern.matches("[%]", "sdfg%ytr"));
			
			//...................String to byte Array...................
			//System.out.println("Byte Array:" + Arrays.toString("azAZ".getBytes())); // can be used as ascii((int)'a') values
			
			//...................Convert String to Boolean...................
			//boolean b1 = Boolean.parseBoolean(str);
			//boolean b1 = Boolean.valueOf(str);
			
			//...................Convert a Float value to String...................
			//String stringValue = "" + floatValue;
			//String.valueOf(floatValue);
			//Float.toString(floatValue);
			
			//...................String value to Float value...................
			//Float.parseFloat(str);
			//Float.valueOf(str);
			
			//...................Array to String...................
			//Arrays.toString(objArr)    //[1.0, 2.0, 3.0, 4.0]
			//StringBuilder sbf = new StringBuilder;     sbf.append(chararray);
			
			//...................join using delimiter \ List of String to a comma separated String...................
			//System.out.println(String.join("-", new ArrayList(Arrays.asList("Geeks","ForGeeks","GeeksForGeeks"))));
			
			//...................Remove a given word from a String...................
			//"aa bb aa zz".replace("aa", "zz")
			//System.out.println("aa bb aa zz".replace("bb", "gg"));
			
			//reverse a string
//			StringBuffer strbuf = new StringBuffer(str1);     strbuf=strbuf.reverse();		
//			StringBuilder strbld = new StringBuilder(str1);   strbld.reverse();
			//using substring and CharAt()
			//using recursion method
			
			
			
			
		}

	}
