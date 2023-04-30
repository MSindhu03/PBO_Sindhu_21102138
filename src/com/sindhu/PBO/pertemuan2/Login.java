package com.sindhu.PBO.pertemuan2;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String Username;
        String Password;

        Username = "Muhammad Sindhu";
        Password = "2138";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Masukan Username : ");
        String username = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Masukan Password : ");
        String password = input2.nextLine();

        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("Login berhasil, silahkan masuk!");
        } else if (username.equals(Username)) {
            System.out.println("Silahkan login dengan username dan password yang sah!");
        } else if (password.equals(Password)) {
            System.out.println("Silahkan login dengan username dan password yang sah!");
        } else {
            System.out.println("Username dan password Anda salah");
        }
    }
}
