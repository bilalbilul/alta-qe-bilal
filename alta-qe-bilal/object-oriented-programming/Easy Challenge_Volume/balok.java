public class balok {
    int panjang;
    int lebar;
    int tinggi;

    public balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public int menghitungVolumeBalok(){
        return
                panjang * lebar * tinggi;
    }
}
