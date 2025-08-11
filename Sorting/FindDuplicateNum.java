public class FindDuplicateNum {
    public static void main(String[] args) {
        int nums[] = {3,1,3,4,2};
        int a = findDuplicate(nums);
        System.out.println(a);
    }
   static public int findDuplicate(int[] nums) {
    int i =0;
        while (i<nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }
        return nums[nums.length-1];
}

static void swap(int arr[], int first,int sec){
    int temp = arr[first];
    arr[first] = arr[sec];
    arr[sec] = temp;
}

}
