package lesson_9.homework;
/*
    1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4,
    при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
    должно быть брошено исключение MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные данные.
    3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и
    MyArrayDataException и вывести результат расчета.
 */
public class Main {
    public static void main(String[] args) {

        String[][] array = new String[][]{{"1", "3", "5", "8"},
                                          {"2", "2", "1", "9"},
                                          {"5", "7", "4", "1"},
                                          {"6", "2", "5", "0"}
        };

        try {
            try {
                int result = arraySum(array);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Превышен размер массива!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Обнаружен недопустимый символ в массиве!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }

    public static int arraySum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if(array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}
