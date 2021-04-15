package lesson_2.homework;

//7. **** Написать метод, которому на вход подается одномерный массив
// и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементымассива на n позиций.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        shiftArray(new int[]{1, 2, 3, 4, 5}, 0);
        shiftArray(new int[]{1, 2, 3, 4, 5}, 1);
        shiftArray(new int[]{1, 2, 3, 4, 5}, 2);
        shiftArray(new int[]{1, 2, 3, 4, 5}, 5);
        shiftArray(new int[]{1, 2, 3, 4, 5}, 6);
        shiftArray(new int[]{1, 2, 3, 4, 5}, -1);
        shiftArray(new int[]{1, 2, 3, 4, 5}, -2);
        shiftArray(new int[]{1, 2, 3, 4, 5}, -5);
        shiftArray(new int[]{1, 2, 3, 4, 5}, -6);
        shiftArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, 3);
    }

    private static void shiftArray(int[] array, int n) {
        int shiftNumber = n % array.length;
        if (shiftNumber < 0) {
            shiftLeft(array, shiftNumber);
        } else {
            shiftRight(array, shiftNumber);
        }
        System.out.println(Arrays.toString(array) + "; shiftNumber = " + n);
    }

    private static void shiftRight(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int lastValue = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastValue;
        }
    }

    private static void shiftLeft(int[] array, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            int firstValue = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstValue;
        }
    }
}
