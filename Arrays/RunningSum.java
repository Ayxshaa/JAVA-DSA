import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int ans[] = sum(nums);
        System.out.println(Arrays.toString(ans));

    }

    static int[] sum(int nums[]){
        int size = nums.length;
        System.out.println(size);
        int runningSum[] = new int[size];
        int j =0,sum =0;
        for(int i =0; i<nums.length; i++){
            sum = sum + nums[i];
            runningSum[j] = sum;
            j++;
        }
        return runningSum;

    }

}


