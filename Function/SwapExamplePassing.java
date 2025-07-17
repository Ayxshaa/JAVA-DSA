public class SwapExamplePassing {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        //  System.out.println(a + " " + b);

    }
    /*
    * for primitive data type its only going to pass by value
    * and for objects and other stuff -> pass by value of that reference variable!
    *
    * */

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        // this change will only be valid in this function scope only
    }
}
