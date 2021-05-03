package lesson_7.oop;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Plate plate = new Plate(100);
        plate.info();

       Cat[] cats = new Cat[3];
       cats[0] = new Cat("Олег", 30, false);
       cats[1] = new Cat("Пельмень", 20, false);
       cats[2] = new Cat("Йошимура", 50, false);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println();
        }

        plate.info();
        plate.setFoodCount(200);
        plate.info();
    }
}
