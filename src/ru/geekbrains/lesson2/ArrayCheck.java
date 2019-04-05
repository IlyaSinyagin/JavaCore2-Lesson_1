package ru.geekbrains.lesson2;

public class ArrayCheck {

    boolean isArraySizeA = false;
    boolean isArraySizeB = false;


    public void arrayCheck() throws MyArraySizeException, MyArrayDataException {

        int c = 0;
        int d = 0;

//        int array[][] = new int[4][4];

        String array[][] = {{"1", "2", "3", "пр"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};


        System.out.println("Задаем размер массива");

        if (array.length == 4) {
            isArraySizeA = true;
        }

        if (array[0].length == 4) {
            isArraySizeB = true;
        }

        if (isArraySizeA && isArraySizeB) {

            for (int i = 0; i < (array.length); i++) {
                for (int j = 0; j < (array.length); j++) {
//                    c++;
//                    System.out.print(c + " ");
//                    d += c;
                    try {
                        d += Integer.parseInt(array[i][j]);


                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(" " + i + " " + j + " не верен");
                    } finally {
                        System.out.print(array[i][j] + " ");
                    }


                }
                System.out.println();
            }
            System.out.println("Сумма чисел массива = " + d);
            System.out.println("Массив создан успешно");

        } else {
            throw new MyArraySizeException("Массив не собран");
        }


    }


    public static void main(String[] args) {

        ArrayCheck array = new ArrayCheck();

        try {
            array.arrayCheck();
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Введенно корректное значение стороны а: " + array.isArraySizeA + "\nВведенно корректное значение стороны b: " + array.isArraySizeB);
        } catch (MyArrayDataException e) {
            System.out.println();
            e.printStackTrace();
        }


    }


}
