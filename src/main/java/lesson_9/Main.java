package lesson_9;

import lesson_8.part1.Animal;
import lesson_8.part1.Cat;
import lesson_8.part1.Dog;
import lesson_8.part1.Duck;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        testThrow();
//        foo();
//        bar();
//        baz();
//        System.out.println(testFinally(6,2));
//        System.out.println(testFinally(6,0));

//        try {
//            readFile("text.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        danceAnimals();
    }

    private static void testThrow() {
        RuntimeException e = new ArithmeticException("Мы что-то сломали");
        System.out.println(e.getMessage());
//        e.printStackTrace();
        throw e;
    }

    private static void foo() {
        try {
            System.out.println(5/1);
            System.out.println(5/0);
            System.out.println(5/2);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Конец");
    }

    private static void bar() {
        int[] arr = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        int[] arrDivider = {2,5,0,1,4,0,1};

        try {
            doCycleFor(arr, arrDivider);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Выход за пределы массива!");
//            throw e; бросли ошибку которая не проверяется и которая пошла на JVM, а JVM все остановила
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void doCycleFor(int[] arr, int[] arrDivider) {
        for (int i = 0; i < arr.length; i++) {
            try {
                divideNumber(arr, arrDivider, i);
            } catch (ArithmeticException e) {
                arr[i] = -1;
                System.err.println("Произошло деление на ноль на индексе: " + i);
            }
        }
    }

    private static void divideNumber(int[] arr, int[] arrDivider, int i) {
        arr[i] /= arrDivider[i];
    }

    private static void baz() {
        int c = 0;
        int n = 0;


        try(Scanner scanner = new Scanner(System.in)) {
            c = Integer.parseInt(scanner.next());
            n = Integer.parseInt(scanner.next());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static int testFinally(int a, int b) {
        try {
            return a/b;
        } catch (Exception e) {
            return 0;
        } finally {     // finally выполниться в любом случае
            return  -1;
        }
    }

    private static void readFile(String fileName) throws IOException {
        String path = "src/main/resources/" + fileName;
        File file = new File(path);
        var is = new BufferedReader(new FileReader(path));
        System.out.println(new String(is.readLine()));

        var sb = new StringBuilder();
        int n;
        while ((n = is.read()) != 1) {
            sb.append((char)n);
        }
        System.out.println(sb);
    }

    private static void danceAnimals() {
        Animal[] animals = {new Dog(), new Duck(), new Cat(), new Duck(), new Cat()};

        int i = 1;
        for (Animal animal : animals) {
            try {
                if(animal instanceof Cat) {
                    throw new CatFoundException(i);
                }
                System.out.println(animal);
            } catch (CatFoundException e) {
                System.err.println(e.getMessage());;
            } finally {
                i++;
            }
        }
    }
}
