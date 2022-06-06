public class HomeWork {
    public static void main(String[] args) {
        //Exercise 1

        byte answer= -14;
        short countOfCats = 333;
        int window = 2;
        long innNumber = 912923012930192L;
        float answerAfterDo = 0.302120120f;
        double money = 221_819.99;
        char mark = 33;
        boolean isHaveMoney = money > 100000;

        //Exercise 2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double sumWeight = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;

        System.out.println("Сумарный вес боксеров " + sumWeight + " кг");
        System.out.println("Разница в весе составляет " + weightDifference + " кг");

        //Exercise 3

        int countBananas = 5;
        int bananasWeight = 80;

        int countMilk = 2;
        int milkWeight = 105;

        int countIceCreame = 2;
        int iceCreameWeight = 100;

        int countEggs = 4;
        int eggsWeight = 70;

        int bananas = countBananas * bananasWeight;
        int milk = countMilk * milkWeight;
        int iceCreame = countIceCreame * iceCreameWeight;
        int eggs = countEggs * eggsWeight;

        double weight = bananas + milk + iceCreame + eggs;
        double weightKilo = weight / 1000;

        System.out.println("Вес спорт-завтрака " + weightKilo + " кг");

        //Exercise 4

        int aim = 7;
        int loseWeight1 = 250;
        int loseWeight2 = 500;

        int countOfDays1 = (aim * 1000) / loseWeight1;
        int countOfDays2 = (aim * 1000) / loseWeight2;

        int average = (countOfDays1 + countOfDays2) / 2;
        System.out.println("Среднее кол-во дней для похудения: " + average);

        //Exercise 5

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        double mashasIncrease = masha * 0.1;
        double denisesIncrease = denis * 0.1;
        double kristinasIncrease = kristina * 0.1;

        double newMasha = masha + mashasIncrease;
        double newDenis = denis + denisesIncrease;
        double newKristina = kristina + kristinasIncrease;

        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + mashasIncrease + " рублей.");
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + denisesIncrease + " рублей.");
        System.out.println("Кристина теперь получает " + newKristina + " рублей. Годовой доход вырос на " + kristinasIncrease + " рублей.");

    }
}
