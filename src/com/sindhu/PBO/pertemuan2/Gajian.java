package com.sindhu.PBO.pertemuan2;

import java.util.Scanner;

public class Gajian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nama anda : ");
        String nama = input.nextLine();

        System.out.println("Gaji yang diterima oleh " + nama + " adalah sebagai berikut");

        System.out.println("Gaji = input bebas");
        int gaji = input.nextInt();
        System.out.println("Tunjangan = input bebas");
        int tunjangan = input.nextInt();
        double pajak = 0.0765;
        System.out.println("Pajak = 7,65%");

        int gaji_kotor = gaji + tunjangan;
        double pajak_negara = gaji_kotor * pajak;
        double gaji_bersih = gaji_kotor - pajak_negara;

        System.out.println("Total Gaji bersih dari " + nama + " yang diterima yaitu " + gaji_bersih);
    }
}
