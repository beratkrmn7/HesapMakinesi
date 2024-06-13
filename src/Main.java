import java.util.Scanner;

import static javax.management.Query.times;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secim;
        java.lang.String menu = "1- TOPLAMA\n"
                + "2- ÇIKARMA\n"
                + "3- ÇARPMA\n"
                + "4- BÖLME\n"
                + "5- ÜS ALMA\n"
                + "6- KÖK ALMA\n"
                + "7- FAKTORİYEL\n"
                + "8- ÇIKIŞ YAP";
        System.out.println(menu);
        do {
            System.out.print("Lütfen bir işlem seçiniz :");
            secim = scan.nextInt();
            switch (secim) {
                case 1:
                    HesapMakinesi.toplama();
                    break;
                case 2:
                    HesapMakinesi.cıkarma();
                    break;
                case 3:
                    HesapMakinesi.carpma();
                    break;
                case 4:
                    HesapMakinesi.bölme();
                    break;
                case 5:
                    HesapMakinesi.üsAlma();
                    break;
                case 6:
                    HesapMakinesi.kökAlma();
                    break;
                case 7:
                    HesapMakinesi.faktoriyel();
                    break;
                case 8:
                    System.out.println("Çıkış yapılıyor!..");
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (secim != 8);


    }
}
