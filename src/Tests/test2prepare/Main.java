package Tests.test2prepare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write which task do you want to exacute(1, 5 and -1 will execute every task):");
        int u = s.nextInt();
        switch (u) {
            case -1:
                u1();
                u2();
                u3();
                u4();
                u5();
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
        }
    }

    /*Čtěte vstupy (celá čísla) od uživatele. Načítání vstupů uživatel ukončí zadáním čísla -1.
     Jakmile cyklus doběhne, vypište součet všech zadaných čísel. (Můžete předpokládat, že uživatel bude zadávat pouze a jedině čísla) */
    public static void u1() {
        Scanner s = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        System.out.println("\nTask 1: Sum of numbers");
        while (n != -1) {
            sum += n;
            System.out.println("Write number");
            n = s.nextInt();
        }
        System.out.println("Final sum is "+sum);
    }

    /*Pomocí cyklů vypočtěte faktoriál čísla.
        a.Použijte stejný mechanismus na vypočtení n-té mocniny čísla (Ano, jde to pomocí Math.pow(), ta ale je neefekƟvní a zároveň se jedná o jednoduchou metodu) */
    public static void u2() {
        Scanner s = new Scanner(System.in);
        System.out.println("\nTask 2: Factorial");
        System.out.println("Write number");
        int n = s.nextInt();
        int f = n;
        for (int i = n-1; i > 0; i--) {
            f *= i;
        }
        System.out.println("Factorial "+n+" is "+f);
    }

    /*Napište tipovací hru:
        a.Vygenerujte náhodné číslo od 1 do 100.
        b.Od uživatele budete číst tipy (celá čísla).
        c.Dle tipu od uživatele vypíšete, jestli zadal číslo moc malé nebo číslo moc velké.
        d.Pokud uživatel tipl správné číslo, ukončete program. */
    public static void u3() {
        Scanner s = new Scanner(System.in);
        int n = -1;
        int r = (int) (Math.random() * 101);
        System.out.println("\nTask 3: Guessing Game");
        while (n != r) {
            System.out.println("Write number");
            n = s.nextInt();
            if (n > r) {
                System.out.println("Too large");
            } else if (n < r) {
                System.out.println("Too small");
            }
        }
        System.out.println("Right");
    }

    /*Vygenerujte 100000x náhodné číslo od 1 do 100. Vypište, kolikrát padlo číslo 42.*/
    public static void u4() {
        System.out.println("\nTask 4: number of generated 42");
        int n = 0;
        for (int i = 100000; i > 0; i--) {
            if (42 == ((int) (Math.random() * 101))) {
                n += 1;
            }
        }
        System.out.println("42 was generated "+n);
    }

    /*Vypište matici (‚tabulku‘) nxn celých čísel od 1 do n2.
     Př: n = 3, vypíšu 3 x 3 hodnoty od 1 do 9, tj.:
      1    2    3
      4    5    6
      7    8    9
        //možná se bude hodit, co je Math.sqrt()... */
    public static void u5() {
        System.out.println("\nTask 5: Matrix n by n");
        Scanner s = new Scanner(System.in);
        System.out.println("Write number");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i*n+1; j < i*n+1+n; j++) {
                System.out.print(j + "\t");
            }
            System.out.print("\n");
        }
    }
}