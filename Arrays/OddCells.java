public class OddCells {
    public static void main(String[] args) {

    }
    static int cells(int m, int n, int[][] indicies){
        int arr[][] = new int[m][n];
       int i = indicies.length;

       for(int r =0; r<i; r++){
           for(int c = 0; c<n; c++){
               arr[indicies[r][0]][c]++;
           }
           for(int c =0; c<m; c++){
               arr[c][indicies[r][1]]++;
           }
       }
int count=0;
       for(int r =0; r<m; r++){
           for(int c =0; c<n; c++){
               if(arr[r][c] %2 !=0){
                   count++;
               }
           }
       }
return count;
    }
}
