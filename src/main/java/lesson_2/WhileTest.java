package lesson_2;

public class WhileTest {
    public static void main(String[] args) {

        int appleCount = 0;
        while (appleCount > 10) {
            System.out.println("111");
            appleCount--;
        }

        System.out.println(appleCount);

        do {
            System.out.println("222");
            appleCount++;
        } while (appleCount > 10);

        System.out.println(appleCount);
    }
}
