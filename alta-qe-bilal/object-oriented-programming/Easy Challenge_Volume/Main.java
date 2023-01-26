public class Main {
    public static void main(String[] args) {

        kubus kubus = new kubus(10);
        System.out.println("Volume Kubus: "+kubus.menghitungVolumeKubus());

        balok balok = new balok(3, 6, 10);
        System.out.println("Volume Balok: "+balok.menghitungVolumeBalok());

        tabung tabung = new tabung(7, 10);
        System.out.println("Volume Tabung: "+tabung.mengitungVolumeTabung());
    }
}