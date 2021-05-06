package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void allItems(Input input, Tracker tracker) {
        System.out.println("=== All items ====");
        Item[] allItems = tracker.findAll();
        for (Item item : allItems) {
            System.out.println(item);
        }
    }

    public static void replace(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        int id = Integer.valueOf(input.askStr("Enter id: "));
        String name = input.askStr("Enter new name: ");
        Item editedItem = new Item(name);
        if (tracker.replace(id, editedItem)) {
            System.out.println("Item with ID " + id + " edited");
        } else {
            System.out.println("Item with ID " + id + " is not edited");
        }
    }

    public static void delete(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = Integer.valueOf(input.askStr("Enter id: "));
        if (tracker.delete(id)) {
            System.out.println("Item with ID " + id + " removed");
        } else {
            System.out.println("Item with ID " + id + " is not removed");
        }
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        int id = Integer.valueOf(input.askStr("Enter id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Items with this id was not found");
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ===");
        String name = input.askStr("Enter new name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("No items with this name were found");
        }
    }


    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.allItems(input, tracker);
            } else if (select == 2) {
                StartUI.replace(input, tracker);
            } else if (select == 3) {
                StartUI.delete(input, tracker);
            } else if (select == 4) {
                StartUI.findById(input, tracker);
            } else if (select == 5) {
                StartUI.findByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }


    private void showMenu() { //вывод меню
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items"); //
        System.out.println("2. Edit item"); //
        System.out.println("3. Delete item"); //
        System.out.println("4. Find item by Id"); //
        System.out.println("5. Find items by name"); //
        System.out.println("6. Exit Program"); //
        /* добавить остальные пункты меню. */
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }

}