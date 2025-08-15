public class SetMisMatch {
    public static void main(String[] args) {

    }
    static int[] findErrorNums(int[] nums) {
        int i =0;
        while (i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for(int index = 0; index< nums.length; index++){
            if(nums[index] != index+1){
                return new int[]{nums[index], index+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int arr[], int first,int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
    }

