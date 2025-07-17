import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = i.nextInt();
        int original = n;  // Store original number
        int digits = 0, rem;

        // Count the number of digits
        while (n > 0) {
            rem = n % 10;
            digits++;
            n = n / 10;
        }

        // Check if Armstrong
        int result = Armstrong(original, digits);

        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

       
    }

    static int Armstrong(int num, int digits) {
        int rem, ans, sum = 0;
        while (num > 0) {
            rem = num % 10;
            ans = (int) Math.pow(rem, digits);
            sum += ans;
            num /= 10;
        }
        return sum;
    }
}
