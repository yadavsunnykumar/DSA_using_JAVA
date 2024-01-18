package Array;

import java.util.Arrays;

public class RichestMan {
    public int maximumWealth(int[][] accounts) {
        // int[] arr = new int[accounts.length];
        // int sum = 0;
        // for (int i = 0; i < accounts.length; i++) {
        // for (int j = 0; j < accounts[i].length; j++) {
        // sum = sum + accounts[i][j];

        // }
        // arr[i] = sum;
        // sum = 0;

        // }
        // Arrays.sort(arr);
        // return arr[accounts.length - 1];
        int res = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            res = Math.max(res, temp);
        }
        return res;

    }

    public static void main(String[] args) {
        RichestMan o = new RichestMan();
        int[][] acc = { { 1, 2, 3 }, { 3, 2, 0 } };
        int a = o.maximumWealth(acc);
        System.out.println("The richest man has " + a + " dollars.");
    }
}
