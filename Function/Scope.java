public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Ayesha";

        {
            //int a = 57;  already initialized value outside the block in the same method, hence u cannot initialized again

              a=78;  // we can reassign the orignal ref variable to some other value!
            System.out.println(a);
            /* if the value has initialized before, and if we resigned it thn the value will get change****/
              int c = 99;
              // value intialized in this block, will remain in block
                name = "Saniya";
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);
    }
}

/*
* function block-> the value that have scope just in the box not outside
* block
* anything initialized outside the box can be updated in the box! and can't reinitialized it in the box
* anything that is initialized inside the box cannot be use outside the box! but u can initialized it again outside
* */
