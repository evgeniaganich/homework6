public class Main {
    public static void main(String[] args) {

        //task 1

            for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

            //task 2

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        //task3

        for (int i = 0; i < 17; i = i +2) {
            System.out.println(i);
        }

        //task4

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //task5

        int year = 1904;
        for (year = 1904; year <= 2096; year = year +4) {
            System.out.println(year + " год является високосным");
        }

        //task6

        for (int i = 7; i <= 98; i = i +7) {
            System.out.println(i);
        }

        //task 7

        for (int i = 1; i <= 512; i = i *2) {
            System.out.println(i);
        }

        //task8

        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        //task9

           for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}