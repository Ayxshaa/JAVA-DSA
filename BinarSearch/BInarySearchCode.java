public class BInarySearchCode {
    public static void main(String[] args) {
        int arr[] = {2,4,6,9,11,12,14,20,36,48};
        int target = 36;
        int ans = BS(arr,target);
        System.out.println(ans);

    }
    static int BS(int arr[],int target){
        int start = 0;
        int end = arr.length-1;

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
