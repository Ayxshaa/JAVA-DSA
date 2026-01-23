public class maxSubarraySum {
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        int k =2;
        int low = 0;
        int high = k - 1;
        int sum = 0;
        int result = Integer.MIN_VALUE;
        int n = arr.length;

        // first window sum
        for (int i = low; i <= high; i++) {
            sum += arr[i];
        }

        // sliding window
        while (high < n) {
            result = Math.max(result, sum);

            low++;
            high++;

            if (high == n) break;

            sum = sum - arr[low - 1]; // remove left element
            sum = sum + arr[high];   // add right element
        }

        System.out.println(result);
    }
}
