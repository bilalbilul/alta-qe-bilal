import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        operasi1 perhitungan = new operasi1();
        perhitungan.setA(3);
        perhitungan.setB(4);
        System.out.println("hasil penjumlahan: "+perhitungan.hitungPenjumlahan());
        operasi2 perhitungan1 = new operasi2();
        perhitungan1.setA(15);
        perhitungan1.setB(4);
        System.out.println("hasil pengurangan: "+perhitungan1.hitungPengurangan());
        operasi3 perhitungan2 = new operasi3();
        perhitungan2.setA(12);
        perhitungan2.setB(3);
        System.out.println("hasil pembagian: "+ perhitungan2.hitungPembagian());
        operasi4 perhitungan3 = new operasi4();
        perhitungan3.setA(10);
        perhitungan3.setB(10);
        System.out.println("hasil perkalian: "+ perhitungan3.hitungPerkalian());
    }
}