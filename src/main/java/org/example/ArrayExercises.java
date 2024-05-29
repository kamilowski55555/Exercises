package org.example;

public class ArrayExercises {

    public int countClumps(int[] nums) {
        int clumps = 0;
        int i = 0;

        while (i < nums.length) {
            int count = 1;
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                count++;
                i++;
            }
            if (count > 1) {
                clumps++;
            }
            i++;
        }

        return clumps;
    }

    public int[] seriesUp(int n) {
        int length = n * (n + 1) / 2;
        int[] result = new int[length];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[index] = j;
                index++;
            }
        }

        return result;
    }
    public int[] squareUp(int n) {
        int[] result = new int[n * n];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                result[i * n - j - 1] = j + 1;
            }
        }

        return result;

    }
}
