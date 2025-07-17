import java.util.Scanner;

public class Arguments {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
//        int ans = Add(10 ,20);
//        System.out.println(ans);

        System.out.print("Enter a : ");
        int a = i.nextInt();
        System.out.print("Enter b : ");
        int b = i.nextInt();
        int ans = Add(a,b);
        System.out.println(ans);
    }
    static int Add(int a, int b){
        int sum = a+b;
        return sum;
    }
}
