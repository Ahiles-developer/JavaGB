package lesson_6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мартин");
        Dog dog = new Dog("Гендальф", "Серый", 10, false);
        Duck duck = new Duck("Дональд Дак");
//        Animal animal = new Animal("Чудо-юдо");

//        duck.fly();

        Animal[] animals = {cat, duck, dog}; // пример полиморфизма, обобщили до типа Animal

        for (Animal animal : animals) {
            animal.voice();
            if (animal instanceof Duck) { // животное привели к типу Duck, и теперь можно вызвать метод "fly"
                Duck trueDuck = (Duck)animal;
                trueDuck.fly();
            }

            if (animal instanceof Duck realDuck) { // тот же код, что и выше, но короче
                realDuck.fly();
            }
        }

        Object[] objects = {
          new int[]{1,1,1,1},
          new String("Строка"),
          new Random(),
          cat
        };

        for (Object object : objects) {
            System.out.println(object.toString());
        }

//        cat.voice();
//        dog.voice();

//        System.out.println(dog);

//        doAction(cat);
//        doAction(dog);
    }

    private static void doAction(Animal animal) { // используется полиморфизм
        animal.voice();
        animal.run();
    }


}
