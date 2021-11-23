import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kilo Değerinizi Giriniz:");
        double kiloDeğeri = scan.nextDouble();

        System.out.println("Boy değerinizi giriniz (1.75 şeklinde):");
        double boy = scan.nextDouble();

        double vucutKitleIndeksi = kiloDeğeri / (boy * boy);

        vucutKitleIndeksi = (int) vucutKitleIndeksi;

        if (vucutKitleIndeksi < 18) {
            System.out.println("Zayıfsınız. Vücut kitle indeksiniz: " + vucutKitleIndeksi);
        } else if (vucutKitleIndeksi >= 18.5 && vucutKitleIndeksi <= 24.9) {
            System.out.println("Normal kilolusunuz. Vücut kitle indeksiniz: " + vucutKitleIndeksi);
        } else if (vucutKitleIndeksi >= 25 && vucutKitleIndeksi <= 29.9) {
            System.out.println("Fazla kilolusunuz. Vücut kitle indeksiniz: " + vucutKitleIndeksi);
        } else if (vucutKitleIndeksi >= 30 && vucutKitleIndeksi <= 39.9) {
            System.out.println("Obezsiniz. Vucut kitle indeksiniz." + vucutKitleIndeksi);
        }


    }
}
