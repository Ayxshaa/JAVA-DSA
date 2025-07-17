import java.util.Scanner;

public class EvenDaysToGoOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int August = 31;
        int count=0;
        for(int i =1; i<=31; i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("The ash can go out (even) in : "+count);
    }
}
