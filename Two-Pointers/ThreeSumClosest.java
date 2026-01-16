import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        int target = 1;

        int result = threeSumClosest(arr, target);
        System.out.println(result);
    }

    public static int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);

        int closestSum = arr[0] + arr[1] + arr[2];
        int minDiff = Math.abs(closestSum - target);

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                int diff = Math.abs(sum - target);

                if (diff < minDiff) {
                    minDiff = diff;
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }
}
