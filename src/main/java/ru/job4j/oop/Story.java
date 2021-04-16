package ru.job4j.oop;

/**
 * Здесь мы создали три объекта, а ниже вызвали
 * методы у объектов и передали в них другие объекты.
 */
public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}

