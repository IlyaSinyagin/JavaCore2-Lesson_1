package ru.geekbrains.lesson5;

public class MainClass {

    static final int size = 10_000_000;
    static final int h = size / 2;

    public static void main(String[] args) {

        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        // Метод №1 - просто бежит по массиву и вычисляет значения

        long a = System.nanoTime();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < size; i++) {
                    arr[i] = 1;
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        System.out.println("Метод №1 - " + (System.nanoTime() - a));

        // Метод №2 - разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один
        long c = System.nanoTime();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.arraycopy(arr, 0, a1, 0, h);
                System.arraycopy(arr, h, a2, 0, h);

                Thread t2r1 = new Thread(new Runnable() {
                    @Override
                    public synchronized void run() {
                        for (int i = 0; i < h; i++) {
                            a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                        }
                    }
                });
                Thread t2r2 = new Thread((new Runnable() {
                    @Override
                    public synchronized void run() {
                        for (int i = 0; i < h; i++) {
                            a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                        }
                    }
                }));
                System.arraycopy(a1, 0, arr, 0, h);
                System.arraycopy(a2, 0, arr, h, h);

            }
        });
        System.out.println("Метод №2 - " + (System.nanoTime() - c));

    }
}
