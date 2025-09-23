public class SumOfDigits {
    public static void main(String[] args) {
        int ans = Digits(222112);
        System.out.println(ans);
    }
    static int Digits(int n ){
        if(n<=0){
            return 0;
        }
        int rem = n%10;
        n = n/10;
       return rem+Digits(n);
//       return (n%10) + Digits(n/10);
    }
}
