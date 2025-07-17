public class Overloading {
    public static void main(String[] args) {
      fun(10);
      fun("Ayesha");
        //fun(); java: no suitable method found for fun(no arguments)
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }

}
/* function overloading is a concept in which when the function have a same name
but have different parameters thn its ok!
* function overloading decide at the compile time to which function to run!
overriding will later which happen at the run time!
* */