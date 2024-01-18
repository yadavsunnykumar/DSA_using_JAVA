package Array;

import java.util.ArrayList;

public class ArrayInOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);

        }

        for (int i = 0; i < arr.size(); i++) {
            target[i] = arr.get(i);
        }
        System.out.println(arr);
        return target;

    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        ArrayInOrder m = new ArrayInOrder();
        int a[] = m.createTargetArray(nums, index);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
