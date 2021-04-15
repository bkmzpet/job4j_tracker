package ru.job4j.oop;

/**
 *  Cat peppy = new Cat();Здесь мы создаем переменную
 *  типа Cat с именем peppy. Далее мы записываем в эту
 *  переменную объект типа Cat.
 *  Теперь у нас есть две переменные peppy и sparky, которые содержат разные области памяти.
 *  public String sound() В методе sound ключевое слово void мы заменили на тип String. Поэтому в конце метода мы должны
 *  использовать оператор return с указанием переменной типа String.
 */
public class Cat {
    public String sound() {
    String voice = "may-may";//создаем переменную String voice
    return voice;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();//Создали объект
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println(say);
    }
}
