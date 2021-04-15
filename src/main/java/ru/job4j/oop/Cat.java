package ru.job4j.oop;

/**
 *  Cat peppy = new Cat();Здесь мы создаем переменную
 *  типа Cat с именем peppy. Далее мы записываем в эту
 *  переменную объект типа Cat.
 *  Теперь у нас есть две переменные peppy и sparky, которые содержат разные области памяти.
 */
public class Cat {
    public static void main(String[] args) {
        Cat peppy = new Cat();//Создали объект
        Cat sparky = new Cat();
    }
}
