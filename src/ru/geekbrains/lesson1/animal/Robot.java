package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participant;

/**
 * Робот не является животным, но может учавствовать в соревнованиях
 * так как реализует интерфейс {@link Participant}
 */
public class Robot implements Participant {

    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;

    private String name;

    public Robot(String name, int runDistance, int jumpHeight, int swimDistance) {
        this.name = name;
        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
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
        System.out.println(String.format("Робот %s пробежал кросс длиной %d", name, distance));
        // TODO доработать по аналогии с классами животных
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
        System.out.println(String.format("Робот %s прыгнул в высоту на %d", name, height));
        // TODO доработать по аналогии с классами животных
    }

    @Override
    public void swim(int distance) {
        isOnDistance = false;
        System.out.println("Данный робот не умеет плавать");
        // TODO доработать по аналогии с классами животных
    }

    @Override
    public void getResult() {
            System.out.println(String.format("Робот %s %s прошел полосу препятствий",
                    name, isOnDistance ? "" : " не"));
    }
}
