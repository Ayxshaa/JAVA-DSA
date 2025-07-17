import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = i.nextInt();
        boolean ans = isPrime(num);
        System.out.println( );
    }

    static boolean isPrime(int num){
        int count =0;
        if(num<1) return false;
        for(int i =1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }
}
