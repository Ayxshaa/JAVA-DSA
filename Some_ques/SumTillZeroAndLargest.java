import java.util.Scanner;

public class SumTillZeroAndLargest {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int max =0;
        while(true){
            System.out.println("Enter num : ");
            int n = i.nextInt();
            if(n>max){
                max = n;
            }
            if(n==0){
                break;
            }
        }
        System.out.println("Largest number : "+max);
    }
}
