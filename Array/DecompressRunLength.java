package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * DecompressRunLength
 */
public class DecompressRunLength {
    // public int[] decompressRLElist(int[] nums) {
    // List<Integer> Li = new ArrayList<Integer>();
    // for (int i = 0; i < nums.length; i += 2) {
    // for (int j = 0; j < nums[i]; j++) {
    // Li.add(nums[i + 1]);
    // }
    // }
    // int arr[] = new int[Li.size()];
    // int i = 0;
    // for (int x : Li) {
    // arr[i] = x;
    // i++;
    // }
    // return arr;

    // }
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }
        int[] result = new int[arrSize];
        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        DecompressRunLength obj = new DecompressRunLength();
        int[] nums = { 1, 2, 3, 4 };
        int arr[] = obj.decompressRLElist(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}