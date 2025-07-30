public class SplitArray {
    public static void main(String[] args) {

    }
    static int split(int nums[], int m ){
   int start=0;
   int end = nums.length-1;

   for(int i =0; i<nums.length; i++){
       start = Math.max(start, nums[i]); // in the end of the looop it will contain max
       end = end + nums[i];
   }


   // binary search

        while (start<end){
               // try for the middle as potential ans
            int mid = start+(end-start)/2;

            // calculate how many pieces u can divide this in with max sum
            int sum =0;
            int pieces =1;

            for(int num : nums){
                if(sum + num> mid){
                    // u can not add this in subarray make new pne

                    sum = num;
                    pieces++;

                }
                else {
                    sum += num;
                }
            }
            if(pieces>m){
                start = mid+1;
            }
            else{
            end = mid;
            }
        }
        return end;
}
    }
