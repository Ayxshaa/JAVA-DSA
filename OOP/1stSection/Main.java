public class Main {
    public static void main(String[] args) {


        // this is just declaring, for now its null!
//        Student ayesha;
//        ayesha = new Student();

        Student ash = new Student();

        ash.rno = 12;
        ash.name = "ayesha";
        ash.marks = 84.7f;

        System.out.println(ash.rno);
        System.out.println(ash.name);
        System.out.println(ash.marks);

    }

}
class Student{
    int rno;
    String name;
    float marks;


}
