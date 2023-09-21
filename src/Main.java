public class Main {
    public static void main(String[] args) {
        //
        //задача 1
        System.out.println("\nЗадача1");
        checkLeapYear(2000);
    }
    public static void checkLeapYear(int year) {
        if (year >= 1584 && year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

}

