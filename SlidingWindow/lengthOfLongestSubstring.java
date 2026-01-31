public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int n = s.length();
        int maxLen = 0;
        int left = 0;
        int[] index = new int[128];
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            left = Math.max(left, index[c]);
            maxLen = Math.max(maxLen, right - left + 1);
            index[c] = right + 1;
        }

        System.out.println(maxLen);
    }
}
