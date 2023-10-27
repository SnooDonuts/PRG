package BinarySearch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 30;
        int arr[];
        arr = new int[num];

        int idx = num / 2;
        int ranNum = arr[(int) (Math.random() * num-1)];
        int steps;

        for (int i = 0; i < num; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);

        System.out.println("Random number from arr");
        System.out.println(ranNum);

        while (idx != ranNum) {

        }
    }
}