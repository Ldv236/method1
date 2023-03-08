import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2023;
        if (checkYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        System.out.println("Задача 2");
        int osVer = 1;
        int yearPhone = 2022;
        switch (chooseOsVersion(osVer, yearPhone)) {
            case 1:
                System.out.println("Установите облегченную версию для iOS");
                break;
            case 2:
                System.out.println("Установите полную версию для iOS");
                break;
            case 3:
                System.out.println("Установите облегченную версию для Andriod");
                break;
            case 4:
                System.out.println("Установите полную версию для Andriod");
                break;
            default:
                System.out.println("Такого варианта не предусмотрено");
        }


        System.out.println("Задача 3");
        int distance = 95;
        if (calculateDeliveryTime(distance) == 0) {
            System.out.println("Доставка не осуществляется на расстояние больше 100 км");
        } else {
            System.out.println("Delivery need days: " + calculateDeliveryTime(distance));
        }
    }

    public static boolean checkYear(int checkYear) {
        if (checkYear % 400 == 0) {
            return true;
        } else if (checkYear % 100 == 0) {
            return false;
        } else return checkYear % 4 == 0;
    }

    public static int chooseOsVersion(int clientOS, int year) {
        if (clientOS == 0) {
            if (year < LocalDate.now().getYear()) {
                return 1; //ios lite
            } else {
                return 2; //ios full
            }
        } else if (clientOS == 1) {
            if (year < LocalDate.now().getYear()) {
                return 3; //andriod lite
            } else {
                return 4; //andriod full
            }
        } else return 0; //I don't know
    }


    public static int calculateDeliveryTime(int km) {
        int timeToDelivery = 0;

        if (km < 20) {
            return timeToDelivery + 1;
        } else if (km < 60) {
            return timeToDelivery + 2;
        } else if (km < 100) {
            return timeToDelivery + 3;
        } else return 0;
    }
}
