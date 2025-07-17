import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        //Q. take two input and add sum
        //sum();
        int ans = sum1();
        System.out.println("The ans is : "+ans);

    }
      static int sum1(){
          Scanner i = new Scanner(System.in);
          System.out.print("Enter num1 : ");
          int num1 = i.nextInt();
          System.out.print("Enter num2 : ");
          int num2 = i.nextInt();
          int sum = num1 + num2;
          return sum;
      }
    static  void sum() {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = i.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = i.nextInt();
        int sum = num1 + num2;
        System.out.print("Sum is :  " + sum);
    }
}
