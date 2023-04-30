package com.sindhu.PBO.pertemuan3;

public class Price {
    private int harga;

    public Price(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void shpwInfo() {
        System.out.println("Harga : " + harga);
        System.out.println();
    }
}
