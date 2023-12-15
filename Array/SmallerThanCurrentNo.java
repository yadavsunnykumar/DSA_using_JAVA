package Array;

public class SmallerThanCurrentNo {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count = count + 1;
                }

            }
            arr[i] = count;
            count = 0;
        }
        return arr;

    }

    public static void main(String[] args) {
        SmallerThanCurrentNo s = new SmallerThanCurrentNo();
        int arr[] = new int[] { 8, 1, 2, 2, 3 };
        int a[] = s.smallerNumbersThanCurrent(arr);
        System.out.println("The array is : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
