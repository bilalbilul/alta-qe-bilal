import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("DrawXYZ : ");
        int angka = input.nextInt();

        box(angka);
    }

    private static void box(int numbers){
        int posisi = 1;
        for (int j=0; j<numbers; j++){
            for (int i=0; i<numbers; i++) {
                System.out.print(isi(posisi));
                posisi++;
            }
            System.out.println();
        }
    }

    private static char isi(int posisi) {
        char result;
        if (posisi % 3 == 0){
            result = 'X';
        } else if (posisi % 2 == 0) {
            result = 'Z';
        } else {
            result = 'Y';
        }
        return result;
    }

}