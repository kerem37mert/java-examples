import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int number) {
        for (int i = 2; i < number/2; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number...");
        int number = sc.nextInt();

        if(isPrime(number))
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is not a prime number");

    }
}