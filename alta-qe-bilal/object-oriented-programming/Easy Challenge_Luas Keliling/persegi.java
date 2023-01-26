public class persegi {
    int sisi;

    public persegi(int sisi) {
        this.sisi = sisi;
    }

    public int menghitungLuasPersegi() {
        return
                this.sisi * this.sisi;
    }

    public int menghitungKelilingPersegi() {
        return
                4 * this.sisi;
    }
}
