import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double kmFiyat=2.2,acilis=10.0,minUcret=20.0,ucret,odenecekTutar,mesafe;

        Scanner sc=new Scanner(System.in);

        System.out.print("Lütfen gidilen mesafeyi giriniz: ");
        mesafe=sc.nextDouble();

        ucret=acilis+mesafe*kmFiyat;

        //Ucret 20'den kucuk ise min ucret odenir. Eger 20'den fazla ise hesaplanan ucret odenir.
        odenecekTutar=ucret<minUcret?minUcret:ucret;

        System.out.println("Taksimetre tutarı: "+odenecekTutar);

    }
}
