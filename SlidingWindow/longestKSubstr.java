import java.util.HashMap;
public class longestKSubstr {

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        int n = s.length();
        int low = 0;
        int res = -1;

        HashMap<Character, Integer> freq = new HashMap<>();

        for (int high = 0; high < n; high++) {

            char ch = s.charAt(high);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            while (freq.size() > k) {
                char leftChar = s.charAt(low);
                freq.put(leftChar, freq.get(leftChar) - 1);

                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                low++;
            }

            if (freq.size() == k) {
                int len = high - low + 1;
                res = Math.max(res, len);
            }
        }

        System.out.println(res);
    }
}
