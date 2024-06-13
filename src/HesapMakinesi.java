import java.util.Scanner;

public class HesapMakinesi {

    static Scanner scan = new Scanner(System.in);

    static void toplama() {
        System.out.print("Lütfen toplamak istediğiniz sayı adedini giriniz: ");
        int toplam = 0;
        int sayıAdedi = scan.nextInt();
        for (int i = 0; i < sayıAdedi; i++) {
            System.out.print("Lütfen " + (i + 1) + ". sayıyı giriniz:");
            toplam += scan.nextInt();
            System.out.println("Sayıların toplamı: " + toplam);
        }
    }


    static void cıkarma() {
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        int ilkSayı = scan.nextInt();
        System.out.print("Lütfen 2. sayıyı giriiniz: ");
        int ikinciSayı = scan.nextInt();
        int sonuc = ilkSayı - ikinciSayı;
        System.out.println("Çıkarma işleminin sonucu: " + sonuc);
    }


    static void carpma() {
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        int ilkSayı = scan.nextInt();
        System.out.print("Lütfen 2. sayıyı giriiniz: ");
        int ikinciSayı = scan.nextInt();
        int sonuc = ilkSayı * ikinciSayı;
        System.out.println("Çarpma işleminin sonucu: " + sonuc);

    }


    static void bölme() {
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        int ilkSayı = scan.nextInt();
        System.out.print("Lütfen 2. sayıyı giriiniz: ");
        int ikinciSayı = scan.nextInt();
        if (ikinciSayı == 0) {
            System.out.println("Payda 0 olamaz");
        } else {
            double sonuc = 1.0*ilkSayı / ikinciSayı;
            System.out.println("Bölme işleminin sonucu: " + sonuc);
        }

    }


    static void üsAlma() {
        int sonuc = 1;
        System.out.print("Lütfen taban giriniz: ");
        int taban = scan.nextInt();
        System.out.print("Lütfen üs giriniz: ");
        int üs = scan.nextInt();

        for (int i = 1; i < üs + 1; i++) {
            sonuc *= taban;
        }
        System.out.println(taban + "^" + üs + " işleminin sonucu: " + sonuc);
    }


    static void kökAlma() {
        System.out.print("Lütfen kök içindeki sayıyı giriniz: ");
        int kökIc = scan.nextInt();
        System.out.print("Lütfen kökün derecesini giriniz: ");
        int derece = scan.nextInt();
        double sonuc = Math.pow(kökIc, 1.0 / derece);
        System.out.println("İşleminin sonucu: " + sonuc);

    }


    static void faktoriyel() {
        System.out.print("Lütfen faktoriyelini alınmasını istediğiniz sayıyı giriniz: ");
        int sayı = scan.nextInt();
        int sonuc = 1;
        while (sayı > 0) {
            sonuc *= sayı;
            sayı -= 1;
        }
        System.out.println("Sonuç: " + sonuc);

    }
}
