public class Comparison {
    public static void main(String[] args) {
        String a = "Ash";
        String b = "Ash";

        // proof of this is -> ==
       // System.out.println(a==b);

        String name1 = new String("Ash");
        String name2 = new String("Ash");
       // System.out.println(name1==name2);
        //-> .equals only care abt the values not the reference variable!
        System.out.println(name1.equals(name2));

        // so in Strings we don't use like name1[0] like an array
        // we use like -> name1.charAt(0) // give ur index
        //System.out.println(name1.charAt(0));
    }
}
