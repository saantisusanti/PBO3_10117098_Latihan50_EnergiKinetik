/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan50_energikinetik;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Menghitung Energi Kinetik dan Usaha
 */
public class EnergiKinetik {
    public double massa;
    public double kecepatan;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergi(){
        return 0.5 * massa * kecepatan *kecepatan;
    }
    
    public double hitungUsaha(){
        return 0.5 * massa * kecepatan * kecepatan - 0.5 * massa * 0 * 0;
    }
}
