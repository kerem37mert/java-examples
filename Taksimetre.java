import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        float kmTutar = 2.20f, minTutar = 20, acilis = 10, gidilenMesafe, tutar;

        Scanner sc = new Scanner(System.in);

        System.out.print("Gİdilen mesafeyi(KM) giriniz: ");
        gidilenMesafe = sc.nextFloat();
        
        tutar = acilis + (gidilenMesafe * kmTutar);

        if(tutar < 20)
            System.out.println("Tutar: " + 20);
        else
            System.out.println("Tutar: " + tutar);
    }
}   
