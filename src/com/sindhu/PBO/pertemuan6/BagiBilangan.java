package com.sindhu.PBO.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BagiBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukan bilangan pertama : ");
            int bilangan1 = input.nextInt();

            System.out.println("Masukan bilangan kedua : ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1 / bilangan2;
            System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil);
        }

        catch (InputMismatchException e) {
            System.out.println("Terjadi kesalahan : Input tidak valid, Harap masukan bilangan bulat!");
        }

        Scanner input2 = new Scanner(System.in);

        try {
            System.out.println("Masukan bilangan pertama : ");
            int bilangan3 = input2.nextInt();

            System.out.println("Masukan bilangan kedua : ");
            int bilangan4 = input2.nextInt();

            int hasil2 = bilangan3 / bilangan4;
            System.out.println(bilangan3 + " / " + bilangan4 + " = " + hasil2);
        }

        catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan : Input tidak valid, Pembagi tidak boleh nol!");
        }

        System.out.println("Proses selesai.");
    }
}
