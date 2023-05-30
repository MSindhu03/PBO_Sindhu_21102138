package com.sindhu.PBO.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukan bilangan : ");
            int bilangan1 = input.nextInt();

            System.out.println("Masukan pembagianya : ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1/bilangan2;
            System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil);
        }
//
//        catch (ArithmeticException | InputMismatchException e) {
//            System.out.println("Error gess, Tidak dapat di proses :)");
//        }

        // Multiple Catch
        catch (ArithmeticException e) {
            System.out.println("Error weh, Tidak bisa diproses!");
        }

        catch (InputMismatchException e) {
            System.out.println("Masukan angka saja yooo :)");
        }

        System.out.println("Proses sudah selesai yooo :)");
    }

}
