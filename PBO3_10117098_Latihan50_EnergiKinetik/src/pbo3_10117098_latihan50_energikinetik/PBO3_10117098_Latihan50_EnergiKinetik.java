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
public class PBO3_10117098_Latihan50_EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnergiKinetik energi = new EnergiKinetik();
        energi.setMassa(145);
        energi.setKecepatan(25);
        
        System.out.println("a. Dengan massa " +energi.getMassa()+" g dan"
                + " kecepatan " +energi.getKecepatan() +" m/s, energi kinetik "
                        + "yang dihasilkan adalah " +energi.hitungEnergi() 
                +" joule");
        System.out.println("b. Usaha yang dilakukan bola untuk mencapai "
                + "ketinggian ini, jika dilakukan dalam keadaan diam adalah " 
                +energi.hitungUsaha() +" joule");
    }
    
}
