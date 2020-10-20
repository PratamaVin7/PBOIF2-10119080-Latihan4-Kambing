/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan4.kambing;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 */
public class PBOIF210119080Latihan4Kambing {

    public void tambahKambing() {
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " +
                         jumlahKambing);
    }
    
    public static void main(String[] args) {
        PBOIF210119080Latihan4Kambing kambingJantan = new 
        PBOIF210119080Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
