import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        float armutF = 2.14f, elmaF = 3.67f, domatesF = 1.11f, muzF = 0.95f, patlicanF = 5f;
        float armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplamFiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kac kilo? :");
        armutKg = input.nextFloat();

        System.out.print("Elma kac kilo? :");
        elmaKg = input.nextFloat();

        System.out.print("Domates kac kilo? :");
        domatesKg = input.nextFloat();

        System.out.print("Muz kac kilo? :");
        muzKg = input.nextFloat();

        System.out.print("Patlican kac kilo? :");
        patlicanKg = input.nextFloat();

        toplamFiyat = armutKg*armutF + elmaKg*elmaF + domatesKg*domatesF + muzKg*muzF + patlicanKg*patlicanF;
        System.out.println("Toplam Fiyat: " + toplamFiyat);

    }
}
