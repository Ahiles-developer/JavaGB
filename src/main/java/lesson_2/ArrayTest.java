package lesson_2;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        final int ARRAY_SIZE = 7;
        int[] data = new int[ARRAY_SIZE];

        data[0] = 3;
        data[3] = 5;
        data[data.length - 1] = 11;

//        System.out.println(data);
//        for (int i = 0; i < data.length; i++) {
//            int n = data[i];
//            n++;
//            System.out.print(data[i] + " ");
//        }

        for(int n : data) {
            System.out.print(n + " ");
        }
        System.out.println();

        Arrays.sort(data);
        System.out.println(Arrays.toString(data));

        int n = 1;
        int[][] deepData = new int[ARRAY_SIZE][ARRAY_SIZE];
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                deepData[i][j] = n++;
            }
        }
//        System.out.println(Arrays.deepToString(deepData)); - не красиво выведется

        for (int[] deepDatum : deepData) {
            for (int num : deepDatum) {
                System.out.printf("%3d", num);
//                System.out.print(String.format("%3d", num));
            }
            System.out.println();
        }

        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                System.out.printf("%3d", deepData[i][j]);
            }
            System.out.println();
        }

    }
}
