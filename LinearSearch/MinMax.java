public class MinMax {
    public static void main(String[] args) {
        int arr[] = {23,53,-1,43,65,87,0};
        int ans = Max(arr);
        System.out.println("MAxium is : "+ans);
        System.out.println("Minimum is : "+Min(arr));

    }
    static int Max(int arr[]){
        int max = arr[0];
        if(arr.length == 0){
            return -1;
        }
        for(int i =1; i<arr.length; i++){

            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int Min(int arr[]){
        if(arr.length == 0){
            return -1;
        }
        int min = arr[0];
        for(int i =1; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
