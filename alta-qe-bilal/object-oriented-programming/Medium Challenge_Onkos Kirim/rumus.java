public class rumus extends index{

    final int hargaDefault = 5000;

    public int volumeBarang() {
        int v = this.p * this.l * this.t;
        return v;
    }

    public int hargaOngkir() {
        int hasilVolume = volumeBarang();
        if (hasilVolume <= 50) {
            return hargaDefault;
        } else {
            return finalOngkir();
        }
    }

    public int hargaOngkir2() {
        int beratKg = getKg();
        if (beratKg <= 1) {
            return hargaDefault;
        } else {
            return finalOngkir();
        }
    }

    public int finalOngkir(){
        int finalHarga = volumeBarang() & getKg();
        if (volumeBarang() >= 50 && getKg() >= 1);
        return finalHarga + 5000;
    }
}
