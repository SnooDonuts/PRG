package Tests.test3;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Write which task do you want to exacute(1, 3 and -1 will execute every task):");
        Scanner s = new Scanner(System.in);
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

    public static  void u1() {
        System.out.println("U1");
        int[] arr;
        boolean vyznamenani = true;
        double avg = 0;
        arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = (int) (Math.random() * 5 + 1);
            if (arr[i] > 2) {
                vyznamenani = false;
            }
            avg += arr[i];
        }
        avg /= arr.length;
        if (avg >= 1.5) {
            vyznamenani = false;
        }
        System.out.println(vyznamenani);
    }
    public static  void u2() {
        System.out.println("U2");
        int[] arr = new int[20];
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            arr[i] = (int) (Math.random() * 201 - 100);
            sum += arr[i];
        }
        if (sum < 0) {
            System.out.println("\u001B[41m" + Integer.toString(sum) + "\u001B[0m ");
        } else {
            System.out.println(Integer.toString(sum));
        }
    }
    public static  void u3() {
        System.out.println("U3");
        int[] arr = new int[50];
        int min = 101;
        for (int i = 0; i < 7; i++) {
            arr[i] = (int) (Math.random() * 201 - 100);
            if (arr[i] > 0 && min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
