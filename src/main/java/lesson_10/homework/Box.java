package lesson_10.homework;

import lesson_10.test.B;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> box = new ArrayList<>();

    public Box() {
    }

    public float getWeight() {
        float weight = 0.0f;

        for (T t : box) {
            weight += t.getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox) {
        if (getWeight() == anotherBox.getWeight()) return true;
        return false;
    }

    public void addFruit(T fruit, int count) {
        for (int i = 0; i < count; i++) {
            box.add(fruit);
        }
    }
}
