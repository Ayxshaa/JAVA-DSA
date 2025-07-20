public class EvenOddDigits {
    public static void main(String[] args) {
        int arr[] = {12,345,2,6,7896};
      // int ans = findNumbers(arr);
       // System.out.println("The even number of digits is : "+ans);
        int ans = Find(arr);
        System.out.println(ans);

    }

    static int Find(int num[]){
        int count =0;
        for(int n : num){
            if(even(n)){
                count++;
            }
        }
        return count++;
    }
    static boolean even(int num){
        int numberOfDigits = digits2(num);
        return  numberOfDigits % 2 == 0;
    }
    // short cut to count numbers!
    static int digits2(int nums){
        if(nums<0){
            nums= nums*-1;
        }
        return (int)(Math.log10(nums)) + 1;
    }

}


/*
*  int n,i,count =0,digits=0;

        for(i=0; i<arr.length; i++){
            n = arr[i];
            count=0;
            while(n>0){
                count++;
                n = n/10;
            }
//            System.out.println("Count"+count+"= arr["+i+"]");
            if(count%2==0){
                digits++;
            }
        }
        System.out.println(digits);*/

/*
* static int findNumbers(int[] nums){
        int n,i,count =0,digits=0;
        for(i=0; i<nums.length; i++){
            n = nums[i];
            count=0;
            while(n>0){
                count++;
                n = n/10;
            }
//            System.out.println("Count"+count+"= arr["+i+"]");
            if(count%2==0){
                digits++;
            }
        }
        return digits;
    }*/

