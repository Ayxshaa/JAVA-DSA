import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
/*
        list.add(45);
        list.add(67);
        list.add(78);
        list.add(70);
        list.add(452);

        System.out.println(list.contains(69)); // false
        System.out.println(list);
        list.set(0, 8);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

 */
      //Input
        for(int i=0; i<5; i++){
          list.add(in.nextInt());
        }

        //get item at any index!
        for(int i=0; i<5; i++){
            System.out.print(list.get(i)+ " 1"); // pass index here, syntax of list[index] will not work here!
        }

    }


}
