package test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*1.*/
        System.out.println("Input num!");
        int num = s.nextInt();
        if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Divisiblen't by 5");
        }

        /*2. A*/
        int dice1 = (int) (Math.random() * 5 + 1);
        int dice2 = (int) (Math.random() * 5 + 1);
        if ((dice1 + dice2 >= 10) || (dice1 == dice2)) {
            System.out.println("Win");
        } else {
            System.out.println("Lose");
        }

        /*3.A*/
        System.out.println("Input num!");
        int inputA = s.nextInt();
        if ((inputA >= -100) && (inputA <= 100) && (inputA != 0)) {
            System.out.println("Spadá do");
        } else {
            System.out.println("Nespadá do");
        }

        /*3.B*/
        System.out.println("Input num!");
        int inputB = s.nextInt();
        if (!((inputB >= -100) && (inputB <= 100))) {
            System.out.println("Nespadá do");
        } else {
            System.out.println("Spadá do");
        }

        /*4.*/
        System.out.println("Input num!");
        int age = s.nextInt();
        double price = 100.0;
        if ((age >= 1 && age <= 12) || (age >= 70)) {
            price -= price * 0.4;
        } else if (age >= 13 && age <= 18) {
            price -= price * 0.2;
        }
        System.out.println("Price:");
        System.out.println(price);

        /*5.*/
        int pricePerMSquared = 640;
        System.out.println("Height:");
        int height = s.nextInt();
        System.out.println("Width:");
        int width = s.nextInt();
        System.out.println("Money:");
        int money = s.nextInt();

        if (height * width <= money) {
            System.out.println("Money gud");
        } else {
            System.out.println("Money gudn't");
        }

    }
}