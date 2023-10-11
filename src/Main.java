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

        System.out.println();
        System.out.println("Задача 4");
        System.out.println();

        int deliveryDistance = 95;
        int deliveryTime = 1;

        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if(deliveryDistance >= 20 && deliveryDistance < 60){
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if(deliveryDistance >= 60 && deliveryDistance < 100){
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else {
            System.out.println("Доставки нет");
        }
    }}