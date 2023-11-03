package Tests.Test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write which task do you want to exacute(1, 3 and -1 will execute every task):");
        int u = s.nextInt();
        switch (u) {
            case -1:
                u1();
                u2();
                u3();
                break;
            case 1:
                u1();
                break;
            case 2:
                u2();
                break;
            case 3:
                u3();
                break;
        }
    }

    public static void u1() {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("\nTask 1: average of numbers");
        n = s.nextInt();
        double avg = (double) n;
        while (n != -1.0) {
            avg = (avg + n)/2;
            System.out.println("Write number");
            n = s.nextInt();
        }
        System.out.println("Final avg is "+avg);
    }

    public static void u2() {
        System.out.println("\nTask 2: number of generated 42");
        int n = 0;
        int c = 0;
        while (n < 1000) {
            int r = ((int) (Math.random() * 101));
            System.out.println(r);
            n += r;
            c++;
        }
        System.out.println(n + " " + c);
    }

    public static void u3() {
        Scanner s = new Scanner(System.in);
        System.out.println("\nTask 3: Sum");
        System.out.println("Write number");
        int n = s.nextInt();
        int sum = n;
        for (int i = n-1; i > 0; i--) {
            sum += i;
        }
        System.out.println("Sum "+n+" is "+sum);
    }

}