package lesson_5.homework;

public class Person {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this);
    }

    public String toString() {
        return String.format("Имя сотрудника: %s%n" +
                             "Должность: %s%n" +
                             "Email: %s%n" +
                             "Номер телефона: %s%n" +
                             "Заработная плата: %d%n" +
                             "Возраст: %d", name, position, email, phoneNumber, salary, age);
    }

    public int getAge() {
        return age;
    }
}
