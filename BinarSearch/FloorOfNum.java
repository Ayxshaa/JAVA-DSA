public class FloorOfNum{
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = OABS(arr,target);
        System.out.println(ans);

    }
    // return the index : Greatest Number <= Target
    static int OABS(int arr[],int target){
        int start = 0;
        int end = arr.length-1;


        boolean isAsc = arr[start]<arr[end];

        while(start<=end) {
            //    int mid = (start+end)/2 -> now bcz of this the error can occur in which might be possible that (start+end) exeeds the range of integer in java
            //better way to find the mid!
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return end;
    }
}
