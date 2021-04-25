package lesson_5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Мартин Лютер Кот", "Афрокот", 2);
        System.out.println(Cat.getCatsCount());
        Cat cat2 = new Cat("Борис Николаевич", "Рыжий", 4);
        System.out.println(Cat.getCatsCount());
        Cat cat3 = new Cat("Шава");
        System.out.println(Cat.getCatsCount());

//        cat1.voice();
//        cat2.voice();

        var cat4 = new Cat("Засланец");
        cat4 = null;
        System.gc();

        cat1.printInfo();
        cat2.printInfo();
        cat3.printInfo();

        var random = new Random();

        System.out.println(cat1);
        System.out.println("Котик 1 = " + cat1);

//        cat1.age = -1; так делать не нужно
        cat3.setAge(-1);

        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats) {
            cat.voice();
        }


        System.out.println("Всего котиков осталось: " + Cat.getCatsCount());

    }
}
