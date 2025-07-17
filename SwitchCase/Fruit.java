import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("Enter fruit name : ");
        String fruit = i.next();

        switch (fruit){
            case "Mango":
                System.out.println("The king of fruits");
                break;
            case "Apple":
                System.out.println("The red sweet fruit");
                break;
            case "Orange":
                System.out.println("The orange fruit");
                break;
            default:
                System.out.println("Enter valid fruit");
        }

//        switch (fruit) {
//            case "Mango" -> System.out.println("The king of fruits");
//            case "Apple" -> System.out.println("The red sweet fruit");
//            case "Orange" -> System.out.println("The orange fruit");
//            default -> System.out.println("Enter valid fruit");
//        }  enhanced switch-> alt+enter
    }
}
