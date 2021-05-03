package lesson_7.oop;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        if (appetite <= plate.foodCount) {
            plate.decreaseFood(appetite);
            System.out.println(name + " покушал " + appetite + " корма");
            satiety = true;
            System.out.println(name + " теперь сыт!");
        } else {
            System.out.println("В миске мало еды!");
        }
    }
}
