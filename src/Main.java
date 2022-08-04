import java.time.LocalDate;
import java.util.Scanner;

public class Main {


    public static void calculationOfTheYear(int leadTheYear) {


        if (leadTheYear % 4 == 0 || leadTheYear % 400 < 0) {
            System.out.println(leadTheYear + " Год високосный");
        } else {
            System.out.println(leadTheYear + " Год не является високосным");
        }
    }

    public static void shellAndYear(int clientOS, int clientDeviceYear) {

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке ");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке ");
        } else
            System.out.println("У Вас скорее всего Windows Phone");
    }


    public static void calculationOfDistanceAndTimeDependence(int deliveryDistance) {

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance <= 60 || deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Обратитесь в ближайшее отделение банка, слишком большое расстояние))");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
// Задание 1
        int enterTheYear = 2001;
        calculationOfTheYear(enterTheYear);

        System.out.println("Задание 2");

        // Задание 2
        int ios = 0;
        int android = 1;
        int clientOS = 1;
        int clientDeviceYear = 2001 ;

        shellAndYear(clientOS, clientDeviceYear);

        System.out.println("Задание 3");

        //Задание 3

        int deliveryDistance = 70 ;
        calculationOfDistanceAndTimeDependence(deliveryDistance);

    }
}