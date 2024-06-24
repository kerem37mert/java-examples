import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        float kilo, boy, endeks;

        Scanner input = new Scanner(System.in);

        // Boy
        System.out.print("Boyunuzu giriniz: ");
        boy = input.nextFloat();

        // Kilo
        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextFloat();

        endeks = kilo / (boy * boy);
        System.out.println("Vucut Kitle Endeksi: " + endeks);

    }
}