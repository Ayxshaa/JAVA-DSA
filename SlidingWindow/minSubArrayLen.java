public class minSubArrayLen {
    public static void main(String[] args) {
        int nums[] = {2,3,1,2,4,3};
        int target = 7;
        int low = 0, high = 0;
        int sum = 0;
        int n = nums.length;
        int result = Integer.MAX_VALUE;

        while (high < n) {
            sum += nums[high];

            while (sum >= target) {
                int len = high - low + 1;
                result = Math.min(result, len);
                sum -= nums[low];
                low++;
            }

            high++;
        }

        System.out.println(result);
    }
}
