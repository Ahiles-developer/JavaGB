package lesson_5;

import java.util.Locale;

public class Cat {
    private static int catsCount = 0;

    private String name;
    protected String color;
    private int age;

    public static int getCatsCount() {
        return catsCount;
    }

    public Cat(String name, String color, int age) {
        this.name = name.toUpperCase();
        this.color = color;
        this.age = age;
        catsCount++;
    }

    public Cat(String name) {
        this(name, "Серобурмалиновый", 0);
    }

    void voice() {
        System.out.println("Котик " + name + " сказал: \"Мяу!\"");
    }

    public void printInfo() {
        System.out.println(this); // работает toString - this.toString
    }

    public String toString() {
        return String.format("Котик %s имеет %s цвет и его возраст: %d", name, color, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 30) {
            this.age = age;
        } else {
            System.err.println("Неверный ввод возраста");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Котик " + name + " сбежал");
        catsCount--;
    }
}
