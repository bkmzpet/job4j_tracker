package ru.job4j.tracker;
/**
 * Метод public Item[] findByName(String key) проверяет в цикле все элементы массива items, сравнивая name
 * (используя метод getName класса Item) с аргументом метода String key. Элементы, у которых совпадает name,
 * копирует в результирующий массив и возвращает его. Алгоритм этого метода аналогичен методу findAll.
 */

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findByName(String key) { //
        Item[] findByName = new Item[items.length];
        int j = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                findByName[j] = item;
                j++;
            }
        }
        return Arrays.copyOf(findByName, j);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item findAll() {
        Item[] findAll = new Item[items.length];
        int j = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                findAll[j] = item;
                j++;
            }
        }
        return findAll[j];
    }
}


