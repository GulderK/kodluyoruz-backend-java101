import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double kilo,boy,vkm;

        Scanner sc=new Scanner(System.in);

        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kilo=sc.nextDouble();

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy=sc.nextDouble();

        vkm=kilo/(boy*boy);
        System.out.println("Vucüt kitle endeksiniz: "+vkm);

        String durum=vkm<18.9?"Zayıf":(vkm<24.9?"Normal":(vkm<29.9?"Toplu":(vkm<34.9?"Obez":"Mortal Obez")));
        System.out.println("Vucüt durumunuz: "+durum);
    }
}
