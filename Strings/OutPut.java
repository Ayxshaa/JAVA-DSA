import java.util.Arrays;

public class OutPut {
    public static void main(String[] args) {

        // println calls directly or indirectly -> toString
        System.out.println(56);
        // so bydeault in the end it uses wrapper classes and toString
        Integer n = 45;
        System.out.println(n.toString());
        System.out.println("Kunal");
        // the objects can be of any type
        //System.out.println(new int[]{1,2,3,4}); // -> this will print the [I@7b23ec81
        // so now to print the array and we want use the toString of an array
        System.out.println(Arrays.toString(new int[]{1,2,3,4}));
    }
}
