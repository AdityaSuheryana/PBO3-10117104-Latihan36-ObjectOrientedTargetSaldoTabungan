/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan36.objectorientedtargetsaldotabungan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Aditya Suheryana
 * Nim : 10117104
 * Kelas : IF-3/PBO3
 * Deskripsi Program : Program Menampilkan Hasil dari 
 * Saldo target dengan input Saldo Awal,bunga,dan saldoTarget 
 * secara object oriented
 * 
 */
public class PBO310117104Latihan36ObjectOrientedTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Target tabung = new Target();
        System.out.printf("Saldo Awal : Rp. ");   
        tabung.saldo = scn.nextInt();
        System.out.printf("bunga/bulan : ");
        tabung.bunga =scn.nextInt();
        System.out.printf("Saldo Target : Rp. ");
        int saldoTarget = scn.nextInt();

        tabung.hitungLamaSaldoTarget(tabung.saldo,saldoTarget);
    }
}
