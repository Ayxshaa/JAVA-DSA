import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int arr[][] = {
                {2,3,4,5},
                {6,7,8,9,10},
                {21,32,87,89,0},
                {26,90,34,1,56,85}
        };

        int target = 0;
        int ans[] = Search(arr, target);
        System.out.println(Arrays.toString(ans));

        int max = SearchMax(arr);
        System.out.println("Max is : "+max);

        int min = SearchMin(arr);
        System.out.println("Min is : "+min);
    }

    static int[] Search(int arr[][], int target){
        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        for(int row =0; row<arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                int i = arr[row][col];
                if(i == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }


    static int SearchMax(int arr[][]){
        int max = arr[0][0];
        if(arr.length == 0){
            return -1;
        }
        for(int row =0; row<arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                if(arr[row][col]>max){
                   max = arr[row][col];
                }
            }
        }
        return max;
    }
    static int SearchMin(int arr[][]){
        int min = arr[0][0];
        if(arr.length == 0){
            return -1;
        }
        for(int row =0; row<arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                if(min>arr[row][col]){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }

}
