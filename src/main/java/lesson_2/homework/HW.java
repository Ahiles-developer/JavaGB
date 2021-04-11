package lesson_2.homework;

/**
 *  Урок 2. Основные конструкции.
 */
public class HW {
    public static void main(String[] args) {

        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.print("Задача 1: " + "\n\t");
        int[] firstArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == 0) {
                firstArr[i] = 1;
            } else firstArr[i] = 0;
            System.out.print(firstArr[i] + " ");
        }
        System.out.println("\n");

        // 2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.print("Задача 2: " + "\n\t");
        int[] secondArr = new int[8];
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = i * 3;
            System.out.print(secondArr[i] + " ");
        }
        System.out.println("\n");

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        System.out.print("Задача 3: " + "\n\t");
        int[] thirdArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < thirdArray.length; i++) {
            if (thirdArray[i] < 6) {
                thirdArray[i] = thirdArray[i] * 2;
            }
            System.out.print(thirdArray[i] + " ");
        }
        System.out.println("\n");

        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.print("Задача 4: " + "\n");
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
               table[i][j] = (i == j) || (i + j == table.length - 1) ? 1 : 0;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
