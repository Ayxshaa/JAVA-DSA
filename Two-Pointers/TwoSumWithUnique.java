import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumWithUnique {
    public static void main(String[] args) {
        int target = 4;
        int arr[] = {1,1,1,2,2,3,3,3};

        int[] resultArray = createArray(arr, target);
        System.out.println("Returned Array: " + Arrays.toString(resultArray));


    }
    public static int[] createArray(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int left =0; left<arr.length; left++ ){
            for (int right = arr.length - 1; right > left; right--){
                if(arr[left] + arr[right] == target){
                    result.add(arr[left]);
                    result.add(arr[right]);

                    left++;
                    right--;

                    while(arr[left] == arr[left-1]){
                        left++;
                    }
                    while(arr[right] == arr[right+1]){
                        right--;
                    }
                } else if (arr[left] + arr[right] < target) {
                    left++;
                }
                else{
                    right--;
                }
            }

        }
        return result.stream().mapToInt(i -> i).toArray();
    }

}
