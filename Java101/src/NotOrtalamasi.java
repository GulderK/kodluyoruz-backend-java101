import java.sql.SQLOutput;
import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,turkce,fizik,tarih,muzik,kimya;
        Scanner sc=new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat=sc.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce=sc.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik=sc.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih=sc.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik=sc.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya=sc.nextInt();

        double ortalama =(mat+turkce+fizik+tarih+muzik+kimya)/6;
        System.out.println("Ortalamanız: "+ortalama);

        String sonuc=ortalama>60?"Sınıfı Geçti.":"Sınıfta Kaldı";
        System.out.println(sonuc);
    }
}
