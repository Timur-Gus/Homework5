public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println();

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println("Задача 2");
        System.out.println();

        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println("Задача 3");
        System.out.println();

        int year = 2021;
        if ((year >= 1584 && year % 4 == 0 && year % 100 != 0) || (year >= 1584 && year % 4 == 0 && year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }}