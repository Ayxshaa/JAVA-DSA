public class ConstructorAndThis {
    public static void main(String[] args) {


        Bache ayesha = new Bache();

        Bache jeatu = new Bache();

        System.out.println(ayesha.roll);
        System.out.println(ayesha.name);
        System.out.println(ayesha.marks);

        System.out.println(jeatu.roll);
        System.out.println(jeatu.name);
        System.out.println(jeatu.marks);

    }

}


class Bache{
    int roll;
    String name;
    float marks;


    Bache(){ // default constructor
        this.roll = 12;
        this.name = "Ayesha Qureshi";
        this.marks = 89.9f;

        // behind the scene , the this keyword will replace the name i.e the refernce variable
        //  that is called!

        // this keyword makes our work eazy now we don't need to write the data and everything individually!




    }

}

