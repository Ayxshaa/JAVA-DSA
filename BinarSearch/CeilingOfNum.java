public class CeilingOfNum {
    public static void main(String[] args) {
       char arr[] = {'c','f','g'};
        char target = 'c';
        char ch = ceiling(arr,target);
        System.out.println(ch);

    }
    // return the index : smallest number >= target
    static char ceiling(char letters[],int target){
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}
