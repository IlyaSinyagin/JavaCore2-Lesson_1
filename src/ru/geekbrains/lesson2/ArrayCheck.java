package ru.geekbrains.lesson2;

public class ArrayCheck {

    public void arrayCheck() throws MyArraySizeException, MyArrayDataException {

        int d = 0;

        int sizeArray = 4;

        String array[][] = {{"1", "2", "3", "4"},
                            {"1", "ккк", "3", "4"},
                            {"1", "2", "3", "4"},
                            {"1", "2", "3", "4"}};


        System.out.println("Задаем размер массива");

        if (array.length == sizeArray) {

            for (int i = 0; i < (array.length); i++) {
                if (array[i].length != sizeArray) {
                    throw new MyArraySizeException("!!!");
                }
                for (int j = 0; j < (array.length); j++) {
                    try {
                        d += Integer.parseInt(array[i][j]);

                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(" " + i + " " + j);
                    } finally {
                        System.out.print(array[i][j] + " ");
                    }
                }
                System.out.println();
            }
            System.out.println("Сумма чисел массива = " + d);
            System.out.println("Массив создан успешно");
        } else {
            throw new MyArraySizeException("");
        }
    }


    public static void main(String[] args) {

        ArrayCheck array = new ArrayCheck();

        try {
            array.arrayCheck();
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println();
            e.printStackTrace();
        }


    }


}
