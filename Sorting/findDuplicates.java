import java.util.ArrayList;
import java.util.List;

public class findDuplicates {
    public static void main(String[] args) {
        int nums[] = {4, 3, 2, 7, 8, 2, 3, 1};

        // Create object because findDuplicates is non-static
        findDuplicates obj = new findDuplicates();
        ArrayList<Integer> a = new ArrayList<>(obj.findDuplicates(nums));

        System.out.println(a); // Output: [2, 3]
    }

    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    void swap(int arr[], int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
