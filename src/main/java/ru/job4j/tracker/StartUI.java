package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item bug = new Item("d");
        tracker.add(bug);
        System.out.println( tracker.findAll());

    }
}