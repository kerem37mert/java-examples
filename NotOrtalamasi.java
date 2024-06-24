import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float matematik, fizik, kimya, turkce, tarih, muzik;
        float ortalama;

        // Matematik
        System.out.println("Matemetik notunuzu giriniz:");
        matematik = sc.nextFloat();

        // Fizik
        System.out.println("Fizik notunuzu giriniz");
        fizik = sc.nextFloat();

        // Kimya
        System.out.println("Kimya notunuzu giriniz");
        kimya = sc.nextFloat();

        // Türkce
        System.out.println("Türkce notunuzu giriniz");
        turkce = sc.nextFloat();

        // Tarih
        System.out.println("Tarih notunuzu giriniz");
        tarih = sc.nextFloat();

        // Muzik
        System.out.println("Muzik notunuzu giriniz");
        muzik = sc.nextFloat();

        ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 5;

        // Output
        System.out.println(ortalama);
    }
}
