public class Main {
    public static void main(String[] args) {

        ///Task 2


        int phoneVersion = 0;
        if (phoneVersion == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        int clientDeviceYear = 2014;
        int targetYear = 2015;
        if (clientDeviceYear < targetYear) {
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.print("Установите версию приложения для ");
        }
        if (phoneVersion == 1) {
            System.out.println("Android по ссылке");
        } else {
            System.out.println("IOS по ссылке");
        }


        ///Task 3

        int year = 2021;
        if (year % 4 == 0 && 100 != 0 || year % 400 == 0 && 100 != 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }

        ///Task 4 (Не придумал как сделать шаг по 40 дней, с этим заданием большие трудности)

        int deliveryDistance = 95;
        int day = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance <= startInterval) {
            day = 1;
        } else {
            day = day + (int) Math.ceil((deliveryDistance - startInterval) / interval) + 1;
        }
        System.out.println("Доставка займет " + day + " дня");


        ///Task 5
        int monthNumber = 3;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

        ///Task 6 *
        int age = 19;
        int salary = 58_000;
        if (age >= 23) {
            salary = salary * 3;
        } else {
            salary = salary * 2;
        }
        if (salary >= 50_000 || salary == 80_000) {
            salary = (int) (salary * 1.2);
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        } else {
            salary = (int) (salary * 1.5);
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        }

        ///Task 7 *

        int vozrast = 25;
        int zarplata = 60_000;
        int wantedSum = 330_000;
        int stavka = wantedSum + (wantedSum*10/100);
        int maxPlatej = zarplata / 2;               ///Максимальный платеж без учета скидки и доп процентов
        int maxMonth = wantedSum * 10 / 100 /12;     /// Стандартный платеж
        if (age <= 23){
            stavka = stavka + (wantedSum * 1 /100);
            maxMonth = stavka + maxPlatej;
            maxPlatej = stavka + maxPlatej;
        }
        if (age <= 30 && age >23){
            stavka = (int) (stavka + (wantedSum * 0.5 /100));
            maxMonth = stavka + maxPlatej;
            maxPlatej = stavka + maxPlatej;
        }
        if (salary > 80_000){
            stavka = (int) (stavka +(wantedSum * 0.7 /100));
            maxMonth = stavka + maxPlatej;
            maxPlatej = stavka + maxPlatej;
        }
        if (maxPlatej < maxMonth){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPlatej + " рублей. Платеж по кредиту "+ maxMonth + " рублей. Одобрено");
        }else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPlatej + " рублей. Платеж по кредиту "+ maxMonth + " рублей. Отказано");
        }
    }
}