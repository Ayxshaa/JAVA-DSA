import java.util.Arrays;

public class ConcatinationOFArray {
    public static void main(String[] args) {
     int nums[] = {1,2,3};
     int ans[] = getConcatenation(nums);

        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenation(int nums[]) {
        int digits = 0;

        for (int i = 0; i < nums.length; i++) {
            digits++;
        }
        int size = digits * 2;
        int arr[] = new int[size];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[j] = nums[i];
            j++;

        }

        for (int i = 0; i < nums.length; i++) {
            arr[j] = nums[i];
            j++;
        }
        return arr;

}
}
