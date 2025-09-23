public class ProductOfDigits {
    public static void main(String[] args) {
        int ans = prod(1034);
        System.out.println(ans);
    }
    static int prod(int n ){
        if(n<=0){ // or (n%10 == n){ return n}
            return 1;
        }
        return (n%10) * prod(n/10);
    }
}
