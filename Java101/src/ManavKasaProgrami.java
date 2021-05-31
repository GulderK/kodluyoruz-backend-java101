import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armutFiyat=2.14,elmaFiyat=3.67,muzFiyat=0.95,domatesFiyat=1.11,patlicanFiyat=5;
        double armutKilo,elmaKilo,muzKilo,domatesKilo,patlicanKilo,toplam;

        Scanner sc=new Scanner(System.in);

        System.out.print("Alınan armut kilogram değerini giriniz: ");
        armutKilo=sc.nextDouble();

        System.out.print("Alınan elma kilogram değerini giriniz: ");
        elmaKilo=sc.nextDouble();

        System.out.print("Alınan muz kilogram değerini giriniz: ");
        muzKilo=sc.nextDouble();

        System.out.print("Alınan domates kilogram değerini giriniz: ");
        domatesKilo=sc.nextDouble();

        System.out.print("Alınan patlıcan kilogram değerini giriniz: ");
        patlicanKilo = sc.nextDouble();

        toplam=(armutKilo*armutFiyat)+(elmaKilo*elmaFiyat)+(muzKilo*muzFiyat)+(domatesKilo*domatesFiyat)+(patlicanKilo*patlicanFiyat);
        System.out.println("Toplam Tutar: "+toplam);
    }
}
