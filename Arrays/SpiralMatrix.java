import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int mat[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(spiralOrder(mat));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;

        List<Integer> l = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // Traverse right
            for (int i = left; i <= right; i++) {
                l.add(matrix[top][i]);
            }
            top++;

            // Traverse down
            for (int i = top; i <= bottom; i++) {
                l.add(matrix[i][right]);
            }
            right--;

            // Traverse left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    l.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    l.add(matrix[i][left]);
                }
                left++;
            }
        }
        return l;
    }
}
