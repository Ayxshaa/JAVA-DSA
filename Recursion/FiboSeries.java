public class FiboSeries {
    public static void main(String[] args) {
        // System.out.println(fibo(6));
//        for(int i=0; i<10; i++){
//            System.out.print(fiboFormula(i)+" ");
//        }
    }
//    static int fiboFormula(int n ){
//        //   return (int)Math.pow(((1+Math.sqrt(5))/2), n) - (int)Math.pow(((1-Math.sqrt(5))/2), n) / Math.sqrt(5);
//        return (int)Math.pow(((1+Math.sqrt(5))/2), n) / Math.sqrt(5);
//
//    }
    static int fibo(int n ){
        // base condition
        if(n<2){
            return n;
        }
        return fibo(n-1)+ fibo(n-2);
    }
}
