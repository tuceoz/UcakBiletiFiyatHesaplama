import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yas, yon;
        double kmUcret, km, toplamTutar;

        kmUcret = 0.1;

        System.out.print("Yaşınız: ");
        yas = input.nextInt();

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextDouble();

        System.out.print("Yolculuk tipini seçiniz(Tek yön => 1 , Gidiş dönüş => 2 : ");
        yon = input.nextInt();

        toplamTutar = km * kmUcret;

        if(yas < 12){
            toplamTutar = toplamTutar * 0.5;
        };

        if(yas <= 24 && yas >= 12){
            toplamTutar = toplamTutar * 0.9;
        };

        if(yas >= 65){
            toplamTutar = toplamTutar * 0.7;
        };

        switch (yon){
            case 1:
                toplamTutar = toplamTutar;
                break;
            case 2:
                toplamTutar *= 0.8;
                break;
        }

        if(km <= 0 || yas <= 0){
            System.out.println("Hatalı giriş yaptınız!");
        } else{
            System.out.println("Toplam tutar: " + toplamTutar);
        };
    }
}