package lesson_6.homework;
/*
    1. Создать классы Собака и Кот с наследованием от класса Животное.
    2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
    Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
    3. У каждого животного есть ограничения на действия
    (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
    4.* Добавить подсчет созданных котов, собак и животных.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Котзилла");
        Cat cat1 = new Cat("Кот");
        Dog dog = new Dog("Лютыйпес");

        System.out.println("Всего котов: " + cat.getCatCount());
        System.out.println("Всего собак: " + dog.getDogCount());
        System.out.println("Всего животных: " + Animal.animalCount);

        System.out.println();

        cat.run(150);
        cat.swim(100);
        dog.run(300);
        dog.swim(5);
        cat1.run(210);
    }
}
