package Curriculum;

import java.util.Scanner;

public class FuniRandom {
    public static void main(String[] args) {
        int range = 100;
        /*Normální člověk verze*/
        int n = (int) (Math.random()*2*range-range);
        /*Retardovaný člověk lidl verze*/
        int n1 = (int) (Math.random()*range) * ((((((int) (Math.random()*range))%2)+1)*2)-3);
        /*Retardovaný člověk optimalizovaná verze*/
        int n2 = (int) (Math.random()*range) * ((int) (Math.random()*2)*2-1);
        System.out.println(n);
        System.out.println(n1);
        System.out.println(n2);
    }
}
