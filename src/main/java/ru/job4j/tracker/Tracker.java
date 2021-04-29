package ru.job4j.tracker;
/**
 * добавление заявок - public Item add(Item item);
 * получение списка всех заявок - public Item[] findAll();
 * получение списка по имени - public Item[] findByName(String key);
 * получение заявки по id - public Item findById(int id);
 * Item[] items = new Item[100] содержит возможное количество заявлений.
 */

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100]; // количество заявлений
    private int ids = 1; //Поле ids используется для генерации нового ключа
    private int size = 0;

    public Item add(Item item) { // добавление заявок
        item.setId(ids++); // добавляем к объекту id
        items[size++] = item; // записываем в массив объект item
        return item;
        /**
         * В методе add нужно проставить уникальный ключ в объект Item item.
         * Это нужно сделать через метод setId.
         */
    }

    public Item[] findByName(String key) { //получение списка по имени
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

    public Item findById(int id) { //для поиска по id,
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() { //получение списка всех заявок
        Item[] findAll = new Item[items.length]; // Новый массив без null элементов
        int j = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                findAll[j] = item;
                j++;

            }
        }

        return Arrays.copyOf(findAll, j);
    }

    public boolean replace(int id, Item item) { // метод добавить и искать заявки
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items[index] = item;
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;

        }
        return rsl;
    }


}


