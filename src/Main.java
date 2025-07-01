//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //CASE1//
        {
            System.out.println("CASE 1");
            int result = 2_459_000;
            int savings = 15000;
            int month = 0;
            int total = 0;

            while (total <= result) {
                month++;
                total = month * savings;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
            System.out.println();
        }


        //CASE2//
        {
            System.out.println("CASE 2");
            int start = 0;
            while (start < 11) {
                start++;
                System.out.print(start + " ");

            }
            System.out.println();
            for (int startTwo = 10; startTwo > 0 && startTwo < 11; startTwo--) {
                System.out.print(startTwo + " ");
            }
            System.out.println();
        }


        //CASE3//
        {
            System.out.println("     ");
            System.out.println("CASE 3");
            int totalPop = 12_000_000;
            int born = 17;
            int dead = 8;
            int amount = 1000;
            int years = 0;

            while (years < 10) {
                years++;
                totalPop = totalPop + ((born - dead) * amount);
                System.out.println("Год " + years + ", численность населения составляет " + totalPop);
            }
            System.out.println();
        }


        //CASE4//
        {
            System.out.println("CASE 4");

            int money = 15000;
            float percent = 0.07F;
            int monthTwo = 0;

            while (money < 12_000_000) {
                monthTwo++;
                money = (int) (money + money * percent);
                System.out.println("Месяц " + monthTwo + ", сумма накоплений равна " + money + " рублей");
            }
            System.out.println();
        }

        //CASE5//
        {
            System.out.println("CASE 5");
            int money = 15000;
            int monthTwo = 0;
            float percent = 0.07F;
            while (money < 12_000_000) {
                money = (int) (money + money * percent);
                monthTwo++;

                if (monthTwo % 6 == 0) {
                    System.out.println("Месяц " + monthTwo + ", сумма накоплений равна " + money + " рублей");
                }
            }
            System.out.println();
        }


        //CASE6//
        {
            System.out.println("CASE 6");
            int money = 15000;
            int monthTwo = 0;
            int year = 0;
            int total = money;
            float percent = 0.07F;
            for (monthTwo = 1; monthTwo <= 54; monthTwo++) {
                total += (int) (total * percent);
                if (monthTwo % 6 == 0) {
                    int halfYear = monthTwo / 6;
                    System.out.println("Полгода " + halfYear + ", сумма накоплений равна " + total);
                }
            }
            System.out.println();
        }


        //CASE7//
        {
            System.out.println("CASE 7");
            int friday = 5;
            int day = friday;
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            for (; day <= 31; ) {
                day++;
                if ((day - friday) % 7 == 0) {
                    System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
                }
            }
            System.out.println();
        }


        //CASE8//
        {
        System.out.println("CASE 8");
        int currentYear = 2025;
        int pastYear = currentYear - 200;
        int futureYear = currentYear + 100;

        for (int cometYear = 0; cometYear <= currentYear; cometYear += 79) {
            if (cometYear >= pastYear) {
                System.out.println(cometYear);
            }
        }
        for (int cometYear = currentYear + 1; cometYear <= futureYear; cometYear++) {
            if (cometYear % 79 == 0) {
                System.out.println(cometYear);
                break;
            }
            }
        }
    }
}
