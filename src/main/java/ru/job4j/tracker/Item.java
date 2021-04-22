package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item { //Класс Item описывает модель заявления.
    private int id; //это уникальный номер заявления.
    private String name; //содержит название заявления.

    public Item() { //Пустой конструктор

    }

    public Item(String name) { // Конуструктор имя
        this.name = name;
    }

    public Item(String name, int id) { // Конуструктор имя и айди
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}