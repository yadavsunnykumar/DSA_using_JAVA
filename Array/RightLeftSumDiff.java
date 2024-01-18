package Array;

public class RightLeftSumDiff {
    public int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];
        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum[i + 1] = nums[i] + leftSum[i];
        }
        for (int i = nums.length - 1; i > 0; i--) {
            rightSum[i - 1] = nums[i] + rightSum[i];
            // System.out.println(i);

        }
        // System.out.println(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int n = (leftSum[i] - rightSum[i]);
            if (n < 0) {
                answer[i] = n * (-1);
            } else {
                answer[i] = n;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int nums[] = { 10, 4, 8, 3 };
        RightLeftSumDiff m = new RightLeftSumDiff();
        int a[] = m.leftRightDifference(nums);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
