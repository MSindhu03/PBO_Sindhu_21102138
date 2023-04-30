package com.sindhu.PBO.pertemuan4;

public class Manajer extends Pegawai{

    public void bonus(int bonus){
        System.out.println("Pegawai atas nama : " + nama + "(" + nip + ") Mendapat bonus sebesar RP " + bonus);
    }
    public void extraInfo(){
        System.out.println("Jabatan Pegawai : Manajer");
    }
    public void bonus(){
        System.out.println("Error : harap masukan jumlah bonusnya!");
    }
}
