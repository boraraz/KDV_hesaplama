import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        double fiyat, kdv, total;

        Scanner scan = new Scanner(System.in);

        System.out.print("Fiyat giriniz: ");
        fiyat = scan.nextDouble();

        if(0<fiyat && fiyat<=1000){
            //KDV %18
            kdv = fiyat * 18 / 100;
        }
        else{
            //KDV %8
            kdv = fiyat * 8 / 100;
        }

        total = kdv + fiyat;

        System.out.println("Girilen fiyat: " + fiyat);
        System.out.println("Hesaplanılan KDV tutarı: " + kdv);
        System.out.println("Toplam Tutar (Fiyat + KDV): " + total);
    }
}
