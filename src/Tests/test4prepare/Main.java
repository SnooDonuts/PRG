package Tests.test4prepare;

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
            case 4:
                u4();
                break;
            case 5:
                u5();
                break;
            case 6:
                u6();
                break;
            case 7:
                u7();
                break;
            case 8:
                u8();
                break;
            case 9:
                u9();
                break;
        }
    }

    public static void u1() {
        System.out.println("U1");
        String[] users = {"Jan", "Karel", "FranƟšek Dlouhojmenný", "Eva" };
        String userName = "Jan";
        Boolean founded = false;
        for (String name : users) {
            if (userName.equals(name)) {
                System.out.println("Nachází");
                founded = true;
                break;
            }
        }
        if (!founded) {
            System.out.println("Nenachází");
        }
    }

    public static void u2() {
        System.out.println("U2");
        String word = "Jnn";
        Boolean doubleLetter = false;
        for (int i = 0; i < word.length() - 1; i++) {
            System.out.println(word.charAt(i));
            if (word.charAt(i) == word.charAt(i + 1)) {
                System.out.println("Nachází");
                doubleLetter = true;
                break;
            }
        }
        if (!doubleLetter) {
            System.out.println("Nenachází");
        }
    }

    public static void u3() {
        System.out.println("U3");
        String word = "Jgrdshtjckvlbkn;hrxdtfgjkn";
        for (int i = 0; i < word.length() - 1; i++) {
            if (i % 2 == 0) {
                System.out.print(Character.toUpperCase(word.charAt(i)));
            } else {
                System.out.print(Character.toLowerCase(word.charAt(i)));
            }

        }
    }

    public static void u4() {
        System.out.println("U4");
        String věta = "Jgrdshtjckvlbkn hrxdtfgjkn";
        int count = 0;
        count = věta.split(" ").length;
        System.out.println(Arrays.toString(věta.split(" ")));
        System.out.println(Integer.toString(count));
    }

    public static void u5() {
        System.out.println("U5");
        String max = "";
        String[] names = {"Jan", "Karel", "FranƟšek Dlouhojmenný", "Pablo Diego José Francisco de Paula JuanNepomuceno María de los Remedios Cipriano de la Sanơsima Trinidad Ruiz y Picasso", "Eva" };
        for (String name : names) {
            if (name.length() > max.length()) {
                max = name;
            }
        }
        System.out.println(max);
    }

    public static void u6() {
        System.out.println("U6");
        int number = 123;
        int resultNumber = 0;
        for (int i = number; i != 0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;
        }
        System.out.println(resultNumber);
    }

    public static void u7() {
        Scanner s = new Scanner(System.in);
        System.out.println("U7");
        String name = "meme";
        String extension = s.nextLine();
        String fileName = name + "." + extension;
        System.out.println(fileName);
    }

    public static void u8() {
        System.out.println("U8");
        String str = "meme";
        String reverseStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reverseStr)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("not Palindrom");
        }
    }

    public static void u9() {
        System.out.println("U9");
        String text = "SOS";
        String[] morseCodes = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
                ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                int index = c - 'A';
                result.append(morseCodes[index]).append(" "); // Oddělení mezi jednotlivými písmeny
            } else {
                // Ignorování znaků, které nejsou písmena abecedy
                if (c != ' ') {
                    result.append(" "); // Pro oddělení neznámých znaků
                }
            }
        }
        System.out.println(result);
    }
}