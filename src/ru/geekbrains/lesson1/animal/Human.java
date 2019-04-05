package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participant;
import ru.geekbrains.lesson1.enums.Color;

public class Human extends Animal implements Participant {

    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    int swimDistance;


    public Human(String name, Color color, int age, int runDistance, int jumpHeight, int swimDistance) {
        super(name, color, age);

    this.isOnDistance = true;
    this.runDistance = runDistance;
    this.jumpHeight = jumpHeight;
    this.swimDistance = swimDistance;
    }

    public Human(String name, Color color) {
        super(name, color, 0);
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance; // TODO доработать по аналогии с классом Cat
    }

    @Override
    public void run(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > runDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Человек %s пробежал кросс длинной %d", getName(), distance));
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
        System.out.println(String.format("Человек %s прыгнул в высоту %d", getName(), height));
        // TODO доработать по аналогии с классом Cat
    }

    @Override
    public void swim(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > swimDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Человек %s проплыл в длинну %d", getName(), distance));
        // TODO доработать по аналогии с классом Cat
    }

    @Override
    public void voice() {
        System.out.println("Человек говорит");
        // TODO доработать по аналогии с классом Cat
    }

    @Override
    public void getResult() {
        System.out.println();
        System.out.println(String.format("Человек %s %s прошел полосу препятствий",
                getName(), isOnDistance ? "" : " не"));
    }
}
