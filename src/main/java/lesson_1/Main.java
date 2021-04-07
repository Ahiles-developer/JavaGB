package lesson_1;

/**
 * Урок 1. Введение
 */

public class Main {
    public static void main(String[] args) {
//        printHello();
//        testVars();
//        sumVarsAndPrint(4,  6);
//        testCalculateSalary();
//        testCheckAppraisal();
        testStringFormat();
    }

    private static void testStringFormat() {
        System.out.printf("int: %3d, double: %.1f%nstring: %s", 225, 8.8, "Hello");
    }

    public static void printHello() {
        System.out.println("Вывод текста");
    }

    private static void testVars() {
        int varA;
        varA = 9;
        int varB = 5;
        System.out.println(1.0 * varA / varB);

        double doubleVarA = 9;
        double doubleVarB = 5;
        System.out.println(doubleVarA % doubleVarB);

        char chr1 = '☺';
        char chr2 = 15000;

        System.out.println(chr1);
        System.out.println(chr2);

        boolean isRed = true;
        isRed = false;

        String helloStr = "Hello";
        String worldStr = "world";
        System.out.println(helloStr + " " + worldStr);
        System.out.println(helloStr + 5 + 6);
        System.out.println(helloStr + (5 + 6));

        ++varA;
        varA++;

        varA += 7; //varA + 7

    }

    private static void sumVarsAndPrint(int a, int b) {
        System.out.println(a + b);
    }

    private static void testCalculateSalary() {
        final int TAX_RUSSIA = 13;
        int salary1 = calculateSalary(100000, TAX_RUSSIA);
        int salary2 = calculateSalary(25000, TAX_RUSSIA);
        int salary3 = calculateSalary(500000, 15);
        System.out.println(salary1 + salary2 + salary3);
    }

    private static int calculateSalary(int salary, int tax) {
        int salaryAfterTax = (int) (salary - salary * tax / 100);
        return salaryAfterTax;
    }

    private static void testCheckAppraisal() {
        checkAppraisal(5);
        checkAppraisal(4);
        checkAppraisal(3);
        checkAppraisal(2);
        checkAppraisal(1);
        checkAppraisal(0);
        checkAppraisal(-1);
        checkAppraisal(6);
    }

    private static void checkAppraisal(int appraisal) {
//        System.out.print("Ученик получил оценку : " + appraisal + " -- ");
        System.out.printf("Ученик получил оценку: %d -- ", appraisal);

        if (appraisal == 5) {
            System.out.println("Молодец! Так держать!");
        } else if (appraisal == 4) {
            System.out.println("Неплохо, но ты можешь лучше");
//        } else if(appraisal == 3 || appraisal == 2 || appraisal == 1) {
        } else if (appraisal >= 1 && appraisal <= 3) {
            System.out.println("Готовь уроки лучше!");
//        } else if(appraisal > 5 || appraisal < 1) {
        } else {
            System.out.println("Не мухлюй! Говори правду!");
        }
    }
}