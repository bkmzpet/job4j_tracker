package ru.job4j.oop;

/**
 * Методы add - являются перегруженными. Это механизм позволяет
 *  сделать более удобным использование объекта Calculator.
 *
 *
 */
public class Calculator {
    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return first + second + third;
    }
}

