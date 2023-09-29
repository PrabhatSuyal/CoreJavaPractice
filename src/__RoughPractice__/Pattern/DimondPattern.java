package __RoughPractice__.Pattern;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class DimondPattern {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");

        int size = 7;

        for(int i=1;i<=(size+1)/2;i++){
            for(int j=1;j<=(size-(2*i-1))/2;j++){

                System.out.print(" ");

            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            for(int jj=1;jj<=(size-(2*i-1))/2;jj++){

                System.out.print(" ");

            }
            System.out.println();
        }



        for(int l=1;l<=(size-1)/2;l++){
            for(int m=1;m<=l;m++){
                System.out.print(" ");
            }
            for(int n=(size-(2*l));n>=1;n--){
                System.out.print("*");
            }
            for(int mm=1;mm<=l;mm++){
                System.out.print(" ");
            }

            System.out.println();
        }

        /*for(int i=1;i<=size;i++){
            for(int j=1;j<=(size-i)/2;j++){

                System.out.print("_");

            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int jj=1;jj<=(size-i)/2;jj++){

                System.out.print("_");

            }

            System.out.println();
        }*/
    }
}
