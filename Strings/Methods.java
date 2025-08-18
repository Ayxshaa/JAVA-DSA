import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Ayesha Qureshi";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());   // it counts space too!
        System.out.println( name.substring(1,8));
        System.out.println(name.indexOf('Q'));
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.split( " ")));
    }
}
