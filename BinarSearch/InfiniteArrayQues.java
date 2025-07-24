public class InfiniteArrayQues {
    public static void main(String[] args) {
        int nums[] = {2,3,5,6,7,8,9,10,12,15,16,20,23,30};
        int target = 15;
        int ans = findingRange(nums,target);
        System.out.println(ans);

    }

    static int findingRange(int nums[], int target){
        // first find the range
        // first start with the box size of 2;
        int start = 0;
        int end = 1;

        while(target>nums[end]){
            int newStart = end+1;
            // double the box value!
            // end = previous end + sizeofchunk *  2
             end = end + (end-start+1 ) * 2;
             //why we are taking a new start is bcz we want the old start in the end to calculate it!
             start = newStart;

        }
        return infinite(nums,target,start,end);
    }
    static int infinite(int nums[],int target,int start, int end){
        while(start<=end) {
                //    int mid = (start+end)/2 -> now bcz of this the error can occur in which might be possible that (start+end) exeeds the range of integer in java
                //better way to find the mid!
                int mid = start + (end - start) / 2;
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

       return -1;
    }
}
