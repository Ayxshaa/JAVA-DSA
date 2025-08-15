public class CountBitOR {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        permute(nums, 0, nums.length - 1);
        int count = 0;
        int temp = nums.length-1;
        if (temp == 0) count = 1;
        else {
            while (temp > 0) {
                temp /= 2;
                count++;
            }
        }
        for (int i  = count - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }


    static void DecToBin(int n, int arr[]) {
        int i = 0;
        if (n == 0) {
            arr[i] = 0;
            return;
        }

        while (n > 0) {
            if (n % 2 == 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            n = n / 2;
            i++;
        }
    }

    static void permute(int arr[], int l, int r) {
        if (l == r) {
            // Print the current permutation
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i); // backtrack
            }
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
