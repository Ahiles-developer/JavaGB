package lesson_5.homework;

/*
   Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
   Конструктор класса должен заполнять эти поля при создании объекта;
   Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
   Создать массив из 5 сотрудников
   Пример:
          Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
          persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
          // потом для каждой ячейки массива задаем объект
          persArray[1] = new Person(...);
          ...
          persArray[4] = new Person(...);

   С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
*/

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Джон Траволта", "Актер", "JohnT@mail", "234-3242-34",
                                1000000, 65);
        persons[1] = new Person("Олег Владимирович", "Директор", "oleg@mail",
                                "(999)-555-88-99", 250000, 50);
        persons[2] = new Person("Ольга Генадьевна", "Уборщица", "olgag@yandex",
                                "(876)-345-67-89", 35000, 45);
        persons[3] = new Person("Семен", "Менеджер", "semen@mail", "(675)-444-34-34",
                                40000, 30);
        persons[4] = new Person("Аристотель", "Философ", "podumai@sam", "345-345",
                                235235, 384322);

        for (Person person : persons) {
            if(person.getAge() > 40) {
                System.out.println(person + "\n");
            }
        }
    }
}
