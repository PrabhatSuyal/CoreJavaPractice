package __RoughPractice__.Pattern;

import java.util.Arrays;
import java.util.OptionalInt;

public class PrintStarVerticallyAsArrayValues {
    public static void main(String[] args) {

        int[] arr = {3,2,-1,0,3};
        int max = Arrays.stream(arr).max().getAsInt();

        for(int i=0; i<max; i++){

            arr = Arrays.stream(arr)
                    .map(a -> { if(a<=0) { System.out.print(" "); return 0;}
                    else { System.out.print("*") ; return a-1;}
                    })
                    .toArray();

            System.out.println();
        }


/*        int [] intarr = {5,0,-3,6,1};
        int row = Arrays.stream(intarr).max().getAsInt();
        int[] intarr2 = new int[intarr.length];

        for (int i=0; i<row; i++){
            Arrays.stream(intarr).forEach(a -> {
                if (a>0){System.out.print("*");}
                else {System.out.print(" ");}
            }
            );
            intarr = Arrays.stream(intarr).map(a ->
                    {
                        if (a!=0){a--;}
                        return a;
                    }
                    ).toArray();

            System.out.println();
        }
*/
    }
}
