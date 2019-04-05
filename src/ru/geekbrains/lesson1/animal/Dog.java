package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participant;
import ru.geekbrains.lesson1.enums.Color;

public class Dog extends Animal implements Participant {

    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;

    public Dog(String name, Color color, int age, int runDistance, int jumpHeight, int swimDistance) {
        super(name, color, age);

        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }

    public Dog(String name, Color color) {
        super(name, color, 0);
    }


    @Override
    public void voice() {
        System.out.println("Гав");
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void run(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > runDistance) {
            isOnDistance = false;
        }
        System.out.println(String.format("Собака %s пробежала кросс длиной %d", getName(),distance));
        // TODO доработать по аналогии с классом Cat
    }

    @Override
    public void jump(int height) {
        if (!isOnDistance) {
            return;
        }
        if (height > jumpHeight) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Собака %s прыгнула в высоту на %d", getName(),height));
        // TODO доработать по аналогии с классом Cat
    }

    @Override
    public void swim(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > swimDistance) {
            isOnDistance = false;
        }
        System.out.println(String.format("Собака %s проплыла в динну %d", getName(),distance));
        // TODO доработать по аналогии с классом Cat
    }

    @Override
    public void getResult() {
        System.out.println(String.format("Кошка %s %sпрошла полосу препятствий",
                getName(), isOnDistance ? "" : " не"));
    }
}
