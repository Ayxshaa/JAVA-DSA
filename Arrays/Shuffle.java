public class Shuffle {
    public static void main(String[] args) {
        int nums[] = {2,5,1,3,4,7};
        int n = 3;
        int t =0;
        int temp;

        for(int i =1; i<nums.length; i++){
            t++;
        }
        t--;
        for(int i =1; i<nums.length; i++){
           temp = nums[i];
           nums[i] = nums[t];
           nums[t] = temp;
       }
       for(int j =0; j<nums.length; j++){
           System.out.println(nums[j]);
       }
    }
}
