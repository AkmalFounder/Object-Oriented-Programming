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
public class BangunDatar {
    private String nama;
    
    public BangunDatar(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
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
    public void setNama(String nama){
        this.nama= nama;
    }
}
