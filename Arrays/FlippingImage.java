import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };

        int ans[][] = invert(arr);
        for(int row =0; row<ans.length; row++ ){
            for(int col =0; col<ans[row].length; col++){
                System.out.print(ans[row][col] + "  ");
            }
            System.out.println();
        }

    }


 static int[][] invert(int image[][]){
     int ans[][] = reverse(image);
     for(int row =0; row<ans.length; row++ ){
         for(int col =0; col<ans[row].length; col++){
             if(ans[row][col] == 0){
                 ans[row][col] =1;
             }
             else{
                 ans[row][col] =0;
             }
         }

     }
     return ans;

 }


    static int[][] reverse(int arr[][]){
            for(int i =0; i<arr.length; i++){
              int j=0;
                   for(int k = arr.length-1;  j<k; k--,j++){
                      int temp = arr[i][j];
                      arr[i][j] = arr[i][k];
                      arr[i][k] = temp;

               }
            }


        return arr;
    }
}
