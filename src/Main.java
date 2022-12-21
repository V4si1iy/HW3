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
    public static void task1()
    {
        System.out.println("Задание №1");
        int initialInt = 1;
        byte initialByte = 1;
        short initialShort = 1;
        long initialLong = 1L;
        float initialFloat = 1F;
        double initialDouble = 1;
        System.out.println(initialInt + " " +  initialByte + " " +  initialShort + " " + initialLong + " " + initialFloat + " " + initialDouble);
    }
    public static void task2()
    {
        System.out.println("Задание №2");
        float firstNumber = 27.12F;
        long secondNumber = 987678965549L;
        float thirdNumber = 2.786F;
        short fourthNumber = 569;
        short fifthNumber = -159;
        short sixthNumber = 27897;
        byte seventhNumber = 67;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);
        System.out.println(fifthNumber);
        System.out.println(sixthNumber);
        System.out.println(seventhNumber);
    }
    public static void task3()
    {
        System.out.println("Задание №3");
        byte countPupilsLudmila = 23;
        byte countPupilsAnna = 27;
        byte countPupilsKaty = 30;
        byte countAllPupils = (byte)(countPupilsKaty + countPupilsLudmila + countPupilsAnna);
        short allPaper = 480;
        byte onePupilPaper = (byte)(allPaper/countAllPupils);
        System.out.println("На каждого ученика рассчитано " + onePupilPaper + " листов бумаги");

    }
    public static void task4()
    {
        System.out.println("Задание №4");
        byte bottlesInTime = 16;
        byte machineTime = 2;
        byte work20min = 20;
        short work1day = 24 * 60;
        short work3days = 3 * 24 * 60;
        int work1month = 31 * 24 * 60;
        System.out.println("За 20 мин машина произвела " + (work20min/machineTime * bottlesInTime) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (work1day/machineTime * bottlesInTime) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (work3days/machineTime * bottlesInTime) + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + (work1month/machineTime * bottlesInTime) + " штук бутылок");

    }
    public static void task5()
    {
        System.out.println("Задание №5");
        byte whiteOneClass = 2;
        byte brownOneClass = 4;
        byte sumOneClass = (byte) (whiteOneClass + brownOneClass);
        byte sumOneSchool = 120;
        System.out.println("В школе, где " + (sumOneSchool/sumOneClass) + " классов, нужно " + (sumOneSchool/sumOneClass)*whiteOneClass + " банок белой краски и " + (sumOneSchool/sumOneClass)*brownOneClass + " банок коричневой краски" );
    }
    public static void task6()
    {
        System.out.println("Задание №6");
        byte countBananas = 5;
        short countMilk = 200;
        byte countIceCream = 2;
        byte countEggs = 4;
        short weightBanana =(short)(countBananas * 80);
        short weightMilk = (short) (countMilk / 100 * 105);
        short weightIceCream = (short) (countIceCream * 100);
        short weightEggs = (short) (countEggs*70);
        short allWeightGr = (short) (weightEggs + weightBanana + weightIceCream + weightMilk);
        float allWeightKg = (float) allWeightGr / 1000;
        System.out.println(allWeightGr + " " + allWeightKg);
    }
    public static void task7()
    {
        System.out.println("Задание №7");
        short needToGoal = 7;
        needToGoal*=1000;
        short firstLoseWeight = 250;
        short secondLoseWeight = 500;
        System.out.println(needToGoal/firstLoseWeight);
        System.out.println(needToGoal/secondLoseWeight);
        System.out.println((needToGoal/firstLoseWeight + needToGoal/secondLoseWeight)/2);
    }
    public static void task8()
    {
        System.out.println("Задание №8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int yearSalaryMasha = salaryMasha * 12;
        int yearSalaryDenis = salaryDenis * 12;
        int yearSalaryKristina = salaryKristina * 12;
        salaryMasha+= salaryMasha * 10 / 100;
        salaryKristina+= salaryKristina * 10 / 100;
        salaryDenis+= salaryDenis * 10 / 100;
        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + (salaryMasha * 12 - yearSalaryMasha) + " рублей");
        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + (salaryDenis * 12 - yearSalaryDenis) + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristina + " рублей. Годовой доход вырос на " + (salaryKristina * 12 - yearSalaryKristina) + " рублей");

    }
}