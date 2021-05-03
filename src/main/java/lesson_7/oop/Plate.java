package lesson_7.oop;

public class Plate {

    protected int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void info() {
        if (foodCount >= 0) {
            System.out.println("Еды в миске: " + foodCount);
        } else {
            System.out.println("Еда закончилась...");
        }
    }

    public void decreaseFood(int count) {
        foodCount -= count;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount += foodCount;
    }
}
