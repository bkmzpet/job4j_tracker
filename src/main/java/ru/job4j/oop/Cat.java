package ru.job4j.oop;

/**
 * Cat peppy = new Cat();Здесь мы создаем переменную
 * типа Cat с именем peppy. Далее мы записываем в эту
 * переменную объект типа Cat.
 * Теперь у нас есть две переменные peppy и sparky, которые содержат разные области памяти.
 * public String sound() В методе sound ключевое слово void мы заменили на тип String. Поэтому в конце метода мы должны
 * использовать оператор return с указанием переменной типа String.
 * Для того, чтобы мы могли использовать память нашего объекта нам нужно создать поля.
 * Термин "поле" обозначает переменную, которая связана с объектом.
 * public void show()метод void show(), который будет выводить в консоль содержимое поля food.
 * Для того, чтобы обратиться к полю объекта, нам нужно использовать ключевое слово this.
 * this.food = meat;// записывает в поле объект food значение переменной meat.
 * Значение переменной meat присваивается в методе main
 */
public class Cat {
    private String food; //Здесь мы создали поле класса Cat, которое называется food.
    private String name;

    public void show() {
        System.out.println(this.name + " ate " + this.food);
    }

    public void eat(String meat) {
        this.food = meat; // записывает в поле объект food значение переменной meat.
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public String sound() {
        String voice = "may-may"; //создаем переменную String voice
        return voice;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat(); //Создали объект
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Gav");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("black");
        black.show(); //чтобы выполнить метод объекта, нужно обратиться к имени переменой объекта

    }
}
