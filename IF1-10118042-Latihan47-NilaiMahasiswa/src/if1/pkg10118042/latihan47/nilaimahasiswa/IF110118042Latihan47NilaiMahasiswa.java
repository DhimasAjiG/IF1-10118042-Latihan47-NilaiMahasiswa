
package if1.pkg10118042.latihan47.nilaimahasiswa;

import java.util.Scanner;
/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk Menentukan Index Nilai Mahasiswa
 */
public class IF110118042Latihan47NilaiMahasiswa {

    
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        
        Index objI = new Index();
        
        System.out.print("QUIZ : ");
        objI.setQuis(sc1.nextDouble());
        System.out.print("UTS : ");
        objI.setUts(sc2.nextDouble());
        System.out.print("UAS : ");
        objI.setUas(sc3.nextDouble());
        
        System.out.println("");
        System.out.println("Nilai Akhir = "+objI.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");
    }
    
}
