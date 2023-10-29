package Curriculum.Conditions;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 60);
        System.out.println(num);
        int inNum = -1;

        while (num != inNum) {
            System.out.println("Napiš číslo!");
            Scanner s = new Scanner(System.in);
            inNum = s.nextInt();

            if (num > inNum) {
                System.out.println("Moc malé číslo");
            } else if (num < inNum) {
                System.out.println("Moc velké číslo");
            }
        }
        System.out.println("Nice");
    }
}