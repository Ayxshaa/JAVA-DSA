public class CheckIfTwoStringArraysareEquivalent {
    public static void main(String[] args) {
    String word1[] = {"a", "cb"};
    String word2[] = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
         StringBuilder first = new StringBuilder();
         StringBuilder second = new StringBuilder();

         int n = word1.length;
         for(int i =0; i<n; i++){
           first.append(word1[i]);
         }
        System.out.println(first);
         int m = word2.length;
         for(int i =0; i<m; i++){
             second.append(word2[i]);
         }
        System.out.println(second);

         if(first.toString().equals(second.toString())){
             return true;
         }
         return false;
    }
}
