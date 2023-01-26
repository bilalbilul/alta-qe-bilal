public class tabung {
    int r;
    int t;

    public tabung(int r, int t) {
        this.r = r;
        this.t = t;
    }

    public double mengitungVolumeTabung(){
        return Math.ceil(Math.PI * (r * r) *t);
    }
}
