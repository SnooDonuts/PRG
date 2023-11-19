package Tests.test3prepare;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Write which task do you want to exacute(1, 6 and -1 will execute every task):");
        Scanner s = new Scanner(System.in);
        int u = s.nextInt();
        if (u == -1) {
            u1234(u);
            u5();
        } else if (u > 0 && u < 5) {
            u1234(u);
        } else if (u == 5) {
            u5();
        } else if (u == 6) {
          b();
        }
    }

    public static void u1234(int u) {
        Scanner s = new Scanner(System.in);
        System.out.println("Napiš číslo z oboru celých čísel");
        int n = s.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            int r = (int) (Math.random() * 101);
            arr[i] = r*r;
        }
        switch (u){
            case 1:
                System.out.println(Arrays.toString(arr));
                break;
            case 2:
                int odd = 0;
                int even = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 == 0) {
                        even += arr[i];
                    } else {
                        odd += arr[i];
                    }
                }
                System.out.println("Součet lichých čísel " + Integer.toString(odd));
                System.out.println("Součet sudých čísel " + Integer.toString((even)));
                break;
            case 3:
                double[] sqrtArr;
                sqrtArr = new double[n];
                for (int i = 0; i < n; i++) {
                    sqrtArr[i] = Math.sqrt(Double.valueOf(arr[i]));
                }
                System.out.println(Arrays.toString(arr));
                System.out.println(Arrays.toString(sqrtArr));
                break;
            case 4:
                System.out.println(Arrays.toString(arr));
                System.out.println("Jaké číslo chceš vyhledat?");
                int num = s.nextInt();
                int count = 0;
                System.out.println("Indexy");
                for (int i = 0; i < n; i++) {
                    if (arr[i] == num) {
                        System.out.println(i);
                        count++;
                    }
                }
                System.out.println(Integer.toString(num) + " se vyskytuje "+ Integer.toString(count)+ " krát");
        }

    }


    public static void u5() {
        Scanner s = new Scanner(System.in);
        System.out.println("Napiš 10 čísel od 10 do 100");
        int[] arr;
        arr = new int[10];
        int count = 0;
        while (count < arr.length) {
            int num = s.nextInt();
            if  (num > 10 && num < 100) {
                arr[count] = num;
                count++;
            } else {
                System.out.println("Špatné číslo");
            }
        }
        System.out.println("Hotovo\n" + Arrays.toString(arr));
    }

    public static void b() {

    }
}
