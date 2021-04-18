package ru.job4j.oop;

/**
 * Конструктор - это специальный метод, который вызывается при создании нового объекта
 * По сути конструктор нужен для автоматической инициализации переменных.
 * Конструкторы вызываются при создании нового объекта нашего класса.
 * Имя конструктора совпадает с именем класса, в том числе и соблюдая регистр,
 * при этом синтаксически конструктор похож на метод без возвращаемого значения.
 * = new Computer() что стоит после оператора new и есть вызова конструктора
 * дефолтный конструктор или конструктор по умолчанию.
 * Для создания объекта Computer мы используем выражение new Computer(). При этом оператор
 * new выделяет память для нашего объекта computer типа Computer.
 * На следующем этапе происходит вызов конструктора по умолчанию, который
 * не принимает никаких параметров.
 * После выполнения этого выражения в памяти будет выделен участок памяти,
 * где будут храниться все данные нашего объекта.
 * А в переменную computer будет записана ссылка на созданный объект.
 * Вместо этого подхода мы создадим конструктор, который будет принимать
 * 3 параметра и записывать их в наши поля.
 * Выглядит это следующим образом:
 */
public class Computer {

    private boolean multiMonitor; //поля

    private int ssd; //поля

    private String cpu; //поля

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer() {
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor); //Добавим метод,
        System.out.println("SSD: " + ssd + " GB"); // который будет выводить в консоль
        System.out.println("Модель CPU: " + cpu); //содержимое наших полей:
    }

    public static void main(String[] args) {
        Computer computer = new Computer(true, 500, "Intel Core I7-10700K");
        Computer computer1 = new Computer();
        computer.printInfo();
    }
}
/*
  При этом такой подход уже дает нам гибкость,
  и мы можем создавать сколько угодно объектов с разным состоянием
  – например создадим следующий объект:
 */
