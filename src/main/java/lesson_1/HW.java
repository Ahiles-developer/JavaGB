package lesson_1;

public class HW {
    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {
    // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        int    i = 1;
        byte   b = 2;
        short  s = 3;
        long   l = 4;
        double d = 2.0;
        float  f = 7.0f;
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(calculateExpression(46, 59, 71, 100));
        System.out.println(sumNumbers(5, 17));
        positiveOrNegative(0);
        System.out.println(numTrueOrFalse(-1));
        helloName("Джон Сноу");
        isLeapYear(2021);
    }

    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float calculateExpression(float a, float b, float c, float d) {
        float calculate = a * (b + (c / d));
        return calculate;
    }

    // 4. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean sumNumbers(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // 5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void positiveOrNegative(int num) {
        if (num >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }

    // 6. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean numTrueOrFalse(int num) {
        if (num < 0) {
            return true;
        } else return false;
    }

    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void helloName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // 8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isLeapYear(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (isLeap) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
        return isLeap;
    }
}
