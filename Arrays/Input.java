import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// ARRAY OF PRIMITIVESSSSSSSSSSS!!!!!!!!!!!
        int arr[] = new int[3];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 5;
////      [2,4,5]
//        System.out.println(arr[2]);
//
//        for (int i = 0; i<arr.length; i++){
//          //  System.out.println("Enter elements");
//            arr[i] = input.nextInt();
//        }

//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }
 //***************For each******************//
//        for(int num : arr){ // for every element in array , print the element
//            System.out.print(num + " "); // here num represents element of the array
//        }
      //  System.out.println(arr[5]); // index out of bound error

        /********Simple way for it is Array.String***** its a method of array to print the values**/

       // System.out.println(Arrays.toString(arr));
        // Arrays have a method toString in which when u give an arr it will convert it into String!!
        // internally it using for loop!








        /*****ARRAY OF OBJECTS*******/

        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
             str[i] = input.next();
        }

        System.out.print(Arrays.toString(str));
    }

}
