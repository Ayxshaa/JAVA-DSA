public class Shadowing {
    static int x = 30;// this will be shadowed by line 5
    public static void main(String[] args) {
        System.out.println(x);
     int x = 39;
        System.out.println(x);

//        int x;
//        //System.out.println(x); will give error that scope will begin when value is initialised
//        x = 6;
        fun();
    }


    static void fun(){
        System.out.println(x);
    }
}



/*
* Shadowing in Java is the practice of using variables in overlapping scopes with
* the same name where the variable in low-level scope overrides the variable of high-level scope.
*  Here the variable at high-level scope is shadowed by the low-level scope variable.
* */