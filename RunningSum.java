package Array;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            arr[i + 1] = arr[i] + nums[i + 1];

        }
        return arr;
    }

    public static void main(String[] args) {
        RunningSum s = new RunningSum();
        int[] arr = { 1, 2, 3, 4 };
        int[] a = s.runningSum(arr);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

}
