import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {-1,0,-12,13};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int arr[]){
            for(int i =0; i<arr.length-1; i++){
                for(int j = i+1; j>0; j--){
                    if(arr[j-1]>arr[j]){
                        swap(arr,j-1,j);
                    }
                    else{
                        break;
                    }
                }
            }
    }
    static void swap(int arr[], int first,int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
