package lesson_2.homework;

// 5. ** Задать одномерный массив и найти в нем минимальный
// и максимальный элементы (без помощи интернета);

public class Task5 {
    public static void main(String[] args) {
        int[] array = {5, 2, 7, 1, 10, 8, 3};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }

//            min = Math.min(min, array[i]); / второй способ решения задачи
//            max = Math.max(max, array[i]);
        }

//        Arrays.sort(array);                / третий вариант решения - через сортировку
//        min = array[0];
//        max = array[array.length -1];

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
