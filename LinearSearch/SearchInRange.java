public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = {2,43,65,8,12,9,45,23,-1};
        int target = 12;
        int ans = Range(arr,1,6,target);
        System.out.println("The index of target is : " +ans);

    }
    static int Range(int arr[], int start, int end, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i =start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;

    }

}
