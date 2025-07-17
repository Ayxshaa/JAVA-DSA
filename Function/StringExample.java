import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greeting();
//        System.out.println(message);
        // pass the argument in string!
        Scanner i = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = i.next();
        String my = eg(name);
        System.out.println(my);

    }
//    static String greeting(){
//        String greet = "How are you??";
//        return greet;
//    }
    static String eg(String a){
        String message = "Hello " + a;
        return message;

    }

}
