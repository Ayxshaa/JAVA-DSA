public class PassingExample {
    public static void main(String[] args) {


        String name = "Ayesha Qureshi";
        ChangeName(name);
        System.out.println(name);

    }

/*
*   exactly what happen is that there is no Pass by reference in the java
* there is only Pass by value-> in which what happen is the copy of reference variable get pass
* to the function in the argument
*
* in this example ---> the name point to "Ayesha Qureshi" as when the function initiate then the
* naam start pointing to the "Ayesha Qureshi" but as the line come -> naam = "Saniya Sheikh" thn the
* naam started pointing to the "Saniya Sheikh" and the change won't reflect in the name!
*
* the concept of scoping also come in the name and naam have different scope! thats why its not changeable
* and accessable!
* in which we are creating a new object not changing!
* */
    static void ChangeName(String naam){
  naam = "Saniya Sheikh"; // this will not reflect in the name
    }


}
