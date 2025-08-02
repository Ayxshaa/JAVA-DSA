import java.util.Arrays;

public class transponse {
    public static void main(String[] args) {
          int arr[][] = {
                  {2,4,-1},
                  {-10,5,11},
                  {18,-7,6}
          };
          int ans[][] = change(arr);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] change(int matrix[][]){
        int n = matrix.length;
        for(int k =0; k<n; k++){
            int r =1;
            for(int c =1; c<n; c++,r++ ){
                int temp = matrix[k][c];
                matrix[k][c] = matrix[r][k];
                matrix[r][k] = temp;
            }
        }
        return matrix;
    }
}
