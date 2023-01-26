import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan angka: ");
        angka = input.nextInt();
        System.out.println("faktor dari " + angka + " adalah=");
        for (int i=1; i <= angka;i++)
        {
            if (angka%i == 0)
            {
                System.out.println(i + "");
            }
        }
    }
}