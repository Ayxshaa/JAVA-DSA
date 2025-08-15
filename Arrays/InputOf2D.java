import java.util.Arrays;
import java.util.Scanner;

public class InputOf2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// **************input***************
        int[][] arr = new int[3][3];
        for (int i =0; i< arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                arr[i][j] = input.nextInt();
            }
        }
        // output
        //****1st***********//        for (int i =0; i< arr.length; i++){
//            for(int j =0; j< arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
        //*******2nd********//
//        for(int i=0; i<arr.length; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }
        //-> or Echanced for loop!
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
