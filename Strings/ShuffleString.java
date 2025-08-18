import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
      String s = "codeleet";
      int indicies[] = {4,5,6,7,0,2,1,3};
      String ans = restoreString(s,indicies);
        System.out.println(ans);
    }
    static String restoreString(String s, int[] indices) {
int i = s.length();
char[] newString = new char[i];

for(int j =0; i<i; j++){
    newString[indices[i]] = s.charAt(j);
}
return new String(newString);

    }
}
