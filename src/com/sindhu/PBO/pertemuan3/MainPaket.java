package com.sindhu.PBO.pertemuan3;

public class MainPaket {
    public static void main(String[] args) {

        System.out.println("Paket DaGames Internet Provider : ");

        Paket reguler = new Paket("Reguler", "Up to 200mbps");
        Paket stream = new Paket("Stream", "up to 300mbps + Netflix premium");
        Paket zeus = new Paket("Zeus", "up to 500mbps + Integrated VPN");
        Price reguler$ = new Price(300000);
        Price stream$ = new Price(550000);
        Price zeus$ = new Price(800000);

        reguler.showInfo();
        reguler$.shpwInfo();
        stream.showInfo();
        stream$.shpwInfo();
        zeus.showInfo();
        zeus$.shpwInfo();

        System.out.println("Paket yang dibeli : ");
        System.out.println("Nama Paket : " + zeus.getNamapaket());
        System.out.println("Benefit : " + zeus.getBenefit());
        System.out.println("Harga : " + zeus$.getHarga() + "/Bulan");
    }
}
