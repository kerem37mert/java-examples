import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {

        double a, b, c, u, cevre, alan;  // u = cevre / 2

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ücgenin birinci kenarini giriniz: ");
        a = sc.nextDouble();

        System.out.print("Ücgenin ikinci kenarini giriniz: ");
        b = sc.nextDouble();

        System.out.print("Ücgenin ücüncü kenarini giriniz: ");
        c = sc.nextDouble();

        cevre = a + b + c;
        u = cevre / 2;

        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        
        System.out.println("Alan: " + alan);
    }
}