package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ===");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter new name: ");
        Item editedItem = new Item(name);
        if (tracker.replace(id, editedItem)) {
            out.println("Item with ID " + id + " edited");
        } else {
            out.println("Item with ID " + id + " is not edited");
        }
        return true;
    }
}


