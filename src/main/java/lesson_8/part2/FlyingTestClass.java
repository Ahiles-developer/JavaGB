package lesson_8.part2;

import lesson_8.part1.Flying;

public class FlyingTestClass implements Flying {
    @Override
    public void fly() {
        System.out.println("Каскадер полетел!");
    }
}
