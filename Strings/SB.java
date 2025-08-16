public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(int i =0; i<26; i++){
            char ch = (char) ('a'+i);
           sb.append(ch);

        }
        for (int i = 0; i < 5; i++) {
           char ch = (char) ('a' + i);
           sb1.append(ch);
        }
        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);
        System.out.println(sb.compareTo(sb1));

    }
}

/*
* 🔑 How compareTo() works for StringBuilder

It compares character by character from the start.

If all characters match and one string ends, then it returns the length difference.

If a mismatch is found early, it returns the ASCII difference of the first mismatched characters.
*
* Case 1: Without reverse()

sb = "abcdefghijklmnopqrstuvwxyz"
sb1 = "abcde"

Compare: "abcde" matches fully with the start of sb.

But sb is longer, so rule #2 applies.

Result = 26 - 5 = 21 ✅

Case 2: With reverse()

sb = "zyxwv...cba"
sb1 = "abcde"

Compare: first char 'z' (122) vs 'a' (97).

They differ right away, so rule #3 applies.

Result = 122 - 97 = 25 ✅

👉 That’s why:

If strings start the same → it checks length.

If strings differ right away → it checks ASCII difference.
* */