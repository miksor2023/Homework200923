public class Main {
    public static void main(String[] args) {
        //
        //задача 1
        System.out.println("\nЗадача1");
        checkLeapYear(2000);
        //
        //задача 2
        System.out.println("\nЗадача 2");
        chooseAppVersion(1, 2010);
        //
        //задача 3
        System.out.println("\nЗадача 3");
        int deliveryTime = getDeliveryTime(15);
        if (deliveryTime == 0) {
            System.out.println("Доставка невозможна");
        } else {
            System.out.println("Доставка займёт " + deliveryTime + " дня");
        }
    }
    public static void checkLeapYear(int year) {
        if (year >= 1584 && year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static void chooseAppVersion(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static int getDeliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
}

