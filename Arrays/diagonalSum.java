public class diagonalSum {
    public static void main(String[] args) {
int arr[][] = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
};
int ans = Sum(arr);
        System.out.println(ans);
    }
    static int Sum(int mat[][]){


        int sum =0;
        for(int i =0; i<mat.length; i++){
            for(int j =0; j<mat[i].length; j++){
                if(i == j){
                    sum = sum+mat[i][j];
                }
            }
        }
        int sum2 =0;
       int i =0;
       int j = mat.length-1;
       while(i<= mat.length-1){
           while (j>=0){
               if(i!=j){
                   sum2 = sum2+mat[i][j];
               }
              i++;
               j--;

           }
       }
        return sum+sum2;
    }



}
