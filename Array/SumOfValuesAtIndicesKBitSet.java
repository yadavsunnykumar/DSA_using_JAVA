package Array;

import java.util.List;

public class SumOfValuesAtIndicesKBitSet {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (bytesInNumber(i) == k) {
                result = result + nums.get(i);
            }
        }
        return result;

    }

    public int bytesInNumber(int num) {
        int count = 0;
        String binary = Integer.toBinaryString(num);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
    // public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
    // int n = nums.size();
    // int res = 0;
    // for(int i = 0; i < n; i++)
    // if(Integer.bitCount(i) == k)
    // res += nums.get(i);
    // return res; }

    public static void main(String[] args) {
        SumOfValuesAtIndicesKBitSet solution = new SumOfValuesAtIndicesKBitSet();
        List<Integer> list = List.of(5, 10, 1, 5, 2);
        int k = 1;
        int x = solution.sumIndicesWithKSetBits(list, k);
        System.out.println(x);
    }

}
