public class MaxWealth {
    public static void main(String[] args) {
       int arr[][] = {
               {2,8,7},
               {7,1,3},
               {1,9,5}
       };
       int sum = 0,max = Integer.MIN_VALUE;


       for(int row = 0; row<arr.length; row++){
           sum = 0;
           for(int col = 0; col<arr[row].length; col++){
                sum = sum + arr[row][col];
                if(sum > max){
                    max = sum;
                }
           }
       }
        System.out.println(max);
    }

}
