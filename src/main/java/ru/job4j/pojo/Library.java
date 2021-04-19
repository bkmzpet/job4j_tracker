package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book dostoevsky = new Book("Преступлние и наказание", 331);
        Book chekhov = new Book("Вешневый сад", 558);
        Book job4j = new Book("Clean code", 111);
        Book tolstoy = new Book("Война и мир", 1300);
        Book[] books = new Book[4];
        books[0] = dostoevsky;
        books[1] = chekhov;
        books[2] = job4j;
        books[3] = tolstoy;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Replace 0 -> 3");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Shown only books with name Clean Code");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}
