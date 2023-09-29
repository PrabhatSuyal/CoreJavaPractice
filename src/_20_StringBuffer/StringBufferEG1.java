package _20_StringBuffer;

public class StringBufferEG1 {
    public static void main(String[] args) {

        final String str1 = new String("abc");
        final StringBuffer strbfr = new StringBuffer("ABC");

        str1.concat("def");         // value of final String didn't change
        strbfr.append("DEF");           // value of final string buffer got changed bcoz ?

        System.out.println(str1+"___"+strbfr);


    }
}
