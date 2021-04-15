package lesson_2.homework;

// 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

public class Task4 {
    public static void main(String[] args) {
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i == j) || (i + j == table.length - 1) ? 1 : 0;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

//        Еще одно решение задачи
//        final int SIZE = 9;
//        int[][] array = new int[SIZE][SIZE];
//        int lastIndex = array.length - 1;
//        for (int i = 0; i < array.length; i++) {
//            array[i][i] = array[i][lastIndex - i] = 1;
//        }
//        for (int[] ints : array) {
//            System.out.println(Arrays.toString(ints));
//        }
    }
}
