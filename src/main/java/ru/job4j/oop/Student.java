package ru.job4j.oop;

/**
 * petya.music();Вызываем метод music(),
 * используя переменную petya объекта класса Student.
 */

public class Student {

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student(); //объект student
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
