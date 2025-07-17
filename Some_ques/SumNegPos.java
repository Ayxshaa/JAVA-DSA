import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class SumNegPos {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int sumPos=0, sumNeg=0;
        while (true){
            System.out.println("Enter num : ");
            int n = i.nextInt();
            if(n==0){
                break;
            }
            if(n>0 && n%2!=0){
                sumPos = sumPos+n;
            }
            if(n<0){
                sumNeg = sumNeg+n;
            }
        }
        System.out.println("The sum of Negative Numbers : "+sumNeg);
        System.out.println("The sum of Pos and Odd pos Numbers : "+sumPos);
    }
}
