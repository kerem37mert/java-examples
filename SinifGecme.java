import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        int gecmeNotu = 55;
        int ortalama;

        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        matematik = sc.nextInt();
        
        System.out.print("Fizik notu: ");
        fizik = sc.nextInt();

        System.out.print("Turkce notu: ");
        turkce = sc.nextInt();

        System.out.print("Kimya notu: ");
        kimya = sc.nextInt();

        System.out.print("Muzik notu: ");
        muzik = sc.nextInt();

        ortalama = (matematik + fizik + turkce + kimya + muzik) / 5;

        if(ortalama >= 55)
            System.out.println("Ortalama: " + ortalama + " Sinifi gectiniz");
        else
            System.out.println("Ortalama: " + ortalama + "Sinifi gecemedeiniz");


    }
}
