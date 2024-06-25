import java.util.Scanner;

public class NumberSort {
    public static void main(String[] args) {
        int n1, n2, n3, temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        n1 = input.nextInt();

        System.out.print("Enter number 2: ");
        n2 = input.nextInt();

        System.out.print("Enter number 3: ");
        n3 = input.nextInt();

        if(n1 > n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }

        if(n2 > n3) {
            temp = n2;
            n2 = n3;
            n3 = temp;
        }

        if(n1 > n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }

        System.out.println(n1 + " " + n2 + " " +n3);
    }
}