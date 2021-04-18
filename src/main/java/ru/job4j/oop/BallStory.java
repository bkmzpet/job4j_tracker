package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball(); //колобок
        Hare hare = new Hare(); // заяц
        Fox fox = new Fox(); // лиса
        Wolf wolf = new Wolf(); // волк
        hare.tryEat(ball);
        ball.run(hare);
        wolf.tryEat(ball);
        ball.run(wolf);
        fox.eat(ball);
        ball.end(ball);

    }
}
