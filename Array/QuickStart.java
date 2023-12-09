package Array;

public class QuickStart {
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String args[]) {
        QuickStart qs = new QuickStart();
        int[] nums = { 5, 0, 1, 2, 3, 4 };
        int[] anss = qs.buildArray(nums);
        for (int i = 0; i < anss.length; i++) {
            System.out.println(anss[i]);
        }
    }
}
