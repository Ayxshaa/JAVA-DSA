public class FindMaxConsecutives {
    public static void main(String[] args) {
        int nums[] = {1, 1, 0, 1, 1, 1};
        int max = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                // When a 0 is encountered, check if the current count is the max and reset count
                max = Math.max(max, count);
                count = 0;
            }
        }

        // In case the array ends with a sequence of 1's, check the final count
        max = Math.max(max, count);

        System.out.println(max);
    }
}
