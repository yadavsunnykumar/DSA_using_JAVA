package Array;

import java.util.List;

public class CountPairs {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count = count + 1;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        CountPairs cp = new CountPairs();
        List<Integer> list = java.util.Arrays.asList(-1, 1, 2, 3, 1);
        int target = 2;
        int x = cp.countPairs(list, target);
        System.out.println(x);

    }
}
