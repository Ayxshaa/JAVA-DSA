import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rem, sum=0;
        System.out.println("Enter number");
        int n = input.nextInt();
        int avg =0;
        int i=0;
            while(n>0){
                rem = n%10;
                sum = sum+rem;
                n = n/10;
                i++;
            }
            avg = sum/i;

        System.out.println("Average is : "+avg);
    }
}
