//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //CASE1//
        System.out.println("CASE 1");
        int result = 2_459_000;
        int savings = 15000;
        int month = 0;

        while (month * savings <= result) {
            month++;
            int total = month * savings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        System.out.println("     ");
        }

        //CASE2//
        System.out.println("CASE 2");
        int start = 1;
        while (start > 0 && start < 11) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();
        int startTwo = 10;
        for (; startTwo > 0 && startTwo < 11; startTwo--) {
            System.out.print(startTwo + " ");
        }
        System.out.println("     ");

        //CASE3//
        System.out.println("     ");
        System.out.println("CASE 3");
        int totalPop = 12_000_000;
        int born = 17;
        int dead = 8;
        int amount = 1000;
        int years = 0;
        while (years < 10) {
            years++;
            totalPop = totalPop + ((born - dead) * 1000);
            int total = month * savings;
            System.out.println("Год " + years + ", численность населения составляет " + totalPop);
            System.out.println("     ");
        }

        //CASE4//
        System.out.println("     ");
        System.out.println("CASE 4");
        int resultTwo = 12_000_000;
        int money = 15000;
        float percent = 0.07F;
        int monthTwo = 0;

        while (money < resultTwo) {
            monthTwo++;
            money = (int) (money + money * percent);
            System.out.println("Месяц " + monthTwo + ", сумма накоплений равна " + money + " рублей");
            System.out.println("     ");
        }

        //CASE5//
        System.out.println("CASE 5");
        int resultThree = 12_000_000;
        int moneyTwo = 15000;
        float percentTwo = 0.07F;
        int monthThree = 0;

        while (moneyTwo < resultThree) {
            monthTwo++;
            moneyTwo = (int) (moneyTwo + moneyTwo * percentTwo);

            if (monthThree % 6 == 0) {
                System.out.println("Месяц " + monthThree + ", сумма накоплений равна " + moneyTwo + " рублей");
        System.out.println("     ");
            }

        //CASE6//



        }



    }


}
