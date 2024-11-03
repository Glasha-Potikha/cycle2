public class Main {
    public static void main(String[] args) {
        //Задача №1
        int savingsInTheBank = 0;
        int i = 0;
        while (savingsInTheBank < 2459000) {
            i++;
            savingsInTheBank += 15000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savingsInTheBank + " рублей");
        }
        System.out.println("Hello world!");
        //Задача №2
        i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задача №3
        int year = 0;
        int growth = 17 - 8;
        int numberOfPeople = 12000000;
        while (year < 10) {
            year++;
            numberOfPeople += ((numberOfPeople / 1000) * growth);
            System.out.println("Год " + year + ", численность населения составляет " + numberOfPeople);
        }
        //Задача №4
        int savings = 0;
        i = 0;
        while (savings < 12000000) {
            i++;
            savings += ((savings / 100) * 7);
            savings += 15000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }
        //Задача №5
        savings = 0;
        i = 0;
        while (savings < 12000000) {
            i++;
            savings += ((savings / 100) * 7);
            savings += 15000;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
            }
        }
        //Задача №6
        savings = 15000;
        i = 0;
        while (i < 108) {
            i++;
            savings += ((savings / 100) * 7);
           // savings += 15000;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
            }
        }
        //Задача №7
        int dayNumber = 4;
        for (int day = dayNumber; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");

        }
        //Задача №8
        int yearNow = 2024;
        year = yearNow - 200;
        while (year < yearNow + 100) {
            if (year % 79 == 0) {
                System.out.println(year);
                year += 79;
                continue;
            }
            year++;
        }

    }
}