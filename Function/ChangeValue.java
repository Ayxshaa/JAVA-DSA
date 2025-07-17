import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
         change(arr);
        //System.out.println(Arrays.toString(arr));
      int numbers[] = {19, 20};
      swap(numbers);
        System.out.println(Arrays.toString(numbers));
    }


    static void change(int nums[]){
        nums[0] = 23; // if u make a change to the object via this ref variable , same object will be changed
    }
    static void swap(int num[]){
        int temp = num[0];
        num[0] = num[1];
        num[1]=  temp;
    }


}
