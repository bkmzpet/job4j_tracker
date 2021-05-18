package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;

        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                if (rsl == -1) {
                    throw new ElementNotFoundException("Url could not be null");
                }

                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] list = {"df", "fdf"};
        try {
            indexOf(list, "fdf");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}