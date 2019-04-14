package ru.geekbrains.lesson2;

public class MyArraySizeException extends Exception {

    public MyArraySizeException (String message) { super("Ошибка в размере массива" + message);}
}
