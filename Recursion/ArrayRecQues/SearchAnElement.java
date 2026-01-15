public class SearchAnElement {
    public static void main(String[] args) {

    }
    static boolean search(int[] arr, int target, int index){
        if(index== arr.length){
            return false;
        }
        return arr[index] == target ||search(arr, target, index++);
    }
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr, target, index++);
        }
    }
}
