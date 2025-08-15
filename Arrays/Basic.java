import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        int[] ro = new int[5];

        // lets dive into it!
        int [] ros2; // decleration of array! ros is getting defined in the stack!
        ros2 = new int[5]; //initialization :  actually here object is being created in the memory (heap)

        //System.out.println(ros2);

        //****************String Array*******************//
           // the refernce var have null value is by default is NULL if its not initialize!
        String arr[] = new String[4];
        //System.out.println(arr); // [Ljava.lang.String;@37a71e93
       // System.out.println(arr[0]); //null
        //String str = null; // possible
      //  int a = null; // will give an error incompatible types: <nulltype> cannot be converted to int
        System.out.println(arr.length);
     }
}
