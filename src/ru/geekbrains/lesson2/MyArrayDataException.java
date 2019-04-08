package ru.geekbrains.lesson2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException (String message) { super("Ошибка формата ячейки:" + message);}
}
