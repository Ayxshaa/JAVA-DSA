public class MounTainHard {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 4, 2, 1};
        int ans = findInMountainArray(arr, 2);
        System.out.println(ans);
    }

    static int findInMountainArray(int arr[], int target) {
        int peak = Peak(arr);
        int first = OABS(arr, target,0,peak);
        if(first!=-1){
            return first;
        }
        return OABS(arr,target,peak+1,arr.length-1);
    }

    static int Peak(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    static int OABS(int arr[],int target,int start,int end){

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
        return -1;
    }
}
