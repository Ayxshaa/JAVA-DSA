import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchCharInString {
    public static void main(String[] args) {
        String str = "Ayesha";
        char target = 'v';

        boolean ans = Search(str, target);
        System.out.println(ans);

        System.out.println(Arrays.toString(str.toCharArray()));

        boolean ans2 = Search2(str, target);
        System.out.println(ans2);
    }
    static boolean Search(String str, char target){
        int i;
        if(str.length() == 0){
            return false;
        }
       for(i=0; i<str.length(); i++){
           if(str.charAt(i) == target){
               return true;
           }
       }
        return false;
    }


    //with the for each loop!
    static boolean Search2(String str, char target){
        int i;
        if(str.length() == 0){
            return false;
        }
        // toCharArray method is used to convert String to Array as for each loop works on Array!
       for(char ch : str.toCharArray()){
           if(ch == target){
               return true;
           }
       }
        return false;
    }

}
