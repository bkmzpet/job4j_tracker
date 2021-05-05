package ru.job4j.poly;
import ru.job4j.tracker.Tracker;

import java.util.Scanner;
public class Bus implements Transport {
    @Override
    public void drive() {
        Bus drive = new Bus();

    }

    @Override
    public void passengers(String quantity) {
        Scanner input = new Scanner(System.in);
        System.out.print("Количесвто пассажиров? ");
        System.out.print(input);
    }

    @Override
    public float refuel(float fuel) {
        return fuel * 45;
    }
}
