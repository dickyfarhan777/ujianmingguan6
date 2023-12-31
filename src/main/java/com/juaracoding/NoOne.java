package com.juaracoding;

import java.util.Scanner;

public class NoOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka Terakhir: ");
        int angka = input.nextInt();

        mencariBizzBuzz(angka);
    }

    public static void mencariBizzBuzz(int n) {
        for (int i = 0; i <= n; i++) {
            if (i %3==0 && i%5==0){
                 System.out.println("BIZZBUZZ");
            } else if (i %3==0) {
                 System.out.println("BIZZ");
            } else if (i %5==0) {
                System.out.println("BUZZ");
            }else {
                System.out.println(i);;
            }
        }
    }
}
