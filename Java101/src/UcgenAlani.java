import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        int a,b,c;
        double alan;

        Scanner sc=new Scanner(System.in);

        System.out.print("Üçgenin birinci kenarını giriniz: ");
        a=sc.nextInt();

        System.out.print("Üçgenin ikinci kenarını giriniz: ");
        b=sc.nextInt();

        System.out.print("Üçgenin üçüncü kenarını giriniz: ");
        c=sc.nextInt();

        double u= (a+b+c)/2;
        alan=Math.sqrt((u*(u-a)*(u-b)*(u-c)));

        System.out.println("Üçgenin alanı: "+alan);

    }

}