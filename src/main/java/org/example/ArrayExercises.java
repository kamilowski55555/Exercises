package org.example;

public class ArrayExercises {

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
