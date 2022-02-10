/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod.pkg8;

/**
 *
 * @author akmal
 */
public class DriverBangunDatar {
    
    public static void main(String[] args) {
        segitigaSamaKaki segitiga_2 = new segitigaSamaKaki();
        segitiga_2.Segitiga(10, 12);
        System.out.println("Luas Segitiga adalah: " + segitiga_2. hitungluas());
    }
    
    public static void main(String[] args){
        String s = PersegiPanjang.showDialog(null, "15, 8");
        System.out.println("Luas PersigiPanjang: " + PersegiPanjang. hitungluas());
            sisi = Double.parseDouble(s);
            hasil = 4*sisi;
            System.out.println(hasil);
    }
}
