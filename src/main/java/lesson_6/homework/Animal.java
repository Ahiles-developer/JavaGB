package lesson_6.homework;

public abstract class Animal {
    private String name;
    public static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int run) {
    }

    public void swim(int swim) {
    }

}
