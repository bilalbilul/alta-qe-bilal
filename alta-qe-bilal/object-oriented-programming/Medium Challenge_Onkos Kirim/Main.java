import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Panjang: ");
        int p = input.nextInt();
        System.out.println("Masukan Lebar: ");
        int l = input.nextInt();
        System.out.println("Masukan Tinggi: ");
        int t = input.nextInt();
        System.out.println("Masukan Berat: ");
        int kg = input.nextInt();
        rumus harga = new rumus();
        harga.setP(p);
        harga.setL(l);
        harga.setT(t);
        harga.setKg(kg);
        System.out.println("Volume barang adalah: "+harga.volumeBarang()+" cm3");
        System.out.println("Harga Ongkos Kirimnya Adalah: Rp. "+harga.finalOngkir());
    }
}