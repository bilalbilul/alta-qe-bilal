public class persegipanjang {
int panjang;
int lebar;

    public persegipanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int menghitungLuasPersegiPanjang() {
        return
                this.panjang * this.lebar;
    }

    public int menghitungKelilingPersegiPanjang() {
        return
                (2*this.panjang)+(2*this.lebar);
    }
}
