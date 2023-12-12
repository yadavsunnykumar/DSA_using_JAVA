package Array;
/**
 * Shuffle
 */
public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[2 * n];
        int i = 0;
        for (int j = 0; j < n; j++) {
            result[i] = nums[j];
            result[i + 1] = nums[j + n];
            i = i + 2;
        }

        return result;

    }

    public static void main(String[] args) {
        Shuffle o = new Shuffle();
        int a[] = { 2, 5, 1, 3, 4, 7 };
        int n = a.length / 2;
        int[] x = o.shuffle(a, n);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}