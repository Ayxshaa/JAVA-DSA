public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
    static boolean halvesAreAlike(String s) {
         int mid = s.length()/2;
         String firstHalf = s.substring(0,mid);
         String secondHalf = s.substring(mid);
         int count =0,count2=0;
         for(int i =0; i<mid; i++){
             char c = firstHalf.charAt(i);
             if(c == 'a' || c=='e'|| c=='i' || c=='o' || c=='u'){
                 count++;
             }
         }
         for(int i =mid; i<s.length(); i++){
             char c = secondHalf.charAt(i-mid);
             if(c == 'a' || c=='e'|| c=='i' || c=='o' || c=='u'){
                 count2++;
             }
         }

         if(count == count2){
             return true;
         }
return false;
    }
}
