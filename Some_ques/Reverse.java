import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int n = i.nextInt();
        int rem , rev =0;

        while (n>0){
            rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        System.out.println(rev);
    }
}
