import java.util.HashMap;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int fruits[] = {1,2,1};
        int n = fruits.length;
        int low = 0;
        int res = 0;
        int k = 2;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int high = 0; high < n; high++) {
            int fruit = fruits[high];
            freq.put(fruit, freq.getOrDefault(fruit, 0) + 1);

            while (freq.size() > k) {
                int leftFruit = fruits[low];
                freq.put(leftFruit, freq.get(leftFruit) - 1);

                if (freq.get(leftFruit) == 0) {
                    freq.remove(leftFruit);
                }
                low++;
            }

            res = Math.max(res, high - low + 1);
        }

        System.out.println(res);
    }
}
