import java.util.Arrays;

class MinimumNumberGame {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;

        }
        return nums;

    }

    public static void main(String[] args) {
        MinimumNumberGame obj = new MinimumNumberGame();
        int[] nums = { 5, 4, 3, 2 };
        int arr[] = obj.numberGame(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}