public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        byte apples = 3;
        short oranges = 235;
        int bananas = 33000;
        long pears = 2148000000L;
        float paper = 1.8F;
        double books = 5.34;
        System.out.println("Значение переменной apples с типом byte равно " + apples);
        System.out.println("Значение переменной oranges с типом short равно " + oranges);
        System.out.println("Значение переменной bananas с типом int равно " + bananas);
        System.out.println("Значение переменной pears с типом long равно " + pears);
        System.out.println("Значение переменной paper с типом float равно " + paper);
        System.out.println("Значение переменной books с типом double равно " + books);
    }

    public static void task2 () {
        System.out.println("Задача 2");

        byte apples = 67;
        short oranges = -159;
        short bananas = 569;
        int apricot = 27897;
        long pears = 987678965549L;
        float paper = 2.786F;
        double books = 27.12;
        System.out.println("Значение переменной apples с типом byte равно " + apples);
        System.out.println("Значение переменной oranges с типом short равно " + oranges);
        System.out.println("Значение переменной bananas с типом short равно " + bananas);
        System.out.println("Значение переменной apricot с типом int равно " + apricot);
        System.out.println("Значение переменной pears с типом long равно " + pears);
        System.out.println("Значение переменной paper с типом float равно " + paper);
        System.out.println("Значение переменной books с типом double равно " + books);
    }
    public static void task3 () {
        System.out.println("Задача 3");

        byte lPStudents = 23;
        byte aSStudents = 27;
        byte eAStudents = 30;
        int totalStudents = lPStudents + aSStudents + eAStudents;
        int totalPaper = 480;
        int studentPaper = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int capacity = 16 / 2;
        int min20 = capacity * 20;
        int oneDay = capacity * 24 * 60;
        int threeDays = capacity * 24 * 3 * 60;
        int oneMonth = capacity * 60 * 24 * 30;
        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + oneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + oneMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");

        byte tinsOfWhitePaint = 2;
        byte tinsOfBrownPaint = 4;
        int tinsFor1Class = tinsOfBrownPaint + tinsOfWhitePaint;
        byte totalTins = 120;
        int totalClassrooms = totalTins / tinsFor1Class;
        int totalWhitePaint = tinsOfWhitePaint * totalClassrooms;
        int totalBrownPaint = tinsOfBrownPaint * totalClassrooms;
        System.out.println("В школе, где " + totalClassrooms + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");

        int bananas = 5;
        int bananaWeight = 80;
        int milk100Ml = 2;
        int milkWeight = 105;
        int iceCream = 2;
        int iceCreamWeight = 100;
        int eggs = 4;
        int eggsWeight = 70;
        int totalWeightInGr = bananaWeight * bananas + milkWeight * milk100Ml + iceCreamWeight * iceCream + eggsWeight * eggs;
        float totalWeightInKg = ((float)totalWeightInGr / 1000);
        System.out.println(totalWeightInGr);
        System.out.println(totalWeightInKg);
    }
    public static void task7 () {
        System.out.println("Задача 7");

        int totalWeight = 7000;
        int days250 = totalWeight / 250;
        System.out.println("На похудение уйдет " + days250 + " дней, если спортсмен будет терять каждый день по 250 грамм");
        int days500 = totalWeight / 500;
        System.out.println("На похудение уйдет " + days500 + " дней, если спортсмен будет терять каждый день по 500 грамм");
        int daysAverage = (days250 + days500) / 2;
        System.out.println("В среднем на похудение может потребоваться " + daysAverage + " день/дней");
    }
    public static void task8 () {
        System.out.println("Задача 8");

        int mashaSalary = 67760;
        int mashaNewSalary = (int) (mashaSalary + mashaSalary * 0.1);
        int mashaYear = mashaSalary * 12;
        int mashaYearNew = mashaNewSalary * 12;
        int mashaDifference = mashaYearNew - mashaYear;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        int denisSalary = 83690;
        int denisNewSalary = (int) (denisSalary + denisSalary * 0.1);
        int denisYear = denisSalary * 12;
        int denisYearNew = denisNewSalary * 12;
        int denisDifference = denisYearNew- denisYear;
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        int christinaSalary = 76230;
        int christinaNewSalary = (int) (christinaSalary + christinaSalary * 0.1);
        int christinaYear = christinaSalary * 12;
        int christinaYearNew = christinaNewSalary * 12;
        int christinaDifference = christinaYearNew- christinaYear;
        System.out.println("Кристина теперь получает " + christinaNewSalary + " рублей. Годовой доход вырос на " + christinaDifference + " рублей");
    }
}