package cv3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int money = 100;
        Scanner s = new Scanner(System.in);
        int loses = 0;
        int wins = 0;
        boolean keepGambling = s.nextBoolean();

        while (keepGambling){
            int a = (int) (Math.random() * 3 + 1);
            int b = (int) (Math.random() * 3 + 1);
            int c = (int) (Math.random() * 3 + 1);

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

            if (a == b && a == c) {
                System.out.println("Win");
                money += 30;
                wins += 1;
            }
            else {
                System.out.println("Lose");
                money -= 15;
                loses += 1;
            }
            System.out.println(money);
            keepGambling = s.nextBoolean();
        }
        System.out.println("Výhry");
        System.out.println(wins);
        System.out.println("Prohry");
        System.out.println(loses);
        System.out.println("Racio");
        System.out.println((double) wins/loses * 100.0);

    }
}