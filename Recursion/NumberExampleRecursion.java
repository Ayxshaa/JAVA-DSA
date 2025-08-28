public class NumberExampleRecursion {
    public static void main(String[] args) {
      print(1);
    }
    static void print(int n ){
        // base condition
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // this is called as tail recursion!
        print(n+1);
        // as many time u call the function, it will take the memory separately!
    }
}
