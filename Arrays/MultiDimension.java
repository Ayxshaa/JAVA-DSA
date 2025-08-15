public class MultiDimension {
    public static void main(String[] args) {
      //  int[][] nums = new int[3][3];
//
//        int [][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        int[][] arr2D = {
                // every row is different object!
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        System.out.println(arr2D);
        System.out.println(arr2D[0][0]);
        System.out.println(arr2D.length);
        System.out.println(arr2D[0].length);
        System.out.println(arr2D[1].length);
        System.out.println(arr2D[2].length);

      //  int[][] a = new int[2][3];
//        System.out.println(a);
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[0][0]);
//        System.out.println(a[1][1]);
//        System.out.println(a.length);
//        System.out.println(a[0].length);
//        System.out.println(a[1].length);

//   int [][] a = new int[2][];
//    System.out.println(a);
//        System.out.println(a.length);
//        System.out.println(a[1]);
//        System.out.println(a[0]);
     //   System.out.println(a[1].length); //Runtime Error : NullPointerException


//        int[][] a = new int[2][];
//        a[0] = new int[5];
//        a[1] = new int[10];
//
//        System.out.println(a);
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a.length);
//        System.out.println(a[0].length);
//        System.out.println(a[1].length);
//        System.out.println(a[0][4]);
//        System.out.println(a[1][9]);
    }
}
