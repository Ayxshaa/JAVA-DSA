import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int sum =0;
        while(true){
            System.out.println("Enter number");
            int n = i.nextInt();
            sum = sum+n;
            if(n==0){
                break;
            }
        }
        System.out.println("Sum of the digits is : "+sum);
    }
}
