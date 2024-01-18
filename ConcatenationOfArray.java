package Array;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2 * n];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        ;
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3 };
        ConcatenationOfArray c = new ConcatenationOfArray();
        int[] ans = c.getConcatenation(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        // System.out.println("hello");
    }

}
