package lesson_2.homework;

//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//      метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//      Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
//      checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

public class Task6 {
    public static void main(String[] args) {
        System.out.println(CheckBalance(new int[]{2, 2, 2, 1, 2, 2, 0, 0, 10, 1}));
        System.out.println(CheckBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(CheckBalance(new int[]{3, 5}));
        System.out.println(CheckBalance(new int[]{2, 2, 0, 0, 3}));
    }

    private static boolean CheckBalance(int[] array) {
        System.out.println();
        int leftSum = 0;
        int rightSum = sum(array, 0, array.length);
        boolean result = false;

        if (rightSum % 2 != 0) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            rightSum -= array[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                result = true;
            } else if (leftSum > rightSum) {
                return result;
            }
        }
        return result;
    }

    private static int sum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Второе решение - более компактное
    public static boolean checkBalance2 (int[] arr) {
        int sumOfArray = 0;

        for (int j : arr) {
            sumOfArray += j;
        }

        int sum = 0;
        for (int i = 0; i < arr.length - 1 && sum < sumOfArray - sum; i++) {
            sum += arr[i];
        }
        return sum == sumOfArray - sum;
    }
}
