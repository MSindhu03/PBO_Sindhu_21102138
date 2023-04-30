package com.sindhu.PBO.pertemuan3;

public class Main {
    public  static void main(String[] args) {
        //Pembuatan Class
        SepedaMotor honda = new SepedaMotor("Honda","Vario 160",35000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha", "N Max", 40000000);
        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa Matic", 60000000);

        //Untuk menjalankan method
        honda.showInfo();
        yamaha.showInfo();
        vespa.showInfo();

        //Uji coba getter dan setter
        System.out.println("Motor Merk " + honda.getMerk() + " dengan tipe (sebelum) : " + honda.getTipe());
        honda.setTipe("Beat 110");
        System.out.println("Motor Merk " + honda.getMerk() + " dengan tipe (sesudah) : " + honda.getTipe());
    }
}
