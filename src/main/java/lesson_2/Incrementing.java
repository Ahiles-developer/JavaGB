package lesson_2;

public class Incrementing {
    public static void main(String[] args) {
//      test1();
//      test2();
//      test3();
    }

    private static void test1() {
        int c = 0;
        System.out.println(c++);   // c = 0; sout; ++ ; c = 1
        System.out.println(++c);   // c = 1; ++; c = 2; sout
        System.out.println(c--);   // c = 2; sout; --; c = 1
        System.out.println(--c);   // c = 1; --; c = 0; sout
        System.out.println(c + 1); // c = 0; c + 1 => sout; c = 0
        System.out.println(c);     // c = 0
    }

    private static void test2() {
        int a = 5;
        int b = 5;

        int resultOne = 2 * ++a;
        int resultTwo = 2 * b++;

        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(a + " " + b);
    }

    public static void test3 () {
        int c = 1;
        System.out.println(c++ + c); //1 + 2
        System.out.println(++c + c); //6 ; c = 3
        System.out.println(c + c++); //6; c = 4
        c += ++c + c; // 4 += 5 + 5 => 14
        System.out.println(c);
    }
}

