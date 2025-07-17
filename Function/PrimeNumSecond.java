import java.util.Scanner;

public class PrimeNumSecond {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = i.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);

    }
static boolean isPrime(int n){
          if(n<=1) return false;
          int c = 2;
          while (c*c<=n){
              if(n%c == 0){
                  return false;
              }
              c++;
          }
          return c*c>n;
}
}
