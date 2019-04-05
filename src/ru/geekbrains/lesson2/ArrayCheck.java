package ru.geekbrains.lesson2;

public class ArrayCheck {

    boolean isArraySizeA = false;
    boolean isArraySizeB = false;

    public void arrayCheck(int a, int b) throws MyArraySizeException {

        System.out.println("Задаем размер массива");

        if (a == 4) {
            if (b == 4) {
                isArraySizeB = true;
                System.out.println("Массив создан успешно");
            }
            isArraySizeA = true;
        } else {
            throw new MyArraySizeException("Массив не собран");
        }

        int c = 0;

        int array[][] = new int[a][b];

        for (int i = 0; i < (array.length); i++) {
            for (int j = 0; j < (array.length); j++) {
                System.out.print(c++ + " ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        ArrayCheck array = new ArrayCheck();

        try {
            array.arrayCheck(4, 40);
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Введенно корректное стороны а: " + array.isArraySizeA + "\nВведенно корректное стороны b: " + array.isArraySizeB);
        }


    }


}
