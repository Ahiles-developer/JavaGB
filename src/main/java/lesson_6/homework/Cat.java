package lesson_6.homework;

public class Cat extends Animal {
    private String name;
    public static int catCount = 0;

    public Cat(String name) {
        super(name);
        this.name = name;
        catCount++;
    }

    @Override
    public void run(int run) {
        if (run <= 200) {
            System.out.println(name + " пробежал " + run + " м");
        } else {
            System.out.println(name + " столько не пробежит!");
        }
    }

    @Override
    public void swim(int swim) {
        System.out.println(name + " не умеет плавать!");
    }

    public int getCatCount() {
        return catCount;
    }
}
