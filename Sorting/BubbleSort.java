import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3,1,5,4,2};
        BS(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BS(int arr[]){
        boolean swapped;
        for(int i =0; i< arr.length; i++){
            swapped = false;
            for(int j =1; j< arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            // if u didn't swap for any particular of i! it means the array is sorted thn
            // break the program
            if(!swapped){ //!false = true
                break;
            }
        }
    }
}
