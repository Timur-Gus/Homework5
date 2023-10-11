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

        System.out.println();
        System.out.println("Задача 5");
        System.out.println();

        int monthNumber = 12;

        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }}