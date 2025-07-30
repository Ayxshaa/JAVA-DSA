public class CountRotation {
    public static void main(String[] args) {
  int nums[] = {4,5,6,7,0,1,2};
  int ans = rotation(nums);
        System.out.println(ans);
    }



    static int rotation(int nums[]){
        int count =0;
        int p = findPivot(nums);
        int start = 0;
        int end = nums.length-1;
        if(nums[p]>nums[p+1]){
            end = p;
            while (start<=end){
                count ++;
                start++;
            }
            return count;
        }
  return -1;

    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            // 4 cases over here~

            if(mid <end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            // if elements at middle, start and end are equal thn just skip the duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // Check if start + 1 is within bounds
                if (start + 1 < nums.length && nums[start] > nums[start + 1]) return start;
                // Check if end - 1 is within bounds
                if (end - 1 >= 0 && nums[end] < nums[end - 1]) return end - 1;
                start++;
                end--;
            }

            else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid]> nums[end]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
