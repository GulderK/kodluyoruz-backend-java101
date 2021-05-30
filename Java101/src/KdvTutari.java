import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        double para,kdv,kdv1=0.18,kdv2=0.08,kdvTutari,kdvliFiyat;
        Scanner sc=new Scanner(System.in);

        System.out.print("Lütfen KDV'siz para miktarını giriniz: ");
        para=sc.nextDouble();

        kdv=para<1000?kdv1:kdv2;
        kdvTutari=para*kdv;
        kdvliFiyat=para+kdvTutari;

        System.out.println("KDV'siz Fiyat: "+para);
        System.out.println("KDV Oranı: "+kdv);
        System.out.println("KDV Tutarı: "+kdvTutari);
        System.out.println("KDV'li Fiyat: "+kdvliFiyat);

    }
}
