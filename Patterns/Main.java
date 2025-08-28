public class Main {
    public static void main(String[] args) {
//pattern2(4);
       // pattern1(5);
        //pattern3(5);
        pattern4(4);
    }
    static void pattern2(int n ){
        // take no. of rows as the np. of n is given
        for(int row = 1; row<=n; row++){
            // now indentify the no. of cols in each row
            for(int col =1; col<=row; col++){
                // identify what to print
                System.out.print("*");
            }
            // whn one row is printed, we need to add the new line
            System.out.println();
        }
    }
    static void pattern1(int n ){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        *
         *****
         *****
         *****
         *****
         *****
        *
        * */
    }
    static void pattern3(int n ){
        for(int row = n; row>=1 ; row--){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row =1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        /*
        *
1
12
123
1234
        *
        * */
    }
}
