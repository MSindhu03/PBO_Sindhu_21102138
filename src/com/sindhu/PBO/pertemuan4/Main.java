package com.sindhu.PBO.pertemuan4;

public class Main {
    public static void main(String[] args){
        Manajer manajerkami = new Manajer();
        Pegawai pegawaikami = new Pegawai();

        manajerkami.nip = 198067857;
        manajerkami.nama = "Hasan Sadikin";

        pegawaikami.nip = 206584344;
        pegawaikami.nama = "Ahmad Rohman";

        manajerkami.showInfo();
        manajerkami.extraInfo();
        manajerkami.bonus(1000000);
        manajerkami.bonus();

        pegawaikami.showInfo();
        pegawaikami.extraInfo();
    }
}
