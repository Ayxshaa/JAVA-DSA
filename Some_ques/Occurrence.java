import java.util.Scanner;

public class Occurrence {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = i.nextInt();
        System.out.println("Enter the number u want to check the occurrence : ");
        int number = i.nextInt();
        int key =0;
        int rem;

        while (n>0){
            rem = n%10;
            if(rem == number){
                key++;
            }
            n = n/10;
        }
        System.out.println(key);
    }
}
