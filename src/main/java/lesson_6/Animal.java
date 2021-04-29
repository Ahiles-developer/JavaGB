package lesson_6;

// если создать метод public/protected/privat "final", то его уже нельзя будет переопределить
// для этого у метода должна быть железная логика

public abstract class Animal extends Object {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Animal(String name) {
        this(name, null, 0);
    }

    protected abstract void voice(); // обязаны реализовать данный метод в классах наследниках
                                     // так как он абстракный

    @Override
    public String toString() {
        return "Уважаемый " + name + '\'' + ", color='" + color + '\'' + ", age=" + age;
    }

    protected void run() {
        System.out.println("Животное побежало!");
    }
}
