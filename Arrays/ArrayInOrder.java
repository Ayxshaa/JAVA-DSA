//https://leetcode.com/problems/create-target-array-in-the-given-order/description/


import java.util.Arrays;

public class ArrayInOrder {
    public static void main(String[] args) {
         int index[] = {0,1,2,3,4};
         int nums[] = {1,2,3,4,0};
         int target[] = new int[index.length];
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            int pos = index[i];
            for (int j = size; j > pos; j--) {
                target[j] = target[j - 1];
            }
            target[pos] = nums[i];
            size++;
        }
        System.out.println(Arrays.toString(target));
    }

}
