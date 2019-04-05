package ru.geekbrains.lesson2;

public class ArrayCheck {

    boolean isArraySizeA = false;
    boolean isArraySizeB = false;


    public void arrayCheck(int a, int b) throws MyArraySizeException {

        int c = 0;

        int array[][] = new int[a][b];

        System.out.println("Задаем размер массива");

        if (a == 4) {
            isArraySizeA = true;
        }

        if (b == 4) {
            isArraySizeB = true;
        }

        if (isArraySizeA && isArraySizeB) {

            for (int i = 0; i < (array.length); i++) {
                for (int j = 0; j < (array.length); j++) {
                    System.out.print(c++ + " ");
                }
                System.out.println();
            }

            System.out.println("Массив создан успешно");

        } else {
            throw new MyArraySizeException("Массив не собран");
        }


    }


    public static void main(String[] args) {

        ArrayCheck array = new ArrayCheck();

        try {
            array.arrayCheck(4, 5);
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Введенно корректное значение стороны а: " + array.isArraySizeA + "\nВведенно корректное значение стороны b: " + array.isArraySizeB);
        }


    }


}
