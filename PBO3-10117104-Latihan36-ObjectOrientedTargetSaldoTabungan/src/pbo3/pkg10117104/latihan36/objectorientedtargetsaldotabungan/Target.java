/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan36.objectorientedtargetsaldotabungan;

/**
 *
 * @author 
 * Nama : Aditya Suheryana
 * Nim : 10117104
 * Kelas : IF-3/PBO3
 * Deskripsi Program :  Program Menampilkan Hasil dari 
 * Saldo target dengan input Saldo Awal,bunga,dan saldoTarget 
 * secara object oriented
 */
public class Target {
    public int saldo;
    public int bunga;

    public double hitungBunga(int parSaldo, int parBunga){
        return parSaldo*parBunga/100;
    }
    public void hitungLamaSaldoTarget(int parSaldo, int parSaldoTarget){
        int i = 1;
        while (parSaldo <= parSaldoTarget) {
            hitungBunga(parSaldo,bunga);
            parSaldo += hitungBunga(parSaldo, bunga);

            //format dan tampilkan output
            String mataUang = String.format("Rp.%,3d", parSaldo).
                    replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
            i++;
        }
    }  
}
