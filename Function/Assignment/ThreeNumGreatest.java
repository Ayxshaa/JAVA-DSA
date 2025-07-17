import java.util.Scanner;

public class ThreeNumGreatest {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter num 1 : ");
        int num1 = i.nextInt();
        System.out.print("Enter numn 2 : ");
        int num2 = i.nextInt();
        System.out.print("Enter num 3 : ");
        int num3 = i.nextInt();

        int Maxium = Max(num1, num2, num3);
        int Minium = Min(num1, num2, num3);
        System.out.println("The Minium number is : "+Minium+ " The Max number is :  "+Maxium);
    }

    static int Max(int a, int b, int c){
        int max = 0;
        if(a>max){
            max = a;
        }
        if(b>max){
             max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
    }
    static int Min(int a, int b, int c){
        int min = a;
        if(a>b){
            min = a;
        }
        if(a>c){
            min = c;
        }
        return min;
    }
}
