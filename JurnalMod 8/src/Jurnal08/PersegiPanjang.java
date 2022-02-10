/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jurnal08;

/**
 *
 * @author akmal
 */
public class PersegiPanjang extends BangunDatar {
   private int panjang = 15;
   private int lebar = 8;
   
   public void PersegiPanjang(String nama, int p, int l){
       this.p = panjang;
       this.l = lebar;
   }
   
   public void getLebar(){
     return l;  
   }
   public void getPanjang(){
     return p;  
   }
   public void hitungKeliling(double sisi, double hasil){
       this.sisi = sisi;
       this.hasil = hasil;
   }
    public void hitungLuas(double jari_jari, double tinggi_tabung, double phi){
       this.phi = phi;
       this.jari_jari = jari_jari;
       this.tinggi_tabung = tinggi_tabung;
    }
    public void setLebar(int l){
        this.l = l;
    }
    public void setPanjang(int p){
        this.p = p;
    }
}
