import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ddToArrayForm {
    public static void main(String[] args) {
        int nums[]  = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(nums, k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int prev =0;
        int i =0;
        while(i<num.length){
            prev = prev*10+num[i];
            System.out.println(prev);
            i++;
        }
      int sum = prev+k;
        System.out.println(sum);
        List<Integer> ans = new ArrayList<>();
        if (sum == 0) {
            ans.add(0);
        }
        while (sum > 0) {
            ans.add(sum % 10);
            sum /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }

}
