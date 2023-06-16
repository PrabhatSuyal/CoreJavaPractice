package __RoughPractice__;

import java.util.Arrays;

public class findPairsHavingDifferenceK {

    public static void main(String[] args) {

        int[] intarr = {2, 4, 1, 3, 5, 3, 1};
        int k = 0;                                                                              // change this difference k
        String str = "";

        //Arrays.sort(intarr);
        //Arrays.stream(intarr).forEach(a -> System.out.print(a));


        for (int a = 0; a < intarr.length - 1; a++) {
            for (int b = a + 1; b < intarr.length; b++) {

                if (intarr[a] - intarr[b] == k || intarr[a] - intarr[b] == -k) {
                    String temp = String.valueOf(intarr[a])+","+String.valueOf(intarr[b]);
                    StringBuffer temp1 = new StringBuffer(temp);    temp1.reverse();
                    if(str.contains(temp) || str.contains(temp1)){

                    }else {
                        str=str+temp+"#";
                    }
                }

            }
        }

        String[] strarr = str.split("#");
        Arrays.stream(strarr).forEach(a -> System.out.println(a));



/*      //System.out.println("____________________________________");
        for (int a = 0; a < intarr.length - 1; a++) {

            for (int b = a + 1; b < intarr.length; b++) {

                if (intarr[a] == intarr[b]) {                                                   // this block is required if k is 0
                    if (a + 2 < intarr.length) {

                        if (intarr[a] == intarr[a + 2]) {                                       // to skip ArrayIndexOutOfBound Exception
                            break;
                        }
                        System.out.println("__"+intarr[a] + "," + intarr[b]);                        // to print if last 2 elements are
                        break;
                    } else if (intarr[a] - intarr[b] == k || intarr[a] - intarr[b] == -k) {
                        System.out.println(intarr[a] + "," + intarr[b]);
                    }
                } else if (intarr[a] - intarr[b] == k || intarr[a] - intarr[b] == -k) {         // normal case if k is not 0
                    System.out.println(intarr[a] + "," + intarr[b]);
                } else {
                    //System.out.println(intarr[a]+","+intarr[b]);
                }
            }
            //System.out.println(a);
        }
        //System.out.println("____________________________________");
*/

    }
}
