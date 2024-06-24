import java.util.Scanner;

public class KdvHesaplayici {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float fiyat, kdvliFiyat;
        int kdv;

        System.out.print("Fiyati giriniz: ");
        fiyat = sc.nextFloat();
        
        kdv = fiyat > 1000 ? 8 : 18;
        
        kdvliFiyat = fiyat + (fiyat*kdv) / 100;

        System.out.println("KDV'li fiyat: " + kdvliFiyat);
    }
}