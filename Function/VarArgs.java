import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//fun(2,3,4,5,1,2,2,3,4,4,4,4,4,4); // internally it will give an array!
       // multiple(2, 3,"ash", "san");

        // demo(); this is amiguity in VarArgs
    }
// Key point : the vararg should be alone or shoule be last!
    static void multiple(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
  static void fun(int ...v){
      System.out.println(Arrays.toString(v));
  }

  static void demo(int ...v){
      System.out.println(Arrays.toString(v));
  }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}

/*
* Variable argument is used when we want to give the n numbers of input in the method
* the syntax is ->> (data_type ...variable_name)
* */