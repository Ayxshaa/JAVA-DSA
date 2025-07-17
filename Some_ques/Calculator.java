import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int ans = 0;
        System.out.println("Enter the Numbers for calculation and if want to break press 'X or x");
        while(true){
            System.out.println("Enter the operator");
            char op = i.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op=='/' || op=='%' ){
                System.out.println("Enter two numbers");
                int a = i.nextInt();
                int b = i.nextInt();

                if(op=='+'){
                    ans = a+b;
                }
                if(op=='-'){
                    ans = a-b;
                }
                if(op=='*'){
                    ans = a*b;
                }
                if(op=='/'){
                    if(b!=0){
                        ans = a/b;
                    }
                }
                if(op=='%'){
                    ans = a%b;
                }
            } else if (op=='x' || op=='X') {
                break;
            }
            else {
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);
        }

    }
}
