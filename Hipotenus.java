import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {

        double a, b, c;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ucgenin birinci dik kenarini giriniz: ");
        a = sc.nextDouble();
        System.out.print("Ucgenin ikinci dik kenarini giriniz: ");
        b = sc.nextDouble();

        // C^2 = A^2 + B^2
        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenus: " + c);

        int[] scores = new int[10];

    }
}
