package ru.job4j.oop;

/**
 *С помощью одного класса мы распишем взаимодействие двух объектов.
 *public void pour(Jar another)Теперь давайте добавим в него метод, который будет принимать объект типа Jar.
 * Так же напишем метод main с демонстрацией работы.
 *
 *
 */
public class Jar {
    private int value;//В поле будет содержаться количество воды.

    public Jar(int size) {//конструктор для инициализации начального состояния сосуда.
        this.value = size;
    }
    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);

    }
}

