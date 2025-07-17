import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = i.nextInt();
        int digits = 0 , rem;
        while (n>0){
            rem = n%10;
            digits++;
            n = n/10;
        }
        System.out.println(digits);
    }
}
