package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select:"));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== All items ====");
                Item[] allItems = tracker.findAll();
                for (Item item : allItems) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                int id = Integer.valueOf(input.askStr("Enter id: "));
                System.out.print("Enter new name: ");
                String name = input.askStr("Enter new name: ");
                Item editedItem = new Item(name);
                if (tracker.replace(id, editedItem)) {
                    System.out.println("Item with ID " + id + " edited");
                } else {
                    System.out.println("Item with ID " + id + " is not edited");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                int id = Integer.valueOf(input.askStr("Enter id: "));
                if (tracker.delete(id)) {
                    System.out.println("Item with ID " + id + " removed");
                } else {
                    System.out.println("Item with ID " + id + " is not removed");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                int id = Integer.valueOf(input.askStr("Enter id: "));
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Items with this id was not found");
                }
            } else if (select == 5) {
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