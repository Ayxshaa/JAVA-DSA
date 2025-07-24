public class PeakMountain {
    public static void main(String[] args) {
        int arr[] = {0,2,1,0};
        int ans = BS(arr);
        System.out.println(ans);
    }
    static int BS(int arr[]){
      int start =0;
      int end = arr.length-1;

      while(start<end){
          int mid = start+(end-start)/2;

          if(arr[mid]>arr[mid+1]){
              // you are int the decreasing part of array!
              // this may be the ans , but look at left
              // this is why -> end!=mid-1;
              end = mid;
          }
          else {
              // u are on asc part of array!
             // arr[mid]<arr[mid+1];
              start = mid+1; // bcz we know that mid+1 element is > thn mid element
          }

      }
      return start;
    }
    // in the last!-> start == end and pointing to the largest num bc of the two checks
    // start and end always trying to find max element in the above two checks
}
