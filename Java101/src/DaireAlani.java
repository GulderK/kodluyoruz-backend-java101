import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        double r,pi=3.14,aci,alan,cevre,alanDilim;

        Scanner sc=new Scanner(System.in);

        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        r=sc.nextDouble();

        System.out.print("Lütfen alanını bulmak istediğiniz daire diliminin açısını giriniz: ");
        aci=sc.nextDouble();

        cevre=2*pi*r;
        System.out.println("Dairenin çevresi: "+cevre);

        alan=pi*Math.pow(r,2);
        System.out.println("Dairenin alanı: "+alan);

        alanDilim=alan*aci/360;
        System.out.println("Daire dilimin alanı: "+alanDilim);

    }
}
