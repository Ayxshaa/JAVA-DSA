import java.util.ArrayList;

public class Opeartors {
    public static void main(String[] args) {
        //******String and char Operations*******//
        System.out.println('a'+'b');  // it will give 195 means this is characters and it is going to combine
        // them and gooing to givvr the character's ascii value


        System.out.println("a"+"b"); // this is a string so it will concatinate the characters


        System.out.println('a'+3); // so in the integer value of a it is going to add the 3!
        // means it is going to print the -> 100 which is d
        // lets do type casting to understand this
        System.out.println((char) ('a'+3));

        System.out.println("a"+2); // this will give the answer a2 -> means whn an integers is
        // contactinated with the string thn the integer is concatined its own wrapper class
        // and it calls toString method
       Integer n =78;
        System.out.println("ASh"+ new ArrayList<>());
        System.out.println("ayesha" + n);
//        System.out.println(n + new ArrayList<>());
        // the operator '+' in java is only going to apply in primitvies and other is string
        // and atleast there should be on string in the complex objects
       //-> this will work -> System.out.println(n + " " +new ArrayList<>());
        String ans = n + " " +new ArrayList<>();
        System.out.println(ans);
    }

    /*
     * NOTE: In Java, operator overloading is not supported,
     * unlike in C++ where it is allowed.
     * The only exception in Java is the '+' operator,
     * which is overloaded for String concatenation.
     * this is the only operation in java that is intentionally overloaded for string concatination
     */


}
