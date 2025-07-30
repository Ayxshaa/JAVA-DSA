public class SearchRotatedArray {
    public static void main(String[] args) {
           int nums[] = {1,2,3,4};
    }

    static int search(int nums[],int target){
        int pivot = findPivot(nums);
        // if u not find the pivot, means array is not rotated!
        if(pivot == -1){
            // just do binary search
            return BS(nums,target,0,nums.length-1);
        }

        // if pivot is found thn u have found 2 asc arrays

        if(nums[pivot] == target){
            return pivot;
        }
        if(target>=nums[0]){
            return BS(nums,target,0,pivot-1);
        }
        else{
            return BS(nums,target,pivot+1,nums.length-1);
        }

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
    static int BS(int arr[],int target,int start,int end){
        while(start<=end) {
            //    int mid = (start+end)/2 -> now bcz of this the error can occur in which might be possible that (start+end) exeeds the range of integer in java
            //better way to find the mid!
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
