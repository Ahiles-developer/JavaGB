package lesson_6.homework;

public class Dog extends Animal {
    private String name;
    public static int dogCount = 0;

    public Dog(String name) {
        super(name);
        this.name = name;
        dogCount++;
    }

    @Override
    public void run(int run) {
        if (run <= 500) {
            System.out.println(name + " пробежал " + run + " м");
        } else {
            System.out.println(name + " больше не может бежать!");
        }
    }

    @Override
    public void swim(int swim) {
        if (swim <= 10) {
            System.out.println(name + " проплыл " + swim + " м");
        }
    }

    public int getDogCount() {
        return dogCount;
    }
}
