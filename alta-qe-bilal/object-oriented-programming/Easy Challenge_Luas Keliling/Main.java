public class Main {
    public static void main(String[] args) {

        persegi persegi = new persegi( 4);
        System.out.println("Luas Persegi: " + persegi.menghitungLuasPersegi());
        System.out.println("Keliling Persegi: " + persegi.menghitungKelilingPersegi());

        segitiga segitiga = new segitiga(3, 4);
        System.out.println("Luas Segitiga: " + segitiga.menghitungLuasSegitiga());
        System.out.println("Keliling Segitiga: " + segitiga.menghitungKelilingSegitiga());

        persegipanjang persegipanjang = new persegipanjang(7, 8);
        System.out.println("Luas Persegi Panjang: " + persegipanjang.menghitungLuasPersegiPanjang());
        System.out.println("Keliling Persegi Panjang: " + persegipanjang.menghitungKelilingPersegiPanjang());
    }
}