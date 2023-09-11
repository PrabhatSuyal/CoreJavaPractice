package __RoughPractice__.HackerEarthPractice;

import java.util.Arrays;

class Solution {
    public static void solution1(int[] A, int K) {
        // Implement your solution here

        int rows = (A.length%K == 0 ? A.length/K : A.length/K + 1);
        int lines = 2* rows +1 ;
        int max = String.valueOf(Arrays.stream(A).max().getAsInt()).length();
        String format1 = "";
        for(int i=0; i<max; i++){
            format1=format1+"-";
        }

        String line1 = "+";
        for(int i=0; i<K; i++){
            line1=line1 + format1 + "+";
        }
        System.out.println(line1);

        String lastline = "+";
        int lastrowcounts = A.length%K;
        for(int i=0; i<lastrowcounts; i++){
            lastline=lastline + format1 + "+";
        }


        int index=0;
        int count=1;
        for(int i=0; i<rows ; i++){

            String currentrowStr = "|";
            while ( count <= K ){
                // space add
                int currentSpaceCount = max - String.valueOf(A[index]).length();
                String currentSpace = "";
                    for (int k=0; k<currentSpaceCount; k++){    currentSpace += currentSpace + " ";}
                currentrowStr = currentrowStr + currentSpace + String.valueOf(A[index]) + "|";
                index++;
                count++;
            }

            System.out.println(currentrowStr);
            if (i!=rows-1)System.out.println(line1);


        }
        System.out.println(lastline);

    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.solution(new int[]{3, 2, 32425, 4}, 3);
    }

    public void solution(int[] A, int K) {
        int rows = (int) Math.ceil((double) A.length / K); // Calculate the number of rows

        int maxLength = 0; // Find the maximum number of digits in the array
        for (int num : A) {
            int length = String.valueOf(num).length();
            maxLength = Math.max(maxLength, length);
        }

        int cellWidth = maxLength + 2; // Calculate the width of each cell

        printHorizontalLine(cellWidth, K); // Print the top horizontal line

        for (int i = 0; i < A.length; i += K) {
            int remaining = Math.min(K, A.length - i); // Number of elements in the current row
            printRow(A, i, remaining, maxLength, cellWidth); // Print the current row

            if (i + K >= A.length) {
                break; // Skip printing the horizontal line for the last row with blank cells
            }

            printHorizontalLine(cellWidth, K); // Print the horizontal line after each row
        }
    }

    private void printHorizontalLine(int cellWidth, int K) {
        StringBuilder sb = new StringBuilder();
        sb.append("+");
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < cellWidth; j++) {
                if (i > 0 && j == 0) {
                    sb.append("|"); // Print vertical line instead of dash inside the table
                } else {
                    sb.append("-");
                }
            }
            sb.append("+");
        }
        System.out.println(sb.toString());
    }

    private void printRow(int[] A, int startIndex, int count, int maxLength, int cellWidth) {
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        for (int i = startIndex; i < startIndex + count; i++) {
            String numStr = String.valueOf(A[i]);
            int padding = maxLength - numStr.length();
            sb.append(" ");
            for (int j = 0; j < padding; j++) {
                sb.append(" ");
            }
            sb.append(numStr);
            sb.append(" |");
        }
        System.out.println(sb.toString());
    }
}
