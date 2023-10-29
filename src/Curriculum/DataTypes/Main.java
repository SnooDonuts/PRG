package Curriculum.DataTypes;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 5);
        System.out.println(num);

        Scanner s = new Scanner(System.in);
        int inNum = s.nextInt();
    }
}