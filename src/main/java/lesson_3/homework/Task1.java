package lesson_3.homework;

import java.util.Random;
import java.util.Scanner;

/*
   Написать программу, которая загадывает случайное число от 0 до 9
   и пользователю дается 3 попытки угадать это число.
   При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
   чем загаданное, или меньше.
   После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */

public class Task1 {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        guessTheNumber();
    }

    private static void guessTheNumber() {
        do {
            int count = 0;
            int guess = 0;
            int number = random.nextInt(10);
            while (count < 3 && guess != number) {
                System.out.print("Угадайте число от 0 до 9");
                System.out.println();
                guess = in.nextInt();
                if (number == guess) {
                    System.out.println("Вы выиграли!");
                } else {
                    System.out.println("Ваше число " + ((guess > number) ? "больше." : "меньше."));
                    count++;
                }

            }
            if (count == 3)
                System.out.println("Вы проиграли!");
            System.out.print("Повторить игру еще раз?\n(1 - да / 0 - нет): ");
        } while (in.next().equals("1"));
    }
}
